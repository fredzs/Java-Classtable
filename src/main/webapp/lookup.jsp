<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>全部预订信息</title>
<link rel="stylesheet" href="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"css/public.css"%>" />
</head>
<body>

	<div id="container">

		<div id="inner">
			<div class="content">
				<div class="divline">
					会议室预订列表
				</div>
				<div class="contentline">
					<table class="datatable">
					<tr>
						<td width="40">预订人</td>
						<td width="80">预订人电话</td>
                        <td width="40">教师</td>
						<td width="80">教师电话</td>
						<td width="40">会议室</td>
                        <td width="70">预订日期</td>
                        <td width="70">开始时间</td>
						<td width="70">结束时间</td>
						<td width="30">主题</td>
                        <td width="70">与会人</td>
                        <td width="30">操作</td>
					</tr>
					<s:iterator value="student_list" id="ulist" status="re">
						<tr>
							<td><s:property value="#ulist.student_ID" /></td>
							<td><s:property value="#ulist.student_name" /></td>
							<td><s:property value="#ulist.gender" /></td>
							<td><s:property value="#ulist.home_land" /></td>
							<td><s:property value="#ulist.birthday" /></td>
							<td><s:property value="#ulist.class_ID" /></td>	
							<td><s:property value="#ulist.email" /></td>
							<td><s:property value="#ulist.telephone" /></td>

						</tr>
					</s:iterator>
					</table>
				</div>
                <a class="button" href="_facebox.jsp" rel="facebox" title="预订会议室">预订会议室</a>
			</div>
		</div>

	</div>
     
<script src="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"js/public.js"%>"></script>
</body>

<script>
function remove( id ) 
{
	$.ajax({
		url : 'remove',
		type : 'post',
		data : {
			id : id
		},
		success : function() {
			alert("删除成功！");
			location.reload();
		}
	});
}
</script>

</html>