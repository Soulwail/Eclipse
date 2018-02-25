package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4Servlet
 */
@WebServlet("/Demo4Servlet")
public class Demo4Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ת�������ݸ�ĳ��jspҳ��
//		request.setAttribute("username", "����");
//		request.getRequestDispatcher("/demo.jsp").forward(request, response);
		
		//ͨ���ض�������ݹ�ȥ
		ServletContext sc = request.getServletContext();
		sc.setAttribute("goods", "����");
		response.sendRedirect("/imooc_servlet1/demo.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
