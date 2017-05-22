package com.distribuida;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebServlet
public class TransaccionBancariaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TransaccionBancaria tB;

	@Override
	public void init() throws ServletException {
		super.init();

		ApplicationContext springContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		tB = (TransaccionBancaria) springContext.getBean("transaccionBancaria");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cuenta1 = request.getParameter("cuenta1");
		String cuenta2 = request.getParameter("cuenta2");
		float monto = Float.parseFloat(request.getParameter("monto"));
		String resultado= tB.realizarTransferencia(cuenta1, cuenta2, monto);
		System.out.println(resultado);
		getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
	}

}