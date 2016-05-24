<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加课程</title>
<link rel="stylesheet" href="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"css/public.css"%>" />
</head>
<body>
     <table >
         <tr>
            <td width="58"><div align="left">课程名称<span class="redletter">*</span></div></td>
            <td width="241"><input id="course_name" type="text" value=" " class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left">课程所属学院<span class="redletter">*</span></div></td>
            <td><input id="academy" type="text" value="" class="editline" /></td>
         </tr>
         <tr>
            <td><div align="left"></div></td>
            <td>
            	<input type="button" class="button" value="添加" onClick="submit()" />
           	  <input type="button" class="button" value="取消" onClick="cancle()"/>
            </td>
         </tr>
     </table>
</body>
<script src="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"js/public.js"%>"></script>

<script type="text/javascript" charset="gb2312">

function submit( ) 
{
	if($('#course_name').val()!="")
	{
		if($('#academy').val()!="")
		{
			$.ajax
			({
				url : 'newcourse',
				type : 'post',
				data : 
				{
					course_name : $('#course_name').val(),
					academy : $('#academy').val(),
				},
				success : function(data) 
				{
					$(document).trigger('close.facebox');
					alert("添加成功！");
					//location.reload();
				}
			});
		}
		else
			alert("课程名称！");
	}
	else
		alert("课程所属学院！");
}
function cancle()
{
	$(document).trigger('close.facebox');
}
</script>


</html>