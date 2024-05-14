package org.petrolpumpadmin.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import org.petrolpumpadmin.Service.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.petrolpumpadmin.Service.MachineServiceImpl;
@WebServlet("/del")
public class DeleteControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DeleteControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int mid=Integer.parseInt(request.getParameter("machineid"));
		MachineService mservice=new MachineServiceImpl();
		boolean b=mservice.isDeleteMachineById(mid);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("Viewmachine.jsp");
			r.forward(request, response);
		}
		else
		{
			out.println("<h1>Machine not Delete</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
