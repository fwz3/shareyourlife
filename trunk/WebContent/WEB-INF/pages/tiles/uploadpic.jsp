<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script src="/scripts/jquery-1.3.2.min.js"></script>
<script src="/scripts/jquery.uploadProgress.js"></script>
<script src="/scripts/jquery.progression.pack.js"></script>
<link rel="stylesheet" href="/css/progressbar.css" type="text/css" media="all" />
<script type="text/javascript">
$(function() {
	$('form').uploadProgress({
		progressUrl:"/upload_info.do",
		start:function(){
			filename = $("#up_file").val().split(/[\/\\]/).pop();
        	$("#filename").html(filename);
        	$("#file_progress").html("读取中");
        	$('.progressbar').progression({Current:0,Maximum:100,Animate:false});
        	$("#upload_status").show();
        },
		uploading: function(upload){
        	$("#file_progress").html(upload.received+"/"+upload.size);
    		$(".progressbar").progression({Current:upload.percents,Animate:true});
		},
		error:function(upload){
			if(upload.action="redirect"){
				alert("redirect addr:"+upload.redirect_addr);
			}
			if(upload.action="redirect"){
				alert("redirect addr:"+upload.redirect_addr+upload.msg);
			}
		},
		complete:function(upload){},
		error:function(upload){},
		success:function(upload){
			$("#file_progress").html(upload.received+"/"+upload.size);
    		$(".progressbar").progression({Current:100,Animate:false});
		},
		interval:2000
	    });
	});
</script>
<div>
<a href="/reg.do">注册</a>
<h5>登录</h5>
<s:actionerror/>
<form action="/upload_pic.do" method="post" enctype="multipart/form-data">
<input type="hidden" name="submit" value="true"/>
<p>
文件:<input id="up_file" type="file" name="pic"/>
</p>
<p>
标题:<input type="text" name="title"/>
</p>
<p>
描述:<input type="text" name="description"/>
<input type="submit" value="上传"/>
</p>
</form>
</div>
<br/>
<div id="upload_status" style="display:none;border:solid 1px">
<div><div style="float:left">正在上传：</div><div id="filename"></div></div>
<div><div style="float:left">当前进度：</div><div id="file_progress"></div></div>
<div class="progressbar"></div>
</div>