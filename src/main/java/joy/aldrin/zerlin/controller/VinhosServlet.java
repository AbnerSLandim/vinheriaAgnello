package joy.aldrin.zerlin.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import joy.aldrin.zerlin.bean.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Servlet implementation class VinhosServlet
 */
@WebServlet("/VinhosServlet")
public class VinhosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public VinhosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entrando no método doGet do ProdutoServlet");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Freixenet Chanti 750ml", "Vinho leve e frutado", "freixenet-preto-1.png", "Freixenet", "Espumante", 170.00));
        produtos.add(new Produto("Vinho Seco Natural Tinto Del Leste Matias Morcos - Blend, 2022 ", "Refrescante e aromas intensos", "tinto-este-1.png", "Matias Morcos", "Tinto", 150.00));
        produtos.add(new Produto("Vinho Seco Natural Branco Cântico - Chardonnay, 2020", "Vinho extremamente fresco", "180_vinho_natural_branco_cantico_chardonnay.png", "Cântico", "Branco", 250.00));

        String[] marcasSelecionadas = request.getParameterValues("marca");
        String faixaPreco = request.getParameter("preco");

        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto p : produtos) {
            boolean marcaOk = true;
            boolean precoOk = true;

            if (marcasSelecionadas != null) {
                marcaOk = Arrays.asList(marcasSelecionadas).contains(p.getMarca());
            }

            if (faixaPreco != null) {
                double preco = p.getPreco();
                switch (faixaPreco) {
                    case "150":
                        precoOk = preco <= 150;
                        break;
                    case "170":
                        precoOk = preco > 150 && preco <= 170;
                        break;
                    case "200+":
                        precoOk = preco > 200;
                        break;
                }
            }


            if (marcaOk && precoOk) {
                produtosFiltrados.add(p);
            }
        }

        // Se nenhum filtro foi aplicado, mostra todos os produtos
        if ((marcasSelecionadas == null || marcasSelecionadas.length == 0) && faixaPreco == null) {
            produtosFiltrados = produtos;
        }

        request.setAttribute("produtos", produtosFiltrados);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/vinhos.jsp");
        dispatcher.forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

