package org.petrolpumpadmin.Service;
import org.petrolpumpadmin.model.*;

import java.util.List;

import org.petrolpumpadmin.Repository.MachineRepository;
import org.petrolpumpadmin.Repository.MachineRepositoryImpl;
public class MachineServiceImpl implements MachineService
{
MachineRepository m=new MachineRepositoryImpl();
	@Override
	public boolean isAddMachine(MachineModel model,String typeid[],String []capacity) {
		return m.isAddMachine(model,typeid,capacity);
	}
	@Override
	public List<Object[]> getAllMachines() {
		return m.getAllMachines();
	}
	@Override
	public boolean isDeleteMachineById(int mid) {
		// TODO Auto-generated method stub
		return m.isDeleteMachineById(mid);
	}
	@Override
	public boolean isupdateMachine(MachineModel model) {
		// TODO Auto-generated method stub
		return m.isUpdateMachine(model);
	}
	

}
