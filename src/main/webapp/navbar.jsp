<%--
  Created by IntelliJ IDEA.
  User: abner
  Date: 15/04/2025
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/content/style.css">
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/content/img/logo-vinheria.png">
</head>

<body>
<div id="navbar">
    <ul id="navbarUL">
        <a href="index.jsp"><img src="${pageContext.request.contextPath}/content/img/logo-vinheria.png" id="logo"></a>
        <li><a href="VinhosServlet">Vinhos</a></li>
        <li><a href="erro?pagina=Vinicolas">Vinicolas</a></li>
        <li><a href="erro?pagina=Presenteaveis">Presenteaveis</a></li>
        <li><a href="erro?pagina=Nossa%20Historia">Nossa História</a></li>
        <li><a href="erro?pagina=Club%20de%20Assinaturas">Club de Assinaturas</a></li>

    </ul>
</div>


</body>
</html>
