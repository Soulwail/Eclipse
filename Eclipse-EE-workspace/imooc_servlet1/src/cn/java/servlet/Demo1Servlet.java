package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext���󣺱�ʾ��������JavaWeb����
 * ServletConfig���󣺱�ʾ����ĳһ��Servlet�е������ļ�
 */
@WebServlet("/Demo1Servlet")
public class Demo1Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ����ĳһ��JavaWeb���̵�ServletContext����
		// Context������һ������󣬿�����ĳһ��������д�����ݣ����һ�����ȡ����ŵ�����
		ServletContext context = this.getServletContext();
		// ��context������д������
		context.setAttribute("username", "����");
		// ȡ��context������е�����
		Object result = context.getAttribute("username");
		// ��ӡȡ�����
		System.out.println(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
