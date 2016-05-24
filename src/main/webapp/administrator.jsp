<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()%>/" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>全部课程表信息</title>
<link rel="stylesheet" href="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"css/public.css"%>" />
</head>
<body>

	<div id="container">
		<div id="inner">
			<div class="content">
				<div class="divline">
					全部课程
				</div>
				<div class="contentline">
					<table class="datatable">
					<tr>		
						<td width="30">课表编号</td>
						<td width="80">课程名称</td>
						<td width="60">开课学期</td>
						<td width="30">起始周数</td>
                        <td width="30">结束周数</td>
                        <td width="60">开课星期</td>
						<td width="30">起始时间</td>
                        <td width="30">结束时间</td>
                        <td width="80">所属班级</td>
                        <td width="60">授课教师</td>
                        <td width="60">上课教室</td>
                        <td width="30">操作</td>
					<s:iterator value="classtable_list" id="res" status="re">
						<tr>
							<td><s:property value="#res.table_ID" /></td>
							<td><s:property value="#res.course_name" /></td>
							<td><s:property value="#res.term_ID" /></td>
							<td><s:property value="#res.start_week" /></td>
                            <td><s:property value="#res.end_week" /></td>
                            <td><s:property value="#res.weekday" /></td>
							<td><s:property value="#res.start_time" /></td>
							<td><s:property value="#res.end_time" /></td>
                            <td><s:property value="#res.class_ID" /></td>
							<td><s:property value="#res.teacher_name" /></td>
							<td><s:property value="#res.classroom" /></td>
                            <td><a href="getoldclasstable?table_ID=<s:property value="#res.table_ID"/>" rel="facebox" >修改</a>
                           		<a href="javascript:void(0)" onclick="remove('<s:property value="#res.table_ID"/>')" >删除</a></td>
						</tr>
					</s:iterator>
					</table>
				</div>
                <a class="button" href="_facebox_password.jsp" rel="facebox" title="修改密码">修改密码</a>
                <a class="button" href="_facebox_newcourse.jsp" rel="facebox" title="增加课程">增加课程</a>
                <a class="button" href="admin" title="全部课程表">全部课程表</a>
                <a class="button" href="_facebox_newtable.jsp" rel="facebox" title="增加课程表">增加课程表</a>
                <s:select theme="simple" id="search_type" list="#{'term_ID':'学期编号','teacher_name':'教师姓名','class_ID':'班级编号','classroom':'教室','course_name':'课程名称'}"/>
            	<input id="search_str" name="search_str" type="text" value="" class="editline" />
                <a id="sear" class="button" href="javascript:void(0)" onclick="url()">查找课程表</a>
                <a class="button" href="">退出登录</a>
			</div>
		</div>
	</div>
     
<script src="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"js/public.js"%>"></script>
</body>

<script>
function remove( table_ID ) 
{
	$.ajax({
		url : 'remove',
		type : 'post',
		data : {
			table_ID : table_ID
		},
		success : function() {
			alert("删除成功！");
			location.reload();
		}
	});
}

function url()
{
	var sty = $('#search_type').val();
	var str = $('#search_str').val();
	document.getElementById("sear").href="search?search_type="+sty+"&search_str="+str;
	
}
</script>

</html>