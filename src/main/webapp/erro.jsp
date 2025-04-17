<%--
  Created by IntelliJ IDEA.
  User: abner
  Date: 16/04/2025
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
    <head>
        <title><%= request.getAttribute("tituloPagina") != null ? request.getAttribute("tituloPagina") : "Erro" %></title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/content/style.css">
    </head>

    <body>
        <nav>
            <%@ include file="navbar.jsp" %>
        </nav>
        <h1 class="tituloPagina">
            <%= request.getAttribute("tituloPagina") != null ? request.getAttribute("tituloPagina") : "Erro Inesperado" %>
        </h1>
        <div class="container">
            <div class="imagem">
                <img src="${pageContext.request.contextPath}/content/img/pexels-anri-lilkov-2515851-4130210 1.png" id="imagemCapaErro">
                <h1 class="imgh1Erro">Erro 404</h1>
                <p class="imgpErro">Perdoe-nos o transtorno, esta página ainda está em desenvolvimento</p>
                <input type="button" class="botaoErro" value="Retornar a Página Inicial" onclick="window.location.href='index.jsp'">
            </div>
        </div>


        <footer>
            <%@ include file="footer.jsp" %>
        </footer>
    </body>
</html>
