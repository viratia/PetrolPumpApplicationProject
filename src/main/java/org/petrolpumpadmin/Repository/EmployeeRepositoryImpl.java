package org.petrolpumpadmin.Repository;

import org.petrolpumpadmin.Config.DBConfig;
import org.petrolpumpadmin.model.EmployeeModel;

public class EmployeeRepositoryImpl extends DBConfig implements EmployeeRepository {

	int EmpId=0;
	public int getEmployeeId()
	{
		try
		{
			stmt=conn.prepareStatement("select max(eid) from employee");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				EmpId=rs.getInt(1);
			}
			return ++EmpId;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return -1;
		}
		
	}
	@Override
	public boolean isAddEmployee(EmployeeModel model) {
		try
		{
			int employeeId=this.getEmployeeId();
			stmt=conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			stmt.setInt(1, employeeId);
			stmt.setString(2, model.getName());
			stmt.setString(3, model.getEmail());
			stmt.setString(4, model.getContact());
			stmt.setString(5, model.getAddress());
			stmt.setInt(6, model.getSal());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

}
