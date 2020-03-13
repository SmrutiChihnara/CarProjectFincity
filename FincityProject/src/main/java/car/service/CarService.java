package car.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import car.Model.CarRecord;
import car.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;

	public List<CarRecord> getAllUsers() {
		List<CarRecord> userRecords = new ArrayList<>();
		carRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}

	public void addUser(CarRecord userRecord) {
		carRepository.save(userRecord);
	}

	public Optional<CarRecord> getByid(int id) {
		return carRepository.findById(id);
	}

}