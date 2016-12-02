<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Prova Final</title>
</head>
<body>
<form action="servletControl.do" method="post">
	Nome do Jogador:<br>
	<input type="text" name="nome" id="nome"><br>
	Moedas:<br>
	<input type="text" name="moedas" readonly><br>
  
  <input type="submit" value="Alavanca">

</form>

	Siimbolo1:<input type="text" name="simbolo1" readonly value=""><br>
	Simbolo2:<input type="text" name="simbolo2" readonly value=""><br>
	Simbolo3:<input type="text" name="simbolo3" readonly value=""><br>
</body>
</html>