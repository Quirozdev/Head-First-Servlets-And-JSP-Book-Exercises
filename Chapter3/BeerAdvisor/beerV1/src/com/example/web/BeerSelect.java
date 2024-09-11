package com.example.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color");

		BeerExpert expert = new BeerExpert();
		List<String> brands = expert.getBrands(c);

		request.setAttribute("styles", brands);

		RequestDispatcher view = request.getRequestDispatcher("result.jsp");

		view.forward(request, response);
	}
}
