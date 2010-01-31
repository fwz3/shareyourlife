<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script>
function bindDelete(select){
	$(select).each(function(){
		$(this).bind("click",function(event){
			event.preventDefault();
			var tr_obj = $(this).parent().parent("tr");
			$.ajax({
				type : "GET",
				url : $(this).attr("href"),
				dataType:"json",
				cache : false,
				success : function(data, textStatus) {
					if(data.result=="login"){
						redirectAdminLogin();
					}
					if(data.result=="success"){
						if(select==".pub"){alert(data.msg);}
						$(tr_obj).remove();
					}
					if(data.result=="fail"){
						alert(data.msg);
					}
				}
			});
		})
	})
}
$(document).ready(function(){
	var size = <s:property value="result.size"/>;
	var pagesize = <s:property value="result.pagesize"/>;
	var c_page = Math.ceil(size/pagesize);
	writePage(c_page,<s:property value="result.page"/>,"#page_bar","/admin/blogs_list.zl?type=<s:property value='type'/>&page=");
	bindDelete(".del");
	bindDelete(".pub");
})
</script>
    	<div class="result">
        	<table class="list" width="100%">
			<thead>
				<tr>
					<th scope="col">编号</th>
					<th scope="col">用户</th>
					<th scope="col">邮箱</th>
					<th scope="col">标题</th>
					<th scope="col">详细内容</th>
					<th scope="col">操作</th>
				</tr>
			</thead>	
			<tfoot>
				<tr>
					<th scope="row">统计</th>
					<td colspan="8" id="page_bar"><s:property value="result.size"/>条 </td>
				</tr>
			</tfoot>
			<tbody>
				<s:iterator value="result.list">
				<tr>
					<td><s:property value='id'/></td>
					<td><s:property value='userName'/></td>
					<td><s:property value='userEmail'/></td>
					<td><s:property value='title'/></td>
					<td><s:property value='content'/></td>
					<td><a href="/admin/del_qa.zl?id=<s:property value='id'/>" class="del"/>删除</a></td>
				</tr>
				</s:iterator>
             </tbody>
        </table>
        </div>