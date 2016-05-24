<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()%>/" />
<title>欢迎进入课表管理系统</title>
<link rel="stylesheet" href="css/index.css" type="text/css">
<link rel="stylesheet" href="css/layout.css" type="text/css">
<link rel="stylesheet" href="css/plugin.css" type="text/css">
<script type="text/javascript" src="js/jquery.js"></script>
</head>

<body>
<div class="login">
        <table >
        	<tr>
        		<td class="middlesize rightalign" width="200px">欢迎使用，请登录<p></td>
        	</tr>
        </table>
        <table >
        	<tr>
        		<td class="middlesize rightalign" width="60px">用户名</td>
        		<td colspan="2">
        		<input id="user_name" type="text" value="" class="editline" />
        		</td>
        	</tr>
        	<tr>
        		<td class="middlesize rightalign">密码</td>
        		<td colspan="2">
        		<input type="password" name="password" id="password" class="editline" value="" />
        		</td>
        	</tr>
        	<tr>
        		<td></td>
        		<td class="leftalign">
        		<input type="button" class="button" value="登陆" onClick="submit()" />
        		</td>
        		<td class="leftalign">
        		<span class="redletter" id="error"><br /></span>
        		</td>
        	</tr>
        </table>
	</div>

</body>
<script type="text/javascript" charset="gb2312">
function submit( ) 
{
	if($('#user_name').val()!="")
	{
		if($('#password').val()!="")
		{
			$.ajax
			({
				url : 'LoginCheck',
				type : 'post',
				data : 
				{
					user_name : $('#user_name').val(),
					password : $('#password').val(),
				},
				success : function(data) 
				{
					if (data.found==true)
					{
						if(data.user_type == "管理员")
						{
							alert("登陆成功！您的身份是管理员");
							location.href="admin?user_sign="+data.user_sign;
						}
						else if(data.user_type == "教师")
						{
							alert("登陆成功！您的身份是教师");
							location.href="teacher?teacher_ID="+data.user_sign;
						}
						else
						{
							alert("登陆成功！您的身份是学生");
							location.href="student?student_ID="+data.user_sign;
						}
					}
					else
					{
						alert("用户名或者密码错误，请重试！");
						location.reload();
					}
				}
			});
		}
		else
			alert("密码不能为空！");
	}
	else
		alert("用户名不能为空！");

}
</script>
</html>