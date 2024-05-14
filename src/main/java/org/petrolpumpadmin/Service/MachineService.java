package org.petrolpumpadmin.Service;
import java.util.*;

import org.petrolpumpadmin.model.*;
public interface MachineService {
public boolean isAddMachine(MachineModel model,String typeid[],String capacity[]);
public List<Object[]> getAllMachines();
public boolean isDeleteMachineById(int mid);
public boolean isupdateMachine(MachineModel model);
}
