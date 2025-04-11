<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			
			    <div class="secao-filtro">
			      <h3>Marca</h3>
			      <div class="checkbox-grupo">
			        <label><input type="checkbox" name="marca" value="Miolo"> Miolo</label>
			        <label><input type="checkbox" name="marca" value="Concha y Toro"> Concha y Toro</label>
			        <label><input type="checkbox" name="marca" value="Salton"> Salton</label>
			      </div>
			    </div>
			
			    <div class="secao-filtro">
			      <h3>Faixa de Preço</h3>
			      <div class="checkbox-grupo">
			        <label><input type="checkbox" name="preco" value="50"> Até R$ 50</label>
			        <label><input type="checkbox" name="preco" value="100"> R$ 51 - R$ 100</label>
			        <label><input type="checkbox" name="preco" value="101+"> Acima de R$ 100</label>
			      </div>
			    </div>
			  </div>
			
			  <div class="precoVinhos">
			    <h1>Lista de Vinhos</h1>
			    <p>Conteúdo da página vai aqui...</p>
			  </div>
					
		</div>
		
		
		<footer><%@ include file="footer.jsp" %> </footer>
	
	</body>
</html>