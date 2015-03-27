<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored = "false" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="../style/my-style.css">
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de estudiantes</title>
</head>
<body>
<div class="container">
	<div class="row">
		<h2 class="col-md-12 text-center"><em><strong>Hello ${name}</strong></em></h2>
	</div>
	<div class="col-md-6 col-md-offset-3">
		<table class="table table-bordered">
		<tr class="info">
			<td><em>Nombre</em></td>
			<td><em>C.c./ T.I.</em></td>
			<td><em>Edad</em></td>
			<td><em>Nota</em></td>
		</tr>
		<c:forEach var="item" items="${students}"> 
			<tr>
				<td>
					${item.nombre}
				</td>
				<td>
					${item.cc}
				</td>
				<td>
					${item.edad}
				</td>
				<td>
					${item.nota}
				</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>
</body>
</html>