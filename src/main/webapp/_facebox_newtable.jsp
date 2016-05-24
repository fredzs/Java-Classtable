<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>预订会议室</title>
<link rel="stylesheet" href="<%=com.free4lab.classtable.common.Constants.CSS_JS_SERVER+"css/public.css"%>" />
<script src="http://front.free4lab.com/js/public.js"></script>
</head>
<body>
     <table >
         <tr>
            <td width="20"><div align="left">课程名称</div></td>
            <td width="80"><input id="course_name" type="text" value="" class="editline"  /></td>
         </tr>
         <tr>
            <td><div align="left">开课学期</div></td>
            <td><input id="term_ID" type="text" value="" class="editline" />例：2012-秋</td>
         
         </tr>
         <tr>
            <td><div align="left">起始周数</div></td>
            <td><s:select theme="simple" id="start_week" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7',
            					'8':'8','9':'9','10':'10','11':'11','12':'12','13':'13','14':'14'
            					,'15':'15','16':'16','17':'17','18':'18','19':'19'}"/>
			</td>
         </tr>
         <tr>
            <td><div align="left">结束周数</div></td>
            <td><s:select theme="simple" id="end_week" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7',
            					'8':'8','9':'9','10':'10','11':'11','12':'12','13':'13','14':'14'
            					,'15':'15','16':'16','17':'17','18':'18','19':'19'}"/>
            </td>
         </tr>
         <tr>
            <td><div align="left">开课星期</div></td>
            <td><s:select theme="simple" id="weekday" list="#{
            					'1':'一','2':'二','3':'三','4':'四','5':'五'}"/>
            </td>
         </tr>
         <tr>
            <td><div align="left">开始时间</div></td>
            <td><s:select theme="simple" id="start_time" list="#{
            					'8':'8:00','10':'10:10','13':'13:30','15':'15:30','18':'18:30'}"/>
			</td>
         </tr>
         <tr>
            <td><div align="left">结束时间</div></td>
           	<td><s:select theme="simple" id="end_time" list="#{
            					'10':'9:50','12':'12:00','15':'15:20','17':'17:20','20':'20:20'}"/>
			</td>
         </tr>
         <tr>
            <td><div align="left">所属班级</div></td>
            <td><input id="class_ID" type="text" value="" class="editline" />例：2009211304</td>
         </tr>
         <tr>
            <td><div align="left">授课教师</div></td>
            <td><input id="teacher_name" type="text" value="" class="editline" />例：王老师</td>
         </tr>
         <tr>
            <td><div align="left">上课教室</div></td>
            <td><input id="classroom" type="text" value="" class="editline" />例：3-333</td>
         </tr>
		 <tr>
            <td><div align="left"></div></td>
            <td>
            	<input type="button" class="button" value="预订" onClick="submit()" />
           	  	<input type="button" class="button" value="取消" onClick="cancle()"/>
            </td>
         </tr>
     </table>
</body>



<script type="text/javascript" charset="gb2312">

function submit( ) 
{
	if ((($('#end_time').val()-$('#start_time').val())<=2)&&(($('#end_time').val()-$('#start_time').val())>0))
	{
		if (($('#end_week').val()-$('#start_week').val())>0)
		{
			if ($('#course_name').val()!="")
			{
				if($('#term_ID').val()!="")
				{
					if($('#weekday').val()!="")
					{
						if($('#class_ID').val()!="")
						{
							if($('#teacher_name').val()!="")
							{
								if($('#classroom').val()!="")
								{
									$.ajax
									({
										url : 'NewClassTable',
										type : 'post',
										data : 
										{
											course_name : $('#course_name').val(),
											term_ID : $('#term_ID').val(),
											start_week : $('#start_week').val(),
											end_week : $('#end_week').val(),
											weekday : $('#weekday').val(),
											start_time : $('#start_time').val(),
											end_time : $('#end_time').val(),
											class_ID : $('#class_ID').val(),
											teacher_name : $('#teacher_name').val(),
											classroom : $('#classroom').val()
										},
										success : function(data) {
											if (data.done)
											{
												$(document).trigger('close.facebox');
												alert("添加成功！");
													location.reload();
											}
											else
												alert("添加失败，请重试！");
											
											
										}
									});
								}
								else
									alert("上课教室不能为空！");
							}
							else
								alert("授课教师不能为空！");
						}
						else
							alert("所属班级不能为空！");
					}
					else
						alert("开课星期不能为空！");
				}
				else
					alert("开课学期不能为空！");
			}
			else
				alert("课程名称不能为空！");
		}
		else
			alert("开课周输入有误！");
	}
	else
		alert("1次课不能超过2小时。");
	
}
function cancle()
{
	$(document).trigger('close.facebox');
}
</script>



</html>