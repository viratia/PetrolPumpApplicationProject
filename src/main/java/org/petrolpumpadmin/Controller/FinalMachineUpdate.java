package org.petrolpumpadmin.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.petrolpumpadmin.Service.MachineService;
import org.petrolpumpadmin.Service.MachineServiceImpl;
import org.petrolpumpadmin.model.MachineModel;

/**
 * Servlet implementation class FinalMachineUpdate
 */
@WebServlet("/finalmachineupdate")
public class FinalMachineUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalMachineUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			int mid=Integer.parseInt(request.getParameter("mid"));
			String machineCode=request.getParameter("mcode");
			MachineModel model=new MachineModel();
			model.setId(mid);
			model.setMachinecode(machineCode);
			MachineService mService=new MachineServiceImpl();
			boolean b = mService.isupdateMachine(model);
			if(b)
			{
				RequestDispatcher r1 = request.getRequestDispatcher("Viewmachine.jsp");
				r1.forward(request, response);
			}
			else
			{
				out.println("<h1>Machine Not Updated</h1>");
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
