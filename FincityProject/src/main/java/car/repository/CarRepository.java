package car.repository;

import org.springframework.data.repository.CrudRepository;

import car.Model.CarRecord;

// This will be AUTO IMPLEMENTED by Spring into a Bean called CarRepository
// CRUD refers Create, Read, Update, Delete

public interface CarRepository extends CrudRepository<CarRecord, Integer> {
}