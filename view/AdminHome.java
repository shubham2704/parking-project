package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		HttpSession ses=request.getSession();
		try{
		String nv="Admin Id:"+ses.getValue("ADMINID").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("ADMINNAME").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='/Parking/images/"+ses.getValue("APICTURE")+"' width=30 height=30><hr color=red>";
		out.println(nv);
		out.println("<table>");
		out.println("<tr><td valign='top'>");
		out.println("<a href='EmployeeView' target='mw'>Add Employee</a><br>");
		out.println("<a href='DisplayAllEmployees' target='mw'>Display All</a><br>");
		out.println("<a href='SearchEmployeeById' target='mw'>Search</a><br>");
		out.println("<a href='FloorView' target='mw'>Add Floor</a><br>");
		out.println("<a href='EmployeeView'>Logout</a></td>");
		out.println("<td valign='top'><iframe frameborder='0' width='600' height='700' name='mw'></iframe></td></tr>");
		out.println("</table>");
		}catch(Exception e)
		{
			response.sendRedirect("AdminLogin");
		}
		out.println("</html>");
	}

}




