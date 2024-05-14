package org.petrolpumpadmin.Repository;

import java.util.List;

import org.petrolpumpadmin.model.FuelTypeModel;

public interface FuelRepository {
public boolean isAddFuelType(FuelTypeModel model);
public List<FuelTypeModel> getAllfueltypes();
}
