<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int s1 = (int)request.getAttribute("simbolo1");
	int s2 = (int)request.getAttribute("simbolo2");
	int s3 = (int)request.getAttribute("simbolo3");	
	String nome = (String)request.getAttribute("nome");
%>
	Jogador: <%out.println(nome);%>
    <table class="table">
	<tr>
		<th>Simbolo1</th>
		<th>Simbolo2</th>
		<th>Simbolo3</th>
	</tr>
	<tr>
	    <td><%out.println(s1);%></td>
	    <td><%out.println(s2);%></td>
	    <td><%out.println(s3);%></td>
	</tr>
	</table>

	
</body>
</html>