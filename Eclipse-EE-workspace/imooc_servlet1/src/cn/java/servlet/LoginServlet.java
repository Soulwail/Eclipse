package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ���ύ����������
		// getParameter()�������Ի�ȡ����Ĳ�����Ϣ
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// ��ӡ��ȡ���Ĳ�����Ϣ
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		// ���username=admin,password=123����ת��success.jsp,������ת��fail.jsp
		// 1��ͨ��ת��ʵ����ת
		if ("admin".equals(username) && "123".equals(password)) {
			request.getRequestDispatcher("/success.jsp").forward(request, response);
		}else {
			// request.getRequestDispatcher("/fail.jsp").forward(request, response);
			// 2���ض���
			response.sendRedirect("/imooc_servlet1/fail.jsp");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
