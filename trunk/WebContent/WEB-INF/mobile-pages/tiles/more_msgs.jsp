<%@ page language="java" contentType="application/xhtml+xml;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="div_panel">
	
	<div class="div_panel_header" >
		你共有(<s:property value="item_total_count" />)条信息,
		当前第(<s:property value="page_index" />)页
		-共(<s:property value="page_count" />)页
	</div>
	<div class="div_panel">
		<form method="post" action="msglist.do">
			<select name="formMessages.msgListPageIndex" >
				<s:iterator status="stat" value="(page_count).{ #this }">
					<option value="<s:property value='#stat.index' />"
						<s:if test="#stat.index == page_index">
							selected="true"
						</s:if>
					><s:property value="#stat.count" /></option>
				</s:iterator>
			</select>
			<input type="submit" value="翻页" />
			<a href="msgsend.do?a=new" ><input type="button" value="写消息" /></a>
		</form>
	</div>
	<form method="post" action="delete_msgs.do">
		<div class="div_panel">
			<table>
			<s:iterator value="paged_messages" >
				<tr>
					<td width="5%">
						<input name="formMessages.selectedMessageID" type="checkbox" value="<s:property value='id' />" />
					</td>
					<td width="5%">&nbsp;</td>
					<td width="50%"><s:property value="fromUser" /></td>
					<td width="40%" align="right"><s:date name="createTime" format="yyyy/MM/dd HH:mm"/></td>	
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
					<td colspan="2">
						<a href="msgdetail.do?formMessages.selectedMsgId=<s:property value='id' />" >
							<span 
								<s:if test="status=='Unread'" >
								style="font-weight:bold"
								</s:if>
							>
								<s:property value="title" />
							</span>
						</a>
					</td>
				</tr>
			</s:iterator>
			</table>
		</div>
		<div style="padding:4px 2px;">
			<s:if test="urlBack != null ">
				<a href="<s:property value='urlBack' />"><input type="button" value="返&nbsp;回" /></a>&nbsp;
			</s:if>
			<input type="submit" value="删&nbsp;除" />
		</div>
	</form>
</div>