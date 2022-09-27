package com.medicos.repository.crudrepository;

import com.medicos.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository <DoctorModel,Integer> {
}
