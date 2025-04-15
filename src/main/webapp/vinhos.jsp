<%--
  Created by IntelliJ IDEA.
  User: abner
  Date: 15/04/2025
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>




<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Vinhos</title>
</head>
<body>

<nav> <%@ include file="navbar.jsp" %> </nav>
<div id="vinhos">
    <div class="barra-lateral">
        <h2>Filtros</h2>
        <form method="get" action="VinhosServlet">
            <div class="secao-filtro">
                <h3>Marca</h3>
                <div class="checkbox-grupo">
                    <label><input type="checkbox" name="marca" value="Matias Morcos"> Matias Morcos</label>
                    <label><input type="checkbox" name="marca" value="Freixenet"> Freixenet</label>
                    <label><input type="checkbox" name="marca" value="Cântico"> Cântico</label>
                </div>
            </div>

            <div class="secao-filtro">
                <h3>Preço</h3>
                <div class="checkbox-grupo">
                    <label><input type="radio" name="preco" value="150"> Até R$ 150</label>
                    <label><input type="radio" name="preco" value="170"> R$ 151 - R$ 170</label>
                    <label><input type="radio" name="preco" value="200+"> Acima de R$ 200</label>
                </div>
            </div>

            <button type="submit">Filtrar</button>
        </form>
    </div>


    <div class="precoVinhos">
        <h1>Lançamentos e novas Safras</h1>
        <c:forEach var="p" items="${produtos}">
            <div class="product-card">
                <img src="${pageContext.request.contextPath}/content/img/${p.imagem}" alt="${p.nome}">
                <h3>${p.nome}</h3>
                <p>${p.descricao}</p>
            </div>
        </c:forEach>

    </div>>

</div>


<footer><%@ include file="footer.jsp" %> </footer>

</body>
</html>
