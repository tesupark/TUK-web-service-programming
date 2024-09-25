package jspbook.ch03;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class CalcController
 */
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=0, num2=0, result=0;
		boolean ret=true;
		String op="";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();	
		
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		
		//num1, 2 예외처리
		if(strNum1 == null || strNum1.equals(""))
			ret = false;
		if(strNum2 == null || strNum2.equals(""))
			ret = false;
		op = request.getParameter("operator");
		
		if(op != null && ret) {
			num1 = Integer.parseInt(strNum1);
			num2 = Integer.parseInt(strNum2);
			Calc calc = new Calc(num1, num2, op);
			result = calc.getResult();
		}
		
		request.setAttribute("ret", ret);
		request.setAttribute("output", result);
		RequestDispatcher view = request.getRequestDispatcher("/ch03/result.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
