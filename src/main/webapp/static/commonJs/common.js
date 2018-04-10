$(function () {


    // ------------------------------- 为  绑定全选功能 ----------------
    // 全选的checkbox
    $("thead :checkbox").on("click", function (e) {
        var checkboxEle = $(this);
        var tableDiv = getBodyOfTableDiv(checkboxEle);
        if (checkboxEle.prop("checked")) {
            tableDiv.find("tbody :checkbox").prop("checked", true);
        } else {
            tableDiv.find("tbody :checkbox").prop("checked", false);
        }
    });

    // 单独的checkbox
    $("tbody :checkbox").on("click", function (e) {
        var checkboxEle = $(this);
        if (checkboxEle.prop("checked")) {
            // 检查是不是所有的都已被选中
            var checked = true;// tbody下所有的checkbox都被选中
            $.each(checkboxEle.closest("tbody").find(":checkbox"), function (index, obj) {
                if (!$(obj).prop("checked")) {
                    checked = false;
                    return false;
                }
            });
            if (checked) {
                getHeadOfTableDiv(checkboxEle).find("thead :checkbox").prop("checked", true);
            }
        } else {
            getHeadOfTableDiv(checkboxEle).find("thead :checkbox").prop("checked", false);
        }
    });

    function getBodyOfTableDiv(checkboxEle) {
        var tableDiv = checkboxEle.closest("div.dataTables_scroll").find("div.dataTables_scrollBody table");
        return tableDiv.size() > 0 ? tableDiv : checkboxEle.closest("table");
    }

    function getHeadOfTableDiv(checkboxEle) {
        var tableDiv = checkboxEle.closest("div.dataTables_scroll").find("div.dataTables_scrollHead table");
        return tableDiv.size() > 0 ? tableDiv : checkboxEle.closest("table");
    }

    var Wheight = $(window).height() -120 - $("#searchForm").height();
    $(".panel-body").css("height",Wheight);
    if("${page.pages}"=="0"){
        $(".fixed-table-pagination").prepend("<div class='alert alert-danger diyAlert'>无相关信息</div>")
        $(".panel-body").css("height","100%");
        $(window).resize(function () {
            $(".panel-body").css("height","100%")
        });
    }
    // ------------------------------- 绑定全选功能 结束 ----------------
});
$(window).resize(function () {
    if("${page.pages}"=="0"){
        $(".fixed-table-pagination").prepend("<div class='alert alert-danger diyAlert'>无相关信息</div>")
        $(".panel-body").css("height","100%");
        $(window).resize(function () {
            $(".panel-body").css("height","100%")
        });
        return;
    }
    var Wheight = $(window).height() -110 - $("#searchForm").height();
    $(".panel-body").css("height",Wheight)

});
/*$(document).ready(function() {
 //列表初始化
 $('.table-fqz').size() > 0 && $('.table-fqz').dataTable( {
 paging: false,
 info:false,
 ordering:false,
 searching: false,
 "scrollX": 200,
 "sScrollXInner" : "100%",
 //        "dom": "<'row'<'col-sm-6'l><'col-sm-6'f>><'row'<'col-sm-12'tr>><'row'<'col-sm-5'i><'col-sm-7'p>>",
 "language": {
 "url": basePath + "/res/datatables/chinese.lang"
 }
 });
 });*/

//-------------------获取上传框文件绝对路径------------
//FX获取文件路径方法
function readFileFirefox(fileBrowser) {
    try {
        netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
    }
    catch (e) {
//    alert('无法访问本地文件，由于浏览器安全设置。为了克服这一点，请按照下列步骤操作：(1)在地址栏输入"about:config";(2) 右键点击并选择 New->Boolean; (3) 输入"signed.applets.codebase_principal_support" （不含引号）作为一个新的首选项的名称;(4) 点击OK并试着重新加载文件');
        return;
    }
    var fileName = fileBrowser.value; //这一步就能得到客户端完整路径。下面的是否判断的太复杂，还有下面得到ie的也很复杂。
    var file = Components.classes["@mozilla.org/file/local;1"]
        .createInstance(Components.interfaces.nsILocalFile);
    try {
        // Back slashes for windows
        file.initWithPath(fileName.replace(/\//g, "\\\\"));
    }
    catch (e) {
        if (e.result != Components.results.NS_ERROR_FILE_UNRECOGNIZED_PATH) throw e;
//    alert("File '" + fileName + "' cannot be loaded: relative paths are not allowed. Please provide an absolute path to this file.");
        return;
    }
    if (file.exists() == false) {
//    alert("File '" + fileName + "' not found.");
        return;
    }


    return file.path;
}


//根据不同浏览器获取路径
function getvl(obj) {
    //判断浏览器
    var Sys = {};
    var ua = navigator.userAgent.toLowerCase();
    var s;
    (s = ua.match(/msie ([\d.]+)/)) ? Sys.ie = s[1] :
        (s = ua.match(/firefox\/([\d.]+)/)) ? Sys.firefox = s[1] :
            (s = ua.match(/chrome\/([\d.]+)/)) ? Sys.chrome = s[1] :
                (s = ua.match(/opera.([\d.]+)/)) ? Sys.opera = s[1] :
                    (s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.safari = s[1] : 0;
    var file_url = "";
    if (Sys.ie <= "6.0") {
        //ie5.5,ie6.0
        file_url = obj.value;
    } else if (Sys.ie >= "7.0") {
        //ie7,ie8
        obj.select();
        file_url = document.selection.createRange().text;
    } else if (Sys.firefox) {
        //fx
        //file_url = document.getElementById("file").files[0].getAsDataURL();//获取的路径为FF识别的加密字符串
        file_url = readFileFirefox(obj);
    } else if (Sys.chrome) {
        //  file_url = obj.value;
    }
    //alert(file_url);
    // document.getElementById("text").innerHTML="获取文件域完整路径为："+file_url;
    return file_url;
}
//去除chrome自动填表
function noAutoComplete() {
    if (navigator.userAgent.toLowerCase().indexOf("chrome") != -1) {
        var selectors = $("input");
        for (var i = 0; i < selectors.length; i++) {
            if ((selectors[i].type !== "submit") && (selectors[i].type !== "password") && (selectors.eq(i).attr("disabled") !== "disabled")) {
                selectors[i].disabled = true;
            }
        }
        setTimeout(function () {
            for (var i = 0; i < selectors.length; i++) {
                if (selectors[i].type !== "submit") {
                    selectors[i].disabled = false;
                }
            }
        }, 100)
    }
}
noAutoComplete();

//排序提交
function tableOrderSort(order, sort) {
    $("#order").val(order);
    $("#sort").val(sort);
    $("#searchForm").submit();
}

//input-select
//id为inputID，必填；
//data为下拉的数据，必填；data为数组字符串[{},{}]
//formID为当前form表单的ID，选填，，如果是bootstrapValidator验证则必填
//FieldName为input的Name，选填，如果是bootstrapValidator验证则必填
//showico是否显示编辑图片，showico为显示，默认不显示，选填
//serachWay 匹配方式，默认为模糊匹配，AR精确匹配
//downInput，下拉输入框默认显示；noShowInput不显示
function input_select(id, data, formId, FieldName, showico, serachWay, downInput,fn) {
	if($("#" + id).parent().find("ul.dataUl").length=="0"){
		   $("#" + id).attr("data", "input").parent().css("position", "relative").append("<ul data='ul' class='dataUl hide'></ul>");
	} 
    $("#" + id).parent().find("ul.dataUl").eq(0).html('');
    for (var i = 0; i < data.length; i++) {
        $("#" + id).parent().find("ul.dataUl").append("<li data-id='" + data[i].id + "' data-phone='" + data[i].phone + "' data-val='" + data[i].key + "'><span class='edit'></span><span class='remove'></span>" + data[i].va + "</li>")
    }
    if (downInput != "noShowInput") {
        $("#" + id).parent().find("ul.dataUl").append("<li data-class='addInput' class='addInput'><input class='form-control' id='addInput' type='text'></li>");
    }
    $("#" + id).parent().find("ul.dataUl").css("width", $("#" + id).css("width"));
    $("#" + id).parent().find("ul.dataUl li").find("span").addClass("hide");
    if (showico == "showico") {
        $("#" + id).parent().find("ul.dataUl li").find("span").removeClass("hide");
        $("#" + id).parent().find("ul.dataUl li").eq(0).find("span").addClass("hide");
    }
    if (serachWay == "AR") {
        //精确匹配
        $("#" + id).keyup(function () {
            if ($(this).val() != "") {
                $(this).parent().find("ul[data=ul] li").addClass("hide");
                for (var i = 0; i < $(this).parent().find("ul[data=ul] li").length; i++) {
                    if ($.trim($(this).parent().find("ul[data=ul] li").eq(i).text()) == $.trim($(this).val())) {
                        $(this).parent().find("ul[data=ul]").removeClass("hide");
                        $(this).parent().find("ul[data=ul] li").eq(i).removeClass("hide");
                    }
                }
            }
            if ($(this).val() == "") {
                // $("ul[data=ul] li").removeClass("hide")
            }
        })
    } else {
        $("#" + id).focus(function () {
            $(this).parent().find("ul.dataUl").removeClass("hide");
            if(fn){
                fn()
            }else{
                $(this).parent().find("ul.dataUl li").unbind('click').click(function () {
                    $(this).parent().parent().find("input[data=input]").val($.trim($(this).text()));
                    $(this).parent().addClass("hide");
                    if (formId && formId != "" && $(this).parent().parent().find("input[data=input]").attr('name') == FieldName) {
                        $("#" + formId).data('bootstrapValidator').updateStatus(FieldName, 'NOT_VALIDATED').validateField(FieldName)
                    }
                    if ($(this).parent().parent().find("input[data=input]").attr("id") == "mType") {
                        $("#mModel").val('');
                        $.post("/XF_j2ee/user/material/view/search/field/model.do", {type: $(this).text()}, function (data) {
                            if (data.code == 0) {
                                var dataCode = [];
                                var obj = {};
                                for (var i = 0; i < data.items.length; i++) {
                                    obj = {va: data.items[i].mModel};
                                    dataCode.push(obj)
                                }
                                input_select("mModel", dataCode, "", "", "", "", "noShowInput");
                            } else {
                                alertMsg(data.desc);
                            }
                        });
                    }

                });
            }
            SearchDate = [];
            for(var i=0;i<$(this).parent().find("ul.dataUl li").length;i++){
                SearchDate.push($.trim($(this).parent().find("ul.dataUl li").eq(i).text()));
            }
        }).blur(function () {
            //input blur延时处理，防止和ul li点击事件冲突
            setTimeout(function () {
                $(this).parent().find('ul.dataUl').addClass('hide')
            }.bind(this), 150)
        }).keyup(function () {
            //模糊匹配，显示匹配的结果
            if ($(this).val() != "") {
                $(this).parent().find("ul.dataUl li").addClass("hide");
                $(this).parent().find("ul.dataUl li.addInput").removeClass("hide");
                for (var i = 0; i < SearchDate.length; i++) {
                    for (var j = 0; j < SearchDate[i].length; j++) {
                        if (SearchDate[i].substr(j, $(this).val().length) == $(this).val()) {
                            $(this).parent().find("ul.dataUl li").eq(i).removeClass("hide");
                        }
                    }
                }
            }
            if ($(this).val() == "") {
                $(this).parent().find("ul.dataUl li").removeClass("hide")
            }
        });
    }
    $(".edit").click(function (e) {
        e.stopPropagation();
    });
    $(".remove").click(function (e) {
        e.stopPropagation();
    })
}
function input_select1(id, data, formId, FieldName, showico, serachWay, downInput, fn) {
    $("#" + id).attr("data", "inputD").parent().append("<ul data='ul' class='dataUl1 hide'></ul>");
    $("#" + id).parent().find("ul.dataUl1").html('');
    for (var i = 0; i < data.length; i++) {
        $("#" + id).parent().find("ul.dataUl1").append("<li data-id='" + data[i].id + "' data-phone='" + data[i].phone + "' data-val='" + data[i].key + "'><span class='edit'></span><span class='remove'></span>" + data[i].va + "</li>")
    }
    if (downInput != "noShowInput") {
        $("#" + id).parent().find("ul.dataUl").append("<li data-class='addInput' class='addInput'><input class='form-control' id='addInput' type='text'></li>");
    }
    $("#" + id).parent().find("ul.dataUl1").css("width", $("#" + id).css("width"));
    $("#" + id).parent().find("ul.dataUl1 li").find("span").addClass("hide");
    if (showico == "showico") {
        $("#" + id).parent().find("ul.dataUl1 li").find("span").removeClass("hide");
        $("#" + id).parent().find("ul.dataUl1 li").eq(0).find("span").addClass("hide");
    }
    if (serachWay == "AR") {
        //精确匹配
        $("input[data=inputD]").keyup(function () {
            if ($(this).val() != "") {
                $(this).parent().find("ul[data=ul] li").addClass("hide");
                for (var i = 0; i < $(this).parent().find("ul[data=ul] li").length; i++) {
                    if ($.trim($(this).parent().find("ul[data=ul] li").eq(i).text()) == $.trim($(this).val())) {
                        $(this).parent().find("ul[data=ul]").removeClass("hide");
                        $(this).parent().find("ul[data=ul] li").eq(i).removeClass("hide");
                    }
                }
            }
            if ($(this).val() == "") {
                // $("ul[data=ul] li").removeClass("hide")
            }
        })
    } else {
        $("input[data=inputD]").focus(function () {
            $(this).parent().find("ul.dataUl1").removeClass("hide");
            $("ul.dataUl1 li").unbind('click').click(function () {
                $(this).parent().parent().find("input[data=inputD]").val($(this).text());
                $("#clienTel").val($(this).attr("data-phone"));
                $("#clientStaffId").val($(this).attr("data-id"));
                $(this).parent().addClass("hide");
                $("#" + formId).data('bootstrapValidator').updateStatus('clientName', 'NOT_VALIDATED').validateField('clientName');
                $("#" + formId).data('bootstrapValidator').updateStatus('clienTel', 'NOT_VALIDATED').validateField('clienTel');
                if (formId && formId != "" && $(this).parent().parent().find("input[data=inputD]").attr('name') == FieldName) {
                    $("#" + formId).data('bootstrapValidator').updateStatus(FieldName, 'NOT_VALIDATED').validateField(FieldName)
                }

            });

        }).blur(function () {
            //input blur延时处理，防止和ul li点击事件冲突
            setTimeout("$('ul[data=ul]').addClass('hide')", 150)
        }).keyup(function () {
            //模糊匹配，显示匹配的结果
            if ($(this).val() != "") {
                $("ul.dataUl1 li").addClass("hide");
                $("ul.dataUl1 li.addInput").removeClass("hide");
                for (var i = 0; i < $("ul.dataUl1 li").length; i++) {
                    for (var j = 0; j < $("ul.dataUl1 li").eq(i).text().length; j++) {
                        if ($("ul.dataUl1 li").eq(i).text().substr(j, $(this).val().length) == $(this).val()) {
                            $("ul.dataUl1 li").eq(i).removeClass("hide");
                        }
                    }
                }
            }
            if ($(this).val() == "") {
                $("ul.dataUl1 li").removeClass("hide")
            }
        });
    }
    $(".edit").click(function (e) {
        e.stopPropagation();
    });
    $(".remove").click(function (e) {
        e.stopPropagation();
    })
}
//图片上传立即预览，支持多张图片格式
//obj上传按钮对象，imgbox为展示图片的id
function UploadImgShow(obj, imgBOX) {
    if (typeof FileReader == 'undefined') {
        alert("当前浏览器不支持FileReader接口");
    }
    for (var i = 0; i < obj.files.length; i++) {
        var reader = new FileReader();
        var file = obj.files[i];
        reader.onload = function (e) {
            console.log("成功读取....");
            if(imgBOX=="upImgBOX"){//机构人员上传图片
                $("#" + imgBOX).append("<a class='imgShow' href='" + e.target.result + "' target='_blank'><img style='border: 3px solid #cccccc;width: 150px;height: 100px;margin-right: 5px' src='" + e.target.result + "'><span class='close-img hide' onclick='closeImg(this)'></span>" +
                    "<span class='showCtName'>"+$("#ctName").val()+"</span>" +
                    "<span class='showCtId'>"+$("#ctId").val()+"</span></a>");
                $("#upimgBtn").attr('disabled', 'disabled').text('图片上传中···');
            }
            if(imgBOX=="fileUP"){//函件公告那里上传
                $("#upimgBtn").attr('disabled', 'disabled').text('文件上传中···');
            }
            if(imgBOX=="fault"){//故障图片上传
                $("#upimgBtn").attr('disabled', 'disabled').val('图片上传中···');
            }
            $("#picFileForm").submit();
            t = setInterval(function () {
                imgUrl(imgBOX)
            }, 1000);
        }
        ;
        //读取文件过程方法
        reader.onloadstart = function (e) {
            console.log("开始读取....");
        };
        reader.onprogress = function (e) {
            console.log("正在读取中....");
        }
        reader.onabort = function (e) {
            console.log("中断读取....");
        }
        reader.onerror = function (e) {
            console.log("读取异常....");
        }
        reader.readAsDataURL(file);
    }
}
var arrNO = [];
var arrNO1 = [];
function imgUrl(imgBOX) {
    var imageUrl = $("#uploadFrame").contents().find("body").text();
    console.log(imageUrl + "__________");
    var ctName = $("#ctName").val();
    var ctId = $("#ctId").val();
    if (imageUrl != "") {
        clearInterval(t);
        if(imgBOX=="upImgBOX"){
            $(".close-img").removeClass("hide");
            $("#upimgBtn").attr('disabled', false).text('上传证书图片');
            console.log(imageUrl);
            imageUrl = JSON.parse(imageUrl);
            if (imageUrl.code == 0) {
                var str = $("#credentials").val();
                str += "{ctName:'" + ctName + "',ctId:'" + ctId + "',res:'" + imageUrl.res + "'}&";
                $("#credentials").val(str);
                console.log($("#credentials").val());
                $("#ctName").val("");
                $("#ctId").val("");
                $("#uploadFrame").contents().find("body").html('')
            } else {
                alert(imageUrl.desc)
            }
        }
        if(imgBOX=="fileUP"){
            $("#upimgBtn").attr('disabled', false).text('上传');
            console.log(imageUrl);
            imageUrl = JSON.parse(imageUrl);
            if (imageUrl.code == 0) {
                var str = "";
                    str= {fileAttachmentPath:imageUrl.res,fileAttachmentTitle:imageUrl.oldName+""+imageUrl.type};
                    arrNO.push(str);
                    var strT = JSON.stringify(arrNO);
                $("#fileUPn").val(strT);
                console.log($("#fileUPn").val());
                $("#uploadFrame").contents().find("body").html('');
                upfileTable()
            } else {
                alert(imageUrl.desc)
            }
        }
        if(imgBOX=="fault"){
            $(".close-img").removeClass("hide");
            $("#upimgBtn").attr('disabled', false).val('添加');
            console.log(imageUrl);
            imageUrl = JSON.parse(imageUrl);
            if (imageUrl.code == 0) {
                $("#" + imgBOX).append("<a class='imgShow' href='http://oy3l6qawm.bkt.clouddn.com/"+imageUrl.res+"' target='_blank'><img style='border: 3px solid #cccccc;width: 150px;height: 100px;margin-right: 5px' src='http://oy3l6qawm.bkt.clouddn.com/"+imageUrl.res+"'><span class='close-img' flagSt='"+imageUrl.res+"' onclick='closeImg1(this)'></span></a>");
                var str = "";
                // str= {fileAttachmentPath:imageUrl.res,fileAttachmentTitle:imageUrl.oldName+""+imageUrl.type};
                arrNO1.push(imageUrl.res);
                var strT = JSON.stringify(arrNO1);
                $("#fileUPn").val(strT);
                console.log($("#fileUPn").val());
                $("#uploadFrame").contents().find("body").html('')
            } else {
                alert(imageUrl.desc)
            }
        }
    }
}
//    公告函件上传样式附加
function upfileTable() {
    var picFile = $("#picFile").val();
    var index = picFile.lastIndexOf('\\');
    picFile = picFile.substring(index + 1, picFile.length);
    $("#ulUPfile").append("<li>"+picFile+"</li>")

}
function closeImg(that) {
    $(that).parent().click(function (e) {
        e.preventDefault();
        e.stopPropagation();
        // alert("a标签被阻止了");
        $(that).parent().unbind('click');
        var ctObjArr = $("#credentials").val();
        ctObjArr = ctObjArr.split('&');
        var index = $("span.close-img").index($(that));
        ctObjArr.splice(index, 1);
        ctObjArr.splice(ctObjArr.length - 1, 1);
        var str = "";
        for (var i = 0; i < ctObjArr.length; i++) {
            str += ctObjArr[i] + "&"
        }
        $("#credentials").val(str);
        console.log($("#credentials").val())
        $(that).parent().remove();
    });
}
function closeImg1(that) {
    $(that).parent().click(function (e) {
        e.preventDefault();
        e.stopPropagation();
        // alert("a标签被阻止了");
        $(that).parent().unbind('click');
        for (var i = 0; i < arrNO1.length; i++) {
            if($(that).attr("flagSt")==arrNO1[i]){
                arrNO1.splice(i,1);
            }
        }
        var strT = JSON.stringify(arrNO1);
        $("#fileUPn").val(strT);
        console.log($("#credentials").val())
        $(that).parent().remove();
    });
}
//上传图片载入
function imgBoxload(imgBOX) {
    var ctObj = $("#credentials").val();
    ctObjArr = ctObj.split('&');
    ctObjArr.splice(ctObjArr.length - 1, 1);
    //图床配置
    var urlHead = "http://oy3l6qawm.bkt.clouddn.com/";
    for (var i = 0; i < ctObjArr.length; i++) {
        ctObjArr[i] = eval("(" + ctObjArr[i] + ")");
    }
    for (var i = 0; i < ctObjArr.length; i++) {
        $("#" + imgBOX).append("<a class='imgShow' href='" + urlHead + "" + ctObjArr[i].res + "' target='_blank'><img style='border: 3px solid #cccccc;width: 150px;height: 100px;margin-right: 5px' src='" + urlHead + "" + ctObjArr[i].res + "'><span class='close-img' onclick='closeImg(this)'></span>" +
            "<span class='showCtName'>"+ctObjArr[i].ctName+"</span>" +
            "<span class='showCtId'>"+ctObjArr[i].ctId+"</span></a>");
    }
}

/**
 * 将数值四舍五入(保留2位小数)后格式化成金额形式
 *
 * @param num 数值(Number或者String)
 * @return 金额格式的字符串,如'1,234,567.45'
 * @type String
 */
function formatCurrency(num) {
    num = num.toString().replace(/\$|\,/g, '');
    if (isNaN(num))
        num = "0";
    sign = (num == (num = Math.abs(num)));
    num = Math.floor(num * 100 + 0.50000000001);
    cents = num % 100;
    num = Math.floor(num / 100).toString();
    if (cents < 10)
        cents = "0" + cents;
    for (var i = 0; i < Math.floor((num.length - (1 + i)) / 3); i++)
        num = num.substring(0, num.length - (4 * i + 3)) + ',' +
            num.substring(num.length - (4 * i + 3));
    return (((sign) ? '' : '') + num + '.' + cents);
}


//分页

(function ($) {

    function Page(container, fn, args, style) {
        //存参数
        var container = this.container = container || null;
        var args = this.args = $.extend({
            pageCount: 10,//总页码,默认10
            current: 1,//当前页码,默认1
            showPrev: true,//是否显示上一页按钮
            showNext: true,//是否显示下一页按钮
            showTurn: true,//是否显示跳转,默认显示d
            showSumNum: true,//是否显示总页码
            showNear: 2,//显示当前页码前多少页和后多少页，默认2
            pageSwap: true,//是否同意调剂,默认是。调剂会最大数量显示页码。例如当前页码之前无页码可以显示。则会增加之后的页码。
            align: 'right'//对齐方式。默认右对齐.可选：left,right
        }, args || {});

        //建立容器
        this.container.html('<div></div>');
        this.obj = this.container.children();
        this.obj.css({'content': '', 'display': 'block', 'clear': 'both', 'float': args.align});
        //初始化
        this.init();
    }

    Page.prototype.init = function () {
        this.fillHtml();
        this.bindEvent();
    }

    //填充DOM
    Page.prototype.fillHtml = function () {
        var args = this.args;
        var obj = this.obj;
        if (args.current > args.pageCount || args.current < 1)return;
        obj.empty();
        //上一页
        if (args.showPrev) {
            if (args.current > 1) {
                obj.append('<a href="javascript:;" class="prevPage"><上一页</a>');
            } else {
                obj.remove('.prevPage');
                obj.append('<span class="disabled"><上一页</span>');
            }
        }
        //中间页码
        if (args.current != 1) {
            obj.append('<a href="javascript:;" class="tcdNumber">' + 1 + '</a>');
        } else {
            obj.append('<a href="javascript:;" class="current">' + 1 + '</a>');
        }

        if (args.current > args.showNear + 2) {
            obj.append('<a href="javascript:;" class="hiding">...</a>');
        }

        var start = args.current > args.showNear + 2 ? args.current - args.showNear : 2,
            end = args.current + args.showNear >= args.pageCount ? args.pageCount - 1 : args.current + args.showNear;

        if (args.pageSwap) {
            var dstart = args.current - args.showNear - 2;
            var dend = args.pageCount - 1 - args.current - args.showNear;
            if (dstart < 1 && dend > 1) {
                end += Math.min(dend, Math.abs(dstart - 1));
            } else if (dstart > 1 && dend < 1) {
                start -= Math.min(dstart, Math.abs(dend - 1));
            }
        }

        for (; start <= end; start++) {
            if (start != args.current) {
                obj.append('<a href="javascript:;" class="tcdNumber">' + start + '</a>');
            } else {
                obj.append('<a href="javascript:;" class="current">' + start + '</a>');
            }
        }

        if (args.current + 1 + args.showNear < args.pageCount) {
            obj.append('<a href="javascript:;" class="hiding">...</a>');
        }

        if (args.current != args.pageCount && args.pageCount != 1) {
            obj.append('<a href="javascript:;" class="tcdNumber">' + args.pageCount + '</a>');
        } else if (args.current == args.pageCount && args.pageCount != 1) {
            obj.append('<a href="javascript:;" class="current">' + args.pageCount + '</a>');
        }
        //下一页
        if (args.showNext) {
            if (args.current == args.pageCount || args.pageCount == 1) {
                obj.remove('.nextPage');
                obj.append('<a href="javascript:;" class="disabled">下一页></a>');
            } else {
                obj.append('<a href="javascript:;" class="nextPage">下一页></a>');
            }
        }

        if (args.showSumNum) {
            obj.append('<span class="pagecount">共' + args.pageCount + '页</span>');
        }
        //跳转页码
        if (args.showTurn) {
            obj.append('<span class="countYe">到第<input type="text" maxlength=' + args.pageCount.toString().length + '>页<a href="javascript:;" class="turndown">确定</a></span>');
        }
        // this.setStyle();
        this.fn && this.fn(args.current);
    };
    //添加样式

    //绑定事件
    Page.prototype.bindEvent = function () {
        var obj = this.obj;
        var _this = this;

        obj.off("click");
        obj.on("click", "a.tcdNumber", function () {
            _this.args.current = parseInt($(this).text());
            _this.fillHtml();
            if ($("#pageFix").val() == "0") {
                goTypePage(parseInt($(this).text()));
            } else {
                $('#pageNum').val($(this).text());
                $('#pageNum').parents('form').submit()
            }

        });
        //上一页
        obj.on("click", "a.prevPage", function () {
            _this.args.current = parseInt(obj.children("span.current").text()) - 1;
            _this.fillHtml();
        });
        //下一页
        obj.on("click", "a.nextPage", function () {
            _this.args.current = parseInt(obj.children("span.current").text()) + 1;
            _this.fillHtml();
        });
        //跳转
        obj.on("click", "a.turndown", function () {
            var page = _this.args.current = Number(obj.children("span.countYe").children('input').val());
            if (page > _this.args.pageCount) {
                alert("页码输入有误，请重新输入！");
                return;
            }
            _this.fillHtml();
        });
    }
    //绑定成jQuery插件
    $.fn.createPage = function (fn, args, style) {
        var _this = this;
        new Page(_this, fn, args, style);
        return this;
    }
})(jQuery);


// 对Date的扩展，将 Date 转化为指定格式的String
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
// 例子：
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423
// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18
Date.prototype.Format = function (fmt) { //author: meizz
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}
function fmtYMD(timestamp) {
    if(isNaN(timestamp)) return '';
    return new Date(timestamp).Format("yyyy-MM-dd");
}
function fmtYMDHMS(timestamp) {
    if(isNaN(timestamp)) return '';
    return new Date(timestamp).Format("yyyy-MM-dd hh:mm:ss");
}
//合并单元格, 例子: $('#tb1').rowspan(0);
(function ($) {
    $.fn.extend({
        //表格合并单元格，colIdx要合并的列序号，从0开始
        "rowspan": function (colIdx) {
            return this.each(function () {
                var that;
                $('tr', this).each(function (row) {
                    $('td:eq(' + colIdx + ')', this).filter(':visible').each(function (col) {
                        if (that != null && $(this).html() == $(that).html()) {
                            rowspan = $(that).attr("rowSpan");
                            if (rowspan == undefined) {
                                $(that).attr("rowSpan", 1);
                                rowspan = $(that).attr("rowSpan");
                            }
                            rowspan = Number(rowspan) + 1;
                            $(that).attr("rowSpan", rowspan);
                            $(this).hide();
                        } else {
                            that = this;
                        }
                    });
                });
            });
        }
    });
})(jQuery);
