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
            <td><div align="left">学号</div></td>
            <td><input id="student_ID" type="text" value="<s:property value="res.student_ID" />" class="editline" readonly/></td>
         </tr>
         <tr>
            <td><div align="left">学生姓名</div></td>
            <td><input id="student_name" type="text" value="<s:property value="res.student_name" />" class="editline" readonly/></td>
         </tr>
         <tr>
            <td><div align="left">身份证号</div></td>
            <td><input id="identity" type="text" value="<s:property value="res.identity" />" class="editline" readonly/></td>
         </tr>
         <tr>
            <td><div align="left">所属班级</div></td>
            <td><input id="class_ID" type="text" value="<s:property value="res.class_ID" />" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">电子邮箱</div></td>
            <td><input id="email" type="text" value="<s:property value="res.email" />" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">手机号码</div></td>
            <td><input id="telephone" type="text" value="<s:property value="res.telephone" />" class="editline" /></td>
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
	var a = $('#class_ID').val();
	var c = $('#telephone').val();
	if(a.length==10)
	{
		if($('#email').val()!="")
		{
			if(c.length==11)
			{
				$.ajax
				({
					url : 'EditStudent',
					type : 'post',
					data : 
					{
						student_ID : $('#student_ID').val(),
						student_name : $('#student_name').val(),
						identity : $('#identity').val(),
						class_ID : $('#class_ID').val(),
						email : $('#email').val(),
						telephone : $('#telephone').val(),
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
		alert("所属班级位数错误！");

}
function cancle()
{
	$(document).trigger('close.facebox');
}
</script>

</html>