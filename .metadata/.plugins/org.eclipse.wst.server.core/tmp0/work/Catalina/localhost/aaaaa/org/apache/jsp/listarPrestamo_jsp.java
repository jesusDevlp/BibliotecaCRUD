/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2022-11-06 15:13:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.cibertec.beans.PrestamoDTO;

public final class listarPrestamo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>Pr??stamo</title>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("\tcrossorigin=\"anonymous\" />\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/interfaz.css\" />\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/abe8abb470.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		List<PrestamoDTO> da = (List<PrestamoDTO>) request.getAttribute("data");
	
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<b><a class=\"navbar-brand\" style=\"font-size: 40px\" href=\"#\">Biblioteca</a></b>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("\t\t\t\tdata-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDarkDropdown\"\r\n");
      out.write("\t\t\t\taria-controls=\"navbarNavDarkDropdown\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNavDarkDropdown\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tid=\"navbarDarkDropdownMenuLink\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\tdata-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\tMantenimientos </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-dark\"\r\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"navbarDarkDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"ServletCliente?tipo=listar\">Cliente</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"ServletLibro?tipo=listar\">Libro</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"ServletPrestamo?tipo=listar\">Pr??stamo</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tid=\"navbarDarkDropdownMenuLink\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\tdata-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Registros </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-dark\"\r\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"navbarDarkDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Cliente</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Libro</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tid=\"navbarDarkDropdownMenuLink\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\tdata-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Consultas </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-dark\"\r\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"navbarDarkDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Cliente</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Libro</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tid=\"navbarDarkDropdownMenuLink\" role=\"button\"\r\n");
      out.write("\t\t\t\t\t\tdata-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Reportes </a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-dark\"\r\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"navbarDarkDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Cliente</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\">Libro</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"container my-3\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-12 col-md-4 col-lg-4 col-xl-4 py-4 bg-white\">\r\n");
      out.write("\t\t\t\t<h2>A??adir Pr??stamo</h2>\r\n");
      out.write("\t\t\t\t<form action=\"ServletPrestamo?tipo=registrar\" id=\"frmregistro\"\r\n");
      out.write("\t\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"nombre\" class=\"form-label\">Id Libro:</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"txt_libro\" id=\"libro\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Id Libro\" autofocus />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"nombre\" class=\"form-label\">Id Cliente:</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"txt_cliente\" id=\"cliente\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Id Cliente\" autofocus />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"nombre\" class=\"form-label\">Fecha Salida:</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"date\" class=\"form-control\" name=\"txt_salida\" id=\"fechasalida\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Fecha Salida\" autofocus />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"nombre\" class=\"form-label\">Fecha M??xima a Devolver:</label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"date\" class=\"form-control\" name=\"txt_devolver\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"fechamax\" placeholder=\"Fecha M??xima a Devolver\" autofocus />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"nombre\" class=\"form-label\">Fecha Devoluci??n:</label> <input type=\"date\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"txt_devolucion\" id=\"fechadev\" placeholder=\"Fecha Devoluci??n\"\r\n");
      out.write("\t\t\t\t\t\t\tautofocus />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"d-grid gap-2\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-success\" type=\"submit\">Registrar</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-secondary\">Limpiar</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-12 col-md-8 col-lg-8 col-xl-8 py-4 bg-white\">\r\n");
      out.write("\t\t\t\t<h2>Listado de Prestamos</h2>\r\n");
      out.write("\t\t\t\t<table class=\"table table-dark table-striped\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"centrado\">N??mero Pedido</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"centrado\">Nombre Libro</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"centrado\">Nombre Cliente</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"centrado\">Fecha Salida</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"centrado\">Fecha M??xima Devolver</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"centrado\">Fecha Devoluci??n</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"2\">ACCIONES</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						if (da != null) {
						for (PrestamoDTO a : da) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"centrado\">");
      out.print(a.getNroPedido());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"centrado\">");
      out.print(a.getNombreLibro());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"centrado\">");
      out.print(a.getNombreCliente());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"centrado\">");
      out.print(a.getFechaSalida());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"centrado\">");
      out.print(a.getFechaMaxDevolver());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"centrado\">");
      out.print(a.getFechaDevolucion());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"centrado\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"ServletPrestamo?tipo=buscar&cod=");
      out.print(a.getNroPedido());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img title=\"Editar\" src=\"img/pencil.png\" width=\"30px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"30px\">\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"ServletPrestamo?tipo=eliminar&cod=");
      out.print(a.getNroPedido());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img title=\"Eliminar\" src=\"img/eliminar.png\" width=\"30px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"30px\">\r\n");
      out.write("\t\t\t\t\t\t\t</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");

							} 
						}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
