package com.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dbconnection
 */
@WebServlet("/Dbconnection")
public class Dbconnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected String mydriver;
	protected String myurl;
	protected String myuserID;
	protected String mypassword;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		mydriver = config.getInitParameter("driver");
		myurl = config.getInitParameter("URL");
		myuserID = config.getInitParameter("userID");
		mypassword = config.getInitParameter("password");
		}
    public Dbconnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("TEXT/HTML");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<TITLE>Date Display</TITLE>");
		out.println("<BODY>");
		out.println("<H2>Servlet Initialization Parameters (ServletConfig):</H2><HR>");
		out.println("<B>driver: </B>" + mydriver + "</BR>");
		out.println("<B>url: </B>" + myurl + "</BR>");
		out.println("<B>password: </B>" + mypassword + "</BR>");
		out.println("<B>userID: </B>" + myuserID + "</BR>");
		out.println("</BODY></HTML>");
		out.close();	
	}


}
