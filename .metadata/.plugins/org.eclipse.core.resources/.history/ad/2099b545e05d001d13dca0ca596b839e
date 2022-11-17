package com.cibertec.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cibertec.beans.LoginDTO;
import com.cibertec.services.LoginService;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService serviLogin = new LoginService();

    /**
     * Default constructor. 
     */
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login, clave;
		login = request.getParameter("txtlogin");
		clave = request.getParameter("txtclave");
		LoginDTO e = serviLogin.iniciarSesion(login, clave);
		if (e == null) {
			request.setAttribute("msj", "Error usuario y/o clave");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("ServletCliente?tipo=listar");
		}
	
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
