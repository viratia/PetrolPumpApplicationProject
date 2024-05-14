package org.petrolpumpadmin.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.petrolpumpadmin.Service.FuelService;
import org.petrolpumpadmin.Service.FueltypeServiceImpl;
import org.petrolpumpadmin.model.FuelTypeModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FuelTypeController
 */
@WebServlet("/fueltype")
public class FuelTypeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuelTypeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fueltype=request.getParameter("type");
		FuelTypeModel model=new FuelTypeModel();
		model.setName(fueltype);
		FuelService fservice=new FueltypeServiceImpl();
		boolean b=fservice.isAddFuelModel(model);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
			r.include(request, response);
			out.println("<center>FuelType added Succesfully</center>");
		}
		else
		{
			RequestDispatcher r=request.getRequestDispatcher("admindashboard.jsp");
			r.include(request, response);
			out.println("<center>Some Problem is There</center>");
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
