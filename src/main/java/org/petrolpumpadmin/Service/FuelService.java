package org.petrolpumpadmin.Service;

import java.util.List;

import org.petrolpumpadmin.model.FuelTypeModel;

public interface FuelService {
public boolean isAddFuelModel(FuelTypeModel model);
public List<FuelTypeModel> getAllfueltypes();
}
