package org.petrolpumpadmin.Config;
import java.sql.*;
import java.util.List;

import org.petrolpumpadmin.model.EmployeeModel;
import org.petrolpumpadmin.model.MachineModel;
public class DBConfig {
protected Connection conn;
protected PreparedStatement stmt;
protected ResultSet rs;

public DBConfig()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/petrolpumpSystem","root","root");
		
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
}

public List<Object[]> getAllMachines() {
	// TODO Auto-generated method stub
	return null;
}

public boolean isAddFuelType() {
	// TODO Auto-generated method stub
	return false;
}

public boolean isAddEmployee(EmployeeModel model) {
	// TODO Auto-generated method stub
	return false;
}
}
