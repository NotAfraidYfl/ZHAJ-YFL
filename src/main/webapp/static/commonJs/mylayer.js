var $layer = parent.layer;
/**
 * 新增 提示消息
 * layer.alert 弹窗
 * btn: ["返回列表","继续添加"]
 * @param option 显示的内容
 * @param yesCallback		点击[返回列表]是否需要回调的方法
 * @param cancelCallback	点击[继续添加]的时候需要回调的方法
 */
window.alert = function(option, yesCallback, cancelCallback){
	if(typeof(option) == 'string'){
		$layer.alert(option, {
			title: "提示",
			shade: 0.6, 
//			icon: 1,
			closeBtn: 0,
			btn: ["确定"],
			cancel: function(index){
				$layer.close(index);
				if(typeof cancelCallback == 'function'){
					cancelCallback();
				}
			}
		});
	}else{
		var ops = $.extend({
			title: "提示",
			shade: 0.6, 
			icon: 1,
			closeBtn: 0,
			btn: ["确定","取消"],
			yes: function(index, layero){
				$layer.close(index);
				if(typeof yesCallback == 'function'){
					yesCallback();
				}
			},
			cancel: function(index){
				$layer.close(index);
				if(typeof cancelCallback == 'function'){
					cancelCallback();
				}
			}
		},option);
		updateOptionIcon(option, ops);
		$layer.alert(option.desc, ops); 
	}
}

/**
 * 只提示消息用
 * @param content
 */
function alertMsg(content){
	$layer.alert(content,{
		title: "提示",
		shade: 0.6, 
		icon: 2,
		closeBtn: 0,
		btn: ["确定"],
		yes: function(index, layero){
			$layer.close(index);
		}
	}); 
}
function alertMsg(content,yesCallback){
	$layer.alert(content,{
		title: "提示",
		shade: 0.6, 
		icon: 2,
		closeBtn: 0,
		btn: ["确定"],
		yes: function(index, layero){
			$layer.close(index);
			if(typeof yesCallback == 'function'){
				yesCallback();
			}
		}
	}); 
}

/**
 * 弹出新iframe窗口
 * @param title
 * @param url
 * @param area
 */
function open(title,url,area,yesCallback){
	var index = top.layer.open({
		type: 2,  
	    area: area,
	    title: title,
        // maxmin: true, //开启最大化最小化按钮
	    content:url,
	    btn: ['确定', '关闭'],
	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    },
	    yes: function(index, layero){
            if(typeof yesCallback == 'function'){
	    		yesCallback(index,layero);
			}
	    },
	    cancel: function(index){
	    }
	});
	return index;
}


function openCase(title,url,area,successCallback , yesCallback){
	var index = top.layer.open({
		type: 2,  
	    area: area,
	    title: title,
        maxmin: false, //开启最大化最小化按钮
	    content:url,
	    // closeBtn:0,
//	    btn: ['确定', '关闭'],
	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    	if(typeof successCallback == 'function'){
	    		successCallback(index,layero);
			}
	    },
	    yes: function(index, layero){
            if(typeof yesCallback == 'function'){
	    		yesCallback(index,layero);
			}
	    },
	    cancel: function(index){
	    }
	});
	return index;
}

function openInfo(title,url,area){
	var index = top.layer.open({
		type: 2,  
	    area: area,
	    title: title,
        maxmin: true, //开启最大化最小化按钮
	    content:url,
	    btn: ['关闭'],
	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    },
	    cancel: function(index){
	    }
	});
	return index;
}


function openImport(title,url,area,yesCallback){
	var index = top.layer.open({
		type: 2,  
	    area: area,
	    title: title,
        maxmin: true, //开启最大化最小化按钮
	    content:url,
	    btn: ['确定'],
	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    },
	    yes: function(index, layero){
            if(typeof yesCallback == 'function'){
	    		yesCallback(index,layero);
			}
	    },
	    cancel: function(index){
	    }
	});
	return index;
}


function openReview(title,url,area){
	var index = top.layer.open({
		type: 2,  
	    area: area,
	    title: title,
        maxmin: true, //开启最大化最小化按钮
	    content:url,
//	    btn: ['关闭'],//不显示关闭按钮
//	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    },
	    cancel: function(index){
	    },
	    end:function(){
	    	location.reload();
	    }
	});
	return index;
}
/**
 * 弹出新iframe窗口
 * @param title
 * @param url
 * @param area
 */
function openTop(title,url,area,yesCallback){
	var index = layer.open({
		type: 2,  
	    area: area,
	    title: title,
        maxmin: true, //开启最大化最小化按钮
	    content:url,
	    btn: ['确定', '关闭'],
	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    },
	    yes: function(index, layero){
            if(typeof yesCallback == 'function'){
	    		yesCallback(index,layero);
			}
	    },
	    cancel: function(index){
	    }
	});
	return index;
}

function menuOpen(title,url,area){
	var index = $layer.open({
		  type: 2,
		  title: title,
		  closeBtn: 0, //不显示关闭按钮
		  shade: 0.5,
		  shadeClose: true,
		  area: area,
		  anim: 2,
		  content: [url, 'no'], //iframe的url，no代表不显示滚动条
		  end:function(){
			  location.reload();
		  }
		});
	return index;
}
//打开对话框(添加修改)
function openDialog(title,url,area,yesCallback){
	top.layer.open({
	    type: 2,  
	    area: area,
	    title: title,
        maxmin: true, //开启最大化最小化按钮
	    content: url ,
	    btn: ['确定', '关闭'],
	    yes: function(index, layero){
	    	if(typeof yesCallback == 'function'){
	    		yesCallback();
			}
	    },
	   cancel: function(index){ 
        }
	}); 	
	
}

/**
 * 打开一个 DOM 内容的 弹出框，按钮默认为“保存与关闭”，默认skin：btn-form-class
 * @param title 弹出框的标题
 * @param DOM 弹出框的内容 DOM
 * @param area 弹出框的area区域大小
 * @param yesCallback 点击保存后的回调函数
 * @returns 返回打开的弹出框的index
 */
function openWithDOM(title,DOM,area,yesCallback){
//	console.log("top -> ",top);
//	console.log("window -> ",window);
//	console.log("window==top -> ",window==top);
	layer.open({
		  type: 1,
		  title: title,
//		  shade: 0.5,
//		  shadeClose: true,// (false时)点击遮罩层外，不能关闭弹出窗口
//		  maxmin: true, //开启最大化最小化按钮
		  area: area,
		  anim: 2,
		  content: DOM, //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
		  btn:["保存","关闭"],
		  btnAlign: 'c',
		  skin: 'btn-form-class',
		  yes: function(index, layero){
				if(typeof yesCallback=='function'){
					console.log("layer_index -> ",index);
					yesCallback(index, layero);
				}
			}
		});
//	console.log("div -> ",$("#layui-layer2"));
//	console.log("top.body -> ",$(top.document.body));
//	$(top.document.body).append($("#layui-layer2"));
//	if(top != window){
//		// 移动到顶层--事件无法生效
//		var domLayer = $("div.layui-layer[type=page][id^=layui-layer]");
//		var domShade = $("div.layui-layer-shade[id^=layui-layer-shade]");
//		$(top.document).find("body").append(domLayer).append(domShade);
//	}
}

/**
 * 根据 index 来关闭一个 弹出层，如果没有传入 index，则关闭所有的 page 弹出层
 * @param index
 */
function closeWithDOM(index){
	if(index){
		layer.close(index);
	} else {
		layer.closeAll("page");// 会关闭所有类型为1(即：page)的
	}
}

/**
 * 关闭当前iframe窗口
 * @param content
 */
function openColse(content,index){
	$layer.msg(content,{shade:0.6, time: 1500 }, function(){
//		location.reload();
		if(index){
			$layer.close(index);
		} else {
			$layer.closeAll();// 会关闭所有类型为1(即：page)的
		}
//		$layer.closeAll();
	});
}

//function close(){
//	$layer.closeAll();
//}

/**
 * 保存 提示消息
 * layer.msg 提示消息
 * @param option			提示消息内容
 * @param cancelCallback	2秒钟后的回调方法
 */
function toast(option,cancelCallback){
	if(typeof option == 'string'){
		$layer.msg(option,{shade:0.6, time: 1500 }, function(){
			if(typeof cancelCallback=='function'){
				cancelCallback();
			}
		});
	}else{
		var ops = $.extend({shade:0.6, time: 1500 },option);
		
		updateOptionIcon(option, ops);
		if(ops.icon==2){
			$layer.alert(option.desc,{
				title: "提示",
				shade: ops.shade, 
				icon: ops.icon,
				closeBtn: 0,
				btn: ["确定"],
				yes: function(index, layero){
					$layer.close(index);
					if(typeof cancelCallback=='function'){
						cancelCallback();
					}
				}
			});
		}else{
			$layer.msg(option.desc,ops,function(){
				if(typeof cancelCallback=='function'){
					cancelCallback();
				}
			});
		}
	}
}

/**
 * 删除 提示消息
 * layer.confirm 提示
 * @param option			需要提示的消息内容
 * @param yesCallback		点击确定的回调函数
 */
window.confirm = function(option, yesCallback, cancelCallback){
	if(typeof option == 'string'){
		$layer.confirm(option,{icon: 3,title:'提示'}, function(index){ 
			$layer.close(index);
			if(typeof yesCallback=='function'){
				yesCallback();
			}
		}, function(index){ 
			$layer.close(index);
			if(typeof cancelCallback=='function'){
				cancelCallback();
			}
		});
	}else{
		var ops = $.extend({icon: 3,title:'提示'}, option);
		
		updateOptionIcon(option, ops);
		$layer.confirm(option.desc, ops, function(index){ 
			$layer.close(index);
			if(typeof yesCallback=='function'){
				yesCallback();
			}
		}, function(index){
			$layer.close(index);
			if(typeof cancelCallback=='function'){
				cancelCallback();
			}
		});
	}
}

window.prompt = function(option, yesCallback){
	var ops = $.extend({formType: 2,value: '',title: '请输入'}, option);
	$layer.prompt(ops, function(value, index, elem){
		$layer.close(index);
		if(typeof yesCallback=='function'){
			yesCallback(value);
		}
	});
}

/**
 * 系统内部错误 提示消息
 * layer.alert提示
 * btn: ["取消"]
 * @param cancelCallback 点击[取消]回调函数
 */
function error(option, cancelCallback){
	if(typeof option == 'undefined'){
		$layer.alert("系统内部错误！",{
			title: "提示",
			shade: 0.6, //遮罩透明度
			icon: 2,
			closeBtn: 0,
			btn: ["取消"],
			yes: function(index){
				$layer.close(index);
				if(typeof cancelCallback=='function'){
					cancelCallback();
				}
			}
		});
	}else{
		var ops = $.extend({
			title: "错误提示",
			shade: 0.6, //遮罩透明度
			icon: 2,
			closeBtn: 0,
			btn: ["取消"],
			yes: function(index){
				$layer.close(index);
				if(typeof cancelCallback=='function'){
					cancelCallback();
				}
			}
		},option);
		
		if(option.code==403 || option.code=='403' ){
			$layer.alert(option.desc, ops); 
		}else if(option.code== 504 || option.code=='504' ){
			$layer.alert(option.desc, ops); 
			top.location = webRoot + "/login.do";
		}else{
			if(option.code == 1){
				$layer.alert(option.desc, ops);
			}else{
				$layer.alert("系统内部错误！", ops); 
			}
			
		}
	}
}


/**
 * 判断是否传递参数icon
 * 没有传就根据option判断图标
 * option.code == 0 ? icon=1 : icon=2
 *  icon=1 操作成功图标 勾 icon=2操作失败图标 叉
 * @param option
 */
function updateOptionIcon(option,ops){
	if('code' in option){
		if(option.code == 0){
			ops.icon = 1;
		}else{
			ops.icon = 2;
		}
	}
}

/**
 * 提交表单的时候的等待
 */
var load = function(option){
	var ops = $.extend({type:3,icon:0,shade:0.3},option);
	return $layer.load(0,ops);
}
/**
 * 根据load的index 关闭load
 */
var loadClose = function(loadIndex){
	return $layer.close(loadIndex);
}

/**
 * 根据layer的index获取此弹窗下的body对象
 * @param index 弹出层的 index
 * @returns {Object} 弹出层内部的 body 对象
 */
function getBodyByLayer(index){
	if(index){
		return top.layer.getChildFrame('body', index);
	} else {
		return null;
	}
}

/**
 * 获取指定 dom 对象下的第一个 iframe 的 win 对象
 * @param layero 指定的jquery对象或对象的选择器
 * @returns {Window} 返回获取到的 window 对象
 */
function getWinOfLayer(layero){
	var obj;
	switch (typeof layero) {
	    case 'object':
	    	obj = layero;
	        break;
	    case 'string':
	        obj = $(layero);
	        break;
	    default:
	        break;
	}
	return top[obj.find('iframe')[0]['name']];
}

/**
 * layer 的 open
 */
//var open = function(option,yesCallback, cancelCallback){
//	var ops = $.extend({
//		  type: 2,
//		  title: false,
//		  closeBtn: 1,
//		  shade: 0.4,
//		  area: ['90%', '80%'],
//		  shadeClose: true,
//		  content: "",
//		  btn : ["",""],
//		  yes: function(index, layero){
//			  $layer.close(index);
//			  if(typeof yesCallback == 'function'){
//				yesCallback();
//			  }
//			},
//			cancel: function(index){
//			  $layer.close(index);
//			  if(typeof cancelCallback == 'function'){
//			  	cancelCallback();
//			  }
//			}
//		},option);
//	console.log(ops);
//	return $layer.open(option);
//}

$(function(){
	$(".btn-close").click(function(){
		var FrameIndex = parent.layer.getFrameIndex(window.name)
		$layer.close(FrameIndex);
	});
});

//可以最大最小化的openCaseMax
function openCaseMax(title,url,area,successCallback , yesCallback){
	var index = top.layer.open({
		type: 2,  
	    area: area,
	    title: title,
        maxmin: true, //开启最大化最小化按钮
	    content:url,
	    btnAlign: 'c',
	    skin: 'btn-form-class',
	    success: function(layero, index){
	    	if(typeof successCallback == 'function'){
	    		successCallback(index,layero);
			}
	    },
	    yes: function(index, layero){
            if(typeof yesCallback == 'function'){
	    		yesCallback(index,layero);
			}
	    },
	    cancel: function(index){
	    }
	});
	return index;
}