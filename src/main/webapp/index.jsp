<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/content/style.css">
    <title>Home</title>
</head>

<body>
<nav> <%@ include file="navbar.jsp" %> </nav>

<div class="container">
    <div class="apresentação">
        <h1>Vinheria Agnello</h1>
        <p>Descubra vinhos exóticos no nosso clube de assinatura, com recomendações personalizadas guiadas por um sommelier com inteligência artificial.</p>
    </div>

    <div class="imagem">
        <img src="content/img/pexels-cottonbro-3171815 1.png" id="imagemCapa">
        <h1 class="imgh1">Vinheria Agnello</h1>
        <p class="imgp">A Maior Importadora de vinhos</p>
        <input type="button" class="botao" value="Conheça nossos rótulos" onclick="window.location.href='VinhosServlet'">


    </div>

    <h1 class="produtoH1">Produtos mais vendidos</h1>

    <div class="produtosVendidos">


        <div class="bebidasDisplay1">
            <img src="content/img/freixenet-preto-1.png">
            <h6>Freixenet Chanti 750ml</h6>
            <p>Após o grande sucesso do lançamento... Clique aqui!</p>
        </div>

        <div class="bebidasDisplay2">
            <img src="content/img/freixenet-1.jpg">
            <h6>Freixenet Moscato 750ml</h6>
            <p>Após o grande sucesso do lançamento... Clique aqui!</p>
        </div>

        <div class="bebidasDisplay3">
            <img src="${pageContext.request.contextPath}/content/img/CasalGarcia_Rose-scaled 2.png">
            <h6>Casal Garcia Rosé 750ml</h6>
            <p>Casal Garcia Rosé é um vinho jovem... Clique aqui!</p>
        </div>
    </div>

    <div id="produtosPresenteaveis">
        <div class="presenteaveisHarmonia">
            <h1>Conheça nossos presenteáveis</h1>

            <p class="presenteaveisTitulo">Seleção do Sommelier</p>
            <p class="presenteaveisTexto">Uma combinação equilibrada de vinhos, queijos e charcutaria para momentos especiais.</p>

            <p class="presenteaveisTitulo">Box Harmonia</p>
            <p class="presenteaveisTexto">Vinhos selecionados por especialistas, com notas de degustação e harmonização.</p>

            <input type="button" class="botaoPresenteaveis" value="Presenteaveis" onclick="window.location.href='PresenteaveisServlet'">

        </div>

        <div class="presenteaveisImagem">
            <img src="${pageContext.request.contextPath}/content/img/pexels-pixabay-248413-1.png">
        </div>
    </div>

    <div id="marcas">
        <div class="marcaImagem">
            <img src="content/img/Image.png">
        </div>

        <div id="nossasMarcas">
            <h6>Nossas Marcas</h6>
            <p>Conheça marcas únicas pensadas especialmente para você</p>
            <input type="button" class="botaoMarcas" value="Nossas Marcas" onclick="window.location.href='VinhosServlet'">
        </div>
    </div>

    <h1 id="avaliacoesTexto">Avaliações</h1>

    <div id="avaliacoes">

        <div id="bloquinhosAvaliacao1">
            <p>“Vinhos exclusivos, só aqui!”</p>
            <img src="content/img/Avatar.png" class="iconeAvaliacao">
        </div>

        <div id="bloquinhosAvaliacao2">
            <p>“Uma experiência Fantástica”</p>
            <img src="content/img/Avatar(1).png" class="iconeAvaliacao">
        </div>

        <div id="bloquinhosAvaliacao3">
            <p>“Melhor loja online de vinhos!”</p>
            <img src="content/img/Avatar(2).png" class="iconeAvaliacao">
        </div>

    </div>

    <footer><%@ include file="footer.jsp" %> </footer>

</div>
</body>

</html>