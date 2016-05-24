<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改密码</title>
<link rel="stylesheet" href="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"css/public.css"%>" />
</head>
<body>
     <table >
         <tr>
            <td width="58"><div align="left">用户名<span class="redletter" >*</span></div></td>
            <td width="241"><input id="user_name" type="text" value="" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">原密码<span class="redletter">*</span></div></td>
            <td><input id="oldpass" type="text" value="" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">新密码<span class="redletter">*</span></div></td>
            <td><input id="newpass" type="text" value="" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left"></div></td>
            <td>
            	<input type="button" class="button" value="修改" onClick="submit()" />
           	  <input type="button" class="button" value="取消" onClick="cancle()"/>
            </td>
         </tr>
     </table>
</body>
<script src="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"js/public.js"%>"></script>

<script type="text/javascript" charset="gb2312">

function submit( ) 
{
	if(check())
	{
		$.ajax
		({
			url : 'EditPassword',
			type : 'post',
			data : 
			{
				user_name : $('#user_name').val(),
				oldpass : $('#oldpass').val(),
				newpass : $('#newpass').val(),
			},
			success : function(data) 
			{
				//alert(data.done);
				if (data.done)
				{
					$(document).trigger('close.facebox');
					alert("修改成功！");
					//location.reload();
				}
				else
				{
					alert("修改失败！");
				}
			}
		});
	}
}
function cancle()
{
	$(document).trigger('close.facebox');
}
function check()
{
	var user_name = $('#user_name').val();
	var oldpass = $('#oldpass').val();
	var newpass = $('#newpass').val();
	if(user_name.length>0)
	{
		if(oldpass.length>0)
		{
			if(newpass.length>7)
			{
				var str = /[0-9]{2,}/;
				if (str.exec(newpass))
				{
					return true;
				}
				else
					alert("新密码至少要包含2个数字！");
			}
			else
				alert("新密码长度不能小于8！");
		}
		else
			alert("旧密码不能为空！");
	}
	else
		alert("用户名不能为空！");
	return false;
}
</script>


</html>