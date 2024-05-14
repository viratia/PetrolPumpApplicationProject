package org.petrolpumpadmin.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.petrolpumpadmin.Service.EmployeeService;
import org.petrolpumpadmin.Service.EmployeeServiceImpl;
import org.petrolpumpadmin.model.EmployeeModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNewEmployeeController
 */
@WebServlet("/addemployee")
public class AddNewEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		int sal=Integer.parseInt(request.getParameter("sal"));
		EmployeeModel model=new EmployeeModel();
		model.setName(name);
		model.setEmail(email);
		model.setContact(contact);
		model.setAddress(address);
		model.setSal(sal);
		EmployeeService empService=new EmployeeServiceImpl();
		boolean b=empService.isAddEmployee(model);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
			r.include(request, response);
			out.println("<h1>Employee Added Succesfully</h1>");
		}
		else
		{
			out.println("<h1>Employee Not added Succesfully</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
