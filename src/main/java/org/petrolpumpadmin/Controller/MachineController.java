package org.petrolpumpadmin.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.petrolpumpadmin.model.MachineModel;
import org.petrolpumpadmin.Service.*;
@WebServlet("/newmachine")
public class MachineController extends HttpServlet {
	
	MachineService machineService=new MachineServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String machinecode=request.getParameter("machinecode");
		String ftypeId[]=request.getParameterValues("ftype");
		String capArray[]=request.getParameterValues("capacity");
		
		MachineModel model=new MachineModel();
		model.setMachinecode(machinecode);
		boolean flag=false;
		boolean b=machineService.isAddMachine(model,ftypeId,capArray);
		if(b)
		{
			out.println("<h1>Machine  Added Successfully</h1>");
		}

		else
		{out.println("<h1>Machine not Added Successfully</h1>");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
