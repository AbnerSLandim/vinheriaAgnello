/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.4
 * Generated at: 2025-04-10 01:01:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1744220849391L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("	<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Home</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("		<nav> ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"content/style.css\">\r\n");
      out.write("		<link rel=\"icon\" type=\"image/x-icon\" href=\"content/img/logo-vinheria.png\">\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("	<div id=\"navbar\">\r\n");
      out.write("		<ul id=\"navbarUL\">\r\n");
      out.write("			<img src=\"content/img/logo-vinheria.png\" id=\"logo\">\r\n");
      out.write("			<li><a href=\"#vinhos\">Vinhos</a></li>\r\n");
      out.write("			<li><a href=\"#vinicolas\">Vinicolas</a></li>\r\n");
      out.write("			<li><a href=\"#presenteaveis\">Presenteaveis</a></li>\r\n");
      out.write("			<li><a href=\"#historia\">Nossa Historia</a></li>\r\n");
      out.write("			<li><a href=\"#club\">Club de Assinaturas</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
      out.write(" </nav>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"apresentação\">\r\n");
      out.write("				<h1>Vinheria Agnello</h1>\r\n");
      out.write("				<p>Descubra vinhos exóticos no nosso clube de assinatura, com recomendações personalizadas guiadas por um sommelier com inteligência artificial.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"imagem\">\r\n");
      out.write("				<img src=\"content/img/pexels-cottonbro-3171815 1.png\" id=\"imagemCapa\">\r\n");
      out.write("				<h1 class=\"imgh1\">Vinheria Agnello</h1>\r\n");
      out.write("				<p class=\"imgp\">A Maior Importadora de vinhos</p>\r\n");
      out.write("				<input type=\"button\" class=\"botao\" value=\"Conheça nossos rótulos\">\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<h1 class=\"produtoH1\">Produtos mais vendidos</h1>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"produtosVendidos\">\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"bebidasDisplay1\">\r\n");
      out.write("					<img src=\"content/img/freixenet-preto 1.png\">\r\n");
      out.write("					<h6>Freixenet Chanti 750ml</h6>\r\n");
      out.write("					<p>Após o grande sucesso do lançamento... Clique aqui!</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"bebidasDisplay2\">\r\n");
      out.write("					<img src=\"content/img/freixenet 1.jpg\">\r\n");
      out.write("					<h6>Freixenet Moscato 750ml</h6>\r\n");
      out.write("					<p>Após o grande sucesso do lançamento... Clique aqui!</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"bebidasDisplay3\">\r\n");
      out.write("					<img src=\"content/img/CasalGarcia_Rose-scaled 2.png\">\r\n");
      out.write("					<h6>Casal Garcia Rosé 750ml</h6>\r\n");
      out.write("					<p>Casal Garcia Rosé é um vinho jovem... Clique aqui!</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div id=\"produtosPresenteaveis\">\r\n");
      out.write("				<div class=\"presenteaveisHarmonia\">\r\n");
      out.write("					<h1>Conheça nossos presenteáveis</h1>\r\n");
      out.write("					\r\n");
      out.write("					<p class=\"presenteaveisTitulo\">Seleção do Sommelier</p>\r\n");
      out.write("					<p class=\"presenteaveisTexto\">Uma combinação equilibrada de vinhos, queijos e charcutaria para momentos especiais.</p>\r\n");
      out.write("					\r\n");
      out.write("					<p class=\"presenteaveisTitulo\">Box Harmonia</p>\r\n");
      out.write("					<p class=\"presenteaveisTexto\">Vinhos selecionados por especialistas, com notas de degustação e harmonização.</p>\r\n");
      out.write("					\r\n");
      out.write("					<input type=\"button\" class=\"botaoPresenteaveis\" value=\"Presenteaveis\">\r\n");
      out.write("						\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"presenteaveisImagem\">\r\n");
      out.write("					<img src=\"content/img/pexels-pixabay-248413 1.png\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div id=\"marcas\">\r\n");
      out.write("				<div class=\"marcaImagem\">\r\n");
      out.write("					<img src=\"content/img/Image.png\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"nossasMarcas\">\r\n");
      out.write("					<h6>Nossas Marcas</h6>\r\n");
      out.write("					<p>Conheça marcas únicas pensadas especialmente para você</p>\r\n");
      out.write("					<input type=\"button\" class=\"botaoMarcas\" value=\"Nossas Marcas\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<h1>Avaliações</h1>\r\n");
      out.write("			\r\n");
      out.write("			<div id=\"avaliacoes\">\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"bloquinhosAvaliacao1\">\r\n");
      out.write("					<p>“Vinhos exclusivos, só aqui!”</p>\r\n");
      out.write("					<img src=\"content/img/Avatar.png\" class=\"iconeAvaliacao\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"bloquinhosAvaliacao2\">\r\n");
      out.write("					<p>“Uma experiência Fantástica”</p>\r\n");
      out.write("					<img src=\"content/img/Avatar(1).png\" class=\"iconeAvaliacao\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div id=\"bloquinhosAvaliacao3\">\r\n");
      out.write("					<p>“Melhor loja online de vinhos!”</p>\r\n");
      out.write("					<img src=\"content/img/Avatar(2).png\" class=\"iconeAvaliacao\">\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("	\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
      out.write("	\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
