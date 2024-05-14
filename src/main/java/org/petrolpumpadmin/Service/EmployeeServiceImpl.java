package org.petrolpumpadmin.Service;

import org.petrolpumpadmin.Config.DBConfig;
import org.petrolpumpadmin.Repository.EmployeeRepository;
import org.petrolpumpadmin.Repository.EmployeeRepositoryImpl;
import org.petrolpumpadmin.model.EmployeeModel;

public class EmployeeServiceImpl extends DBConfig implements EmployeeService {

	EmployeeRepository empRepo=new EmployeeRepositoryImpl();
	
	@Override
	public boolean isAddEmployee(EmployeeModel model) {
		
		return empRepo.isAddEmployee(model);
	}

}
