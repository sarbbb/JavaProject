<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"
    import="Model.member"%>
 <%
 /*
 1.request-->接收-->desk,A,B,C
 2.A,B,C-->String cast to int
 3.new porder

 */
 request.setCharacterEncoding("BIG5");
 
 String Desk=request.getParameter("desk");
 int A=Integer.parseInt(request.getParameter("A"));		
 int B=Integer.parseInt(request.getParameter("B"));	
 int C=Integer.parseInt(request.getParameter("C"));	
 
 porder p=new porder(Desk,A,B,C);

 session.setAttribute("P",p);
 
 member m = (member)session.getAttribute("M");
 %>
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
			<td>
			<table width=450 align=center border=1>
				<tr>
					<td colspan=2 align=center><h3><%=m.getName() %>，這是你的訂單細目</h3>
				<tr>
					<td width=100 align=center><h5>桌號</h5>
					<td ><%=p.getDesk() %>
				<tr>
					<td width=100 align=center><h5>A餐</h5>
					<td ><%=p.getA() %>
				<tr>
					<td width=100 align=center><h5>B餐</h5>
					<td ><%=p.getB() %>
				<tr>
					<td width=100 align=center><h5>C餐</h5>
					<td ><%=p.getC() %>
				<tr>
					<td width=100 align=center><h5>共</h5>
					<td ><%=p.getSum() %>元
				<tr>
					<td colspan=2 align=center>
					<a href="../addPorderController">確定</a> ,<a href="addOrder.jsp">重新訂購</a>
					
			
			
			</table>
			
			
		<tr height=50>
			<td align=center><jsp:include page="footer.jsp"/>
	
	</table>

</body>
</html>