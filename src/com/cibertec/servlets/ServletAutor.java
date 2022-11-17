package com.cibertec.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cibertec.beans.AutorDTO;
import com.cibertec.services.AutorService;

/**
 * Servlet implementation class AutorServlet
 */
@WebServlet("/ServletAutor")
public class ServletAutor extends HttpServlet {
	AutorService serviAutor = new AutorService();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tipo = request.getParameter("tipo");
		if (tipo.equals("listar"))
			listar(request, response);
		else if (tipo.equals("registrar"))
			registrar(request, response);
		else if (tipo.equals("buscar"))
			buscar(request, response);
		else if (tipo.equals("actualizar"))
			actualizar(request, response);
		else if (tipo.equals("eliminar"))
			eliminar(request, response);

	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 String dato = request.getParameter("cod");
	      int codigo = Integer.parseInt(dato);
	    serviAutor.eliminaAutor(codigo);
	      request.getRequestDispatcher("ServletAutor?tipo=listar").forward(request, response);
		
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		AutorDTO obj = new AutorDTO();
	      String cod = request.getParameter("txt_cod");
	      String nom = request.getParameter("txt_nom");
	      String pais = request.getParameter("txt_pais");
	      obj.setIdAutor(Integer.parseInt(cod));
	      obj.setNombreAutor(nom);
	      obj.setPaisAutor(pais);
	      int estado = serviAutor.actualizaAutor(obj);
	      if (estado != -1)
	         listar(request, response);
	      else
	         response.sendRedirect("error.html");
		
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 String dato = request.getParameter("cod");
	      int codigo = Integer.parseInt(dato);
	      AutorDTO x = serviAutor.buscaAutor(codigo);
	      request.setAttribute("registro", x);
	      request.getRequestDispatcher("actualizarAutor.jsp").forward(request, response);
		
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		AutorDTO obj = new AutorDTO();
	      String nom = request.getParameter("txt_nom");
	      String pais = request.getParameter("txt_pais");
	      obj.setNombreAutor(nom);
	      obj.setPaisAutor(pais);
	      int estado = serviAutor.registrarAutor(obj);
	      if (estado != -1)
	         listar(request, response);
	      else
	         response.sendRedirect("error.html");
		
	}

	private void listar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setAttribute("data", serviAutor.listaAutor());;
		request.getRequestDispatcher("listarAutor.jsp").forward(request, response);
		
	}
	

}
