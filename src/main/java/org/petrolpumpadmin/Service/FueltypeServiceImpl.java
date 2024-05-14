package org.petrolpumpadmin.Service;

import java.util.List;

import org.petrolpumpadmin.Repository.FuelRepository;
import org.petrolpumpadmin.Repository.FuelRepositoryImpl;
import org.petrolpumpadmin.model.FuelTypeModel;

public class FueltypeServiceImpl implements FuelService{
FuelRepository fuelRepo=new FuelRepositoryImpl();
	@Override
	public boolean isAddFuelModel(FuelTypeModel model) {
		
		return fuelRepo.isAddFuelType(model);
	}
	@Override
	public List<FuelTypeModel> getAllfueltypes() {
		return fuelRepo.getAllfueltypes();
	}

}
