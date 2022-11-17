package com.cibertec.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cibertec.beans.LibroDTO;
import com.cibertec.dao.MySQLLibroDao;
import com.cibertec.services.LibroService;

/**
 * Servlet implementation class ServletLibro
 */
@WebServlet("/ServletLibro")
public class ServletLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroService serviLibro = new LibroService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLibro() {
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
		else if(tipo.equals("libroautor"))
			libroautor(request,response);

	}

	
	private void libroautor(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
		String autor = request.getParameter("autor");
		List<LibroDTO> info = new MySQLLibroDao().libroAutor(autor);
		request.setAttribute("data", info);
		request.getRequestDispatcher("listarLibroAutor.jsp").forward(request, response);
		
	}

	protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data", serviLibro.listarLibro());;
		request.getRequestDispatcher("listarLibro.jsp").forward(request, response);
	}
	
	private void registrar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	      String nom = request.getParameter("txt_nom");
	      String edit = request.getParameter("txt_edit");
	      int autor = Integer.parseInt(request.getParameter("txt_autor"));
	      int genero = Integer.parseInt(request.getParameter("txt_genero"));
	      String paginas = request.getParameter("txt_paginas");
	      String precio = request.getParameter("txt_precio");
	      String estado = request.getParameter("txt_estado");
	      LibroDTO obj = new LibroDTO();
	      obj.setNomLibro(nom);
	      obj.setEditorial(edit);
	      obj.setIdAutor(autor);
	      obj.setIdGenero(genero);
	      obj.setNumPaginas(Integer.parseInt(paginas));
	      obj.setPrecio(Double.parseDouble(precio));
	      obj.setEstado(estado);
	      serviLibro.registraLibro(obj);	     
	         listar(request, response);
	     	      
	}
	
	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  LibroDTO obj = new LibroDTO();
	      String cod = request.getParameter("txt_cod");
	      String nom = request.getParameter("txt_nom");
	      String edit = request.getParameter("txt_edit");
	      int autor = Integer.parseInt(request.getParameter("txt_autor"));
	      int genero = Integer.parseInt(request.getParameter("txt_genero"));
	      String paginas = request.getParameter("txt_paginas");
	      String precio = request.getParameter("txt_precio");
	      String estado = request.getParameter("txt_estado");	 
	      obj.setIdLibro(Integer.parseInt(cod));
	      obj.setNomLibro(nom);
	      obj.setEditorial(edit);
	      obj.setIdAutor(autor);
	      obj.setIdGenero(genero);
	      obj.setNumPaginas(Integer.parseInt(paginas));
	      obj.setPrecio(Double.parseDouble(precio));
	      obj.setEstado(estado);
	     serviLibro.actualizarLibro(obj);		      
	         listar(request, response);	  
	    	  
	         
	}
	
	private void buscar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String dato = request.getParameter("cod");
	      int codigo = Integer.parseInt(dato);
	      LibroDTO x = serviLibro.buscarLibro(codigo);
	      request.setAttribute("registro", x);
	      request.getRequestDispatcher("actualizarLibro.jsp").forward(request, response);
	}
	
	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String dato = request.getParameter("cod");
	      int codigo = Integer.parseInt(dato);
	     serviLibro.eliminarLibro(codigo);
	      request.getRequestDispatcher("ServletLibro?tipo=listar").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
