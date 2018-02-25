package cn.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding(null);
		response.setContentType("text/html;charset=utf-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum;
		sum = num1 + num2;
		
		// ͨ��PrintWrite����
//		PrintWriter out = response.getWriter();
//		out.println("�ӷ���������");
//		out.println("������Ϊ��" + sum);
		
		// ͨ��ת�����
//		request.setAttribute("sum", sum);
//		request.getRequestDispatcher("/result.jsp").forward(request, response);
		
		// ͨ���ض������
		ServletContext sc = request.getServletContext();
		sc.setAttribute("sum", sum);
		response.sendRedirect("/ServletTest/result.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
