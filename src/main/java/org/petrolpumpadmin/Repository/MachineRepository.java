package org.petrolpumpadmin.Repository;

import java.util.List;

import org.petrolpumpadmin.model.MachineModel;

public interface MachineRepository {
public boolean isAddMachine(MachineModel model,String typeid[],String []capacity);

public List<Object[]> getAllMachines();
public boolean isDeleteMachineById(int mid);
public boolean isUpdateMachine(MachineModel model);
}
