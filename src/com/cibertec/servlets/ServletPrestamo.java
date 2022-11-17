package com.cibertec.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cibertec.beans.LibroDTO;
import com.cibertec.beans.PrestamoDTO;
import com.cibertec.services.LibroService;
import com.cibertec.services.PrestamoService;

/**
 * Servlet implementation class ServletPrestamo
 */
@WebServlet("/ServletPrestamo")
public class ServletPrestamo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrestamoService serviPres = new PrestamoService();
	LibroService serviLibro = new	LibroService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPrestamo() {
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
    
    private void eliminar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    	String dato = request.getParameter("cod");
	      int codigo = Integer.parseInt(dato);
	      serviPres.eliminarPrestamo(codigo);
	      request.getRequestDispatcher("ServletPrestamo?tipo=listar").forward(request, response);
		
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrestamoDTO obj = new PrestamoDTO();
		String nroPedido = request.getParameter("nro_pedido");
		String codLibro = request.getParameter("txt_libro");
		String codCliente = request.getParameter("txt_cliente");
		String fechaSalida = request.getParameter("txt_salida");		
		String fechaDev = request.getParameter("txt_devolucion");
		String estado = request.getParameter("txt_estado");
		obj.setNroPedido(Integer.parseInt(nroPedido));
		obj.setIdLibro(Integer.parseInt(codLibro));
		obj.setIdCliente(Integer.parseInt(codCliente));
		obj.setFechaSalida(fechaSalida);
		obj.setFechaDevolucion(fechaDev);
		obj.setEstado(estado);
		int estado1 = serviPres.actualizarPrestamo(obj);
		if (estado1 != -1 ) {
			LibroDTO libro = serviLibro.buscarLibro(Integer.parseInt(codLibro));
			libro.setEstado(estado);
			serviLibro.actualizarLibro(libro);
			listar(request, response);
		}else
			response.sendRedirect("error.html");

	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String dato = request.getParameter("cod");
	      int codigo = Integer.parseInt(dato);
	      PrestamoDTO x = serviPres.buscarPrestamo(codigo);
	      request.setAttribute("registro", x);
	      request.getRequestDispatcher("actualizarPrestamo.jsp").forward(request, response);

	}

	private void registrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrestamoDTO obj = new PrestamoDTO();
		String codLibro = request.getParameter("txt_libro");
		String codCliente = request.getParameter("txt_cliente");
		String fechaSalida = request.getParameter("txt_salida");
		String fechaDev = request.getParameter("txt_devolucion");
		String estado = request.getParameter("txt_estado");
		obj.setIdLibro(Integer.parseInt(codLibro));
		obj.setIdCliente(Integer.parseInt(codCliente));
		obj.setFechaSalida(fechaSalida);
		obj.setFechaDevolucion(fechaDev);
		obj.setEstado(estado);
		int estado1 = serviPres.registraPrestamo(obj);
		if (estado1 != -1)
			listar(request, response);
		else
			response.sendRedirect("error.html");

	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data", serviPres.listarPrestamo());;
		request.getRequestDispatcher("listarPrestamo.jsp").forward(request, response);

	}
	
	

}
