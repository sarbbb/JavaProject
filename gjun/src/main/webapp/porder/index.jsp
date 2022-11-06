<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<table width=600 align=center border=1>
		<tr height=100>
			<td align=center><jsp:include page="title.jsp"/>
		<tr height=450>
			<td >
			
			<table width=300 align=center border=0>
				<tr>
					<td align=center><a href="addOrder.jsp">1)新增</a>
				<tr>
					<td align=center><a href="query.jsp">2)查詢</a>
				<tr>
					<td align=center><a href="update.jsp">3)修改</a>
				<tr>
					<td align=center><a href="delete.jsp">4)刪除</a>
				
			</table>
			
			
			
		<tr height=50>
			<td align=center><jsp:include page="footer.jsp"/>
	
	</table>

</body>
</html>