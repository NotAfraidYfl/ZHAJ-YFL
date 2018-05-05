<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="../views/common/taglib.jsp"%>
<%@ attribute name="page" type="com.github.pagehelper.PageInfo" required="true"%>
<%-- 表格分页工具栏，使用方法： 原样输出page --%>
<div class="fixed-table-pagination" style="display: block;">
<div class="pull-left pagination-detail" style="margin: 15px;">
<span class="pagination-info">第 ${page.pageNum}页，共${page.pages}页，</span>
<span class="page-list">每页显示</span>
<select class='form-control input-sm pageSelect' style='width:65px;display:inline-block'>
	<option value='10'>10</option>
	<option value='20'>20</option>
	<option value='50'>50</option>
	<option value='100'>100</option>
</select><span>条</span>
</div>
<div class="pageDiy"></div>
</div>
<!-- pagination的css样式设定-->
<style>
	th:hover{cursor: default;} td{vertical-align:middle!important;}
    .pagination > li > a, .pager > li > a {
        height: 34px !important;
        line-height: 21px !important;
        padding: 6px 15px;
    }
</style>
<script type="text/javascript">
    $(function () {
        $('.pageDiy').createPage(null, {
            pageCount:"${page.pages}",//总页码,默认10
            showPrev: false,//是否显示上一页按钮
            showNext: false,//是否显示下一页按钮
            showTurn: false,//是否显示跳转,默认可以
            showNear: 1,//显示当前页码前多少页和后多少页，默认2
            showSumNum: false//是否显示总页码
        });
        
        var pageSize = $("#pageSize").val()
		$(".pageSelect option[value=" + pageSize + "]").attr('selected', true);
        $(".pageSelect").on('change',function(){
            page(1, $(this).val())
        });

        if("${page.pages}"=="0"){
            $(".fixed-table-pagination").prepend("<div class='alert alert-danger diyAlert'>无相关信息</div>")
            $(".panel-body").css("height","100%");
            $(window).resize(function () {
            $(".panel-body").css("height","100%")
            });
            $(".pagination-detail").addClass("hide");
        }else{
        	 $(".pagination-detail").removeClass("hide");
        }
        //排序处理
        $('th.sortable').click(function(){
            var self = $(this);
            if(self.hasClass('sorting_asc')) {
                self.removeClass('sorting_asc').addClass('sorting_desc');
                $('input[name=orderBy]').val(self.attr('field') + ' desc');
            }
            else {
                self.removeClass('sorting').removeClass('sorting_desc').addClass('sorting_asc');
                $('input[name=orderBy]').val(self.attr('field') + ' asc');
            }
            var sortables = $('th.sortable');
            for(var i=0; i<sortables.length; i++) {
                var th = $(sortables[i]);
                if(th.attr('field')==self.attr('field')) continue;
                if(!th.hasClass('sorting')) th.removeClass('sorting_asc').removeClass('sorting_desc').addClass('sorting');
            }
            $('#searchForm').submit();
        });
    });
    function page(n, s) {//翻页
        $("#pageNum").val(n);
        if(!isNaN(parseInt(s))) $("#pageSize").val(s);
        $("#searchForm").submit();
        return false;
    }
    //need r.page, r.total, r.data
    function renderPage(r) {
        var pageSize = $('#pageSize').val();
        var pageCount = Math.ceil(r.total / pageSize);
        $("span.pagination-info").text("第"+r.page+"页，共"+pageCount+"页，");
        $('.pageDiy').createPage(null, {
            pageCount:pageCount,
            current:r.page,
            showNear:1,
            showPrev:false,
            showNext:false,
            showTurn:false,
            showSumNum:false
        });
        if(r.total=="0"){
            if($(".diyAlert").length>0){
                return;
            }
            $(".fixed-table-pagination").prepend("<div class='alert alert-danger diyAlert'>无相关信息</div>");
            $(".pagination-detail").addClass("hide");
            $(".panel-body").css("height","100%");
            $(window).resize(function () {
            $(".panel-body").css("height","100%")
            });
        }else{
            $(".diyAlert").remove();
            $(".pagination-detail").removeClass("hide");
            var Wheight = $(window).height() -133 - $("#searchForm").height();
		    $(".panel-body").css("height",Wheight)
        }
        
    }
</script>
