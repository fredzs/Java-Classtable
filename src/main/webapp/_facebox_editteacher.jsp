<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>增加课程表</title>
<link rel="stylesheet" href="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"css/public.css"%>" />
<script src="http://front.free4lab.com/js/public.js"></script>
</head>
<body>
     <table >	
         <tr>
            <td><div align="left">教师编号</div></td>
            <td><input id="teacher_ID" type="text" value="<s:property value="res.teacher_ID" />" class="editline" readonly/></td>
         </tr>
         <tr>
            <td><div align="left">教师姓名</div></td>
            <td><input id="teacher_name" type="text" value="<s:property value="res.teacher_name" />" class="editline" readonly/></td>
         </tr>
         <tr>
            <td><div align="left">身份证号</div></td>
            <td><input id="identity" type="text" value="<s:property value="res.identity" />" class="editline" readonly/></td>
         </tr>
         <tr>
            <td><div align="left">电子邮箱</div></td>
            <td><input id="email" type="text" value="<s:property value="res.email" />" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">手机号码</div></td>
            <td><input id="phone" type="text" value="<s:property value="res.phone" />" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">所属院系</div></td>
            <td><input id="academy" type="text" value="<s:property value="res.academy" />" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left"></div></td>
            <td>
            	<input type="button" class="button" value="修改" onClick="submit()" />
           	  <input type="button" class="button" value="取消" onClick="cancle()" />
            </td>
         </tr>
     </table>
</body>



<script>

function submit( ) 
{
	var c = $('#phone').val();
	if($('#academy').val()!="")
	{
		if($('#email').val()!="")
		{
			if(c.length==11)
			{
				$.ajax
				({
					url : 'EditTeacher',
					type : 'post',
					data : 
					{
						teacher_ID : $('#teacher_ID').val(),
						teacher_name : $('#teacher_name').val(),
						identity : $('#identity').val(),
						email : $('#email').val(),
						phone : $('#phone').val(),
						academy : $('#academy').val(),
					},
					success : function(data) {
						if (data.done)
						{
							$(document).trigger('close.facebox');
							alert("修改成功！");
								location.reload();
						}
						else
							alert("修改失败，请重试！");
					}
				});
			}
			else
				alert("手机号码位数错误！");
		}
		else
			alert("电子邮箱不能为空！");
	}
	else
		alert("所属院系不能为空！");

}
function cancle()
{
	$(document).trigger('close.facebox');
}
</script>

</html>