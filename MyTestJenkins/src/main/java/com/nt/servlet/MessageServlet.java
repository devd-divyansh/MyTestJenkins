package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/wish")
public class MessageServlet extends HttpServlet {

	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                             PrintWriter pw=resp.getWriter();
		                
                             resp.setContentType("text/html");
	                    
            pw.println("<h1 style='background-color:blue;color:yellow; text-align:center'>Shri Harivansh Radha</h1>");
	           
            pw.close();
	}

	
	
}
