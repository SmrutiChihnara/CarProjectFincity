package car.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import car.Model.CarRecord;
import car.service.CarService;

@RestController
public class CarController {
	@Autowired
	private CarService carService;

	@PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
	public void addUser(@RequestBody CarRecord carRecord) {
		carService.addUser(carRecord);
	}
    //chnage
	@RequestMapping("/car")
	public List<CarRecord> getAllUser() {
		return carService.getAllUsers();
	}

	@GetMapping("/car/{id}")
	private Optional<CarRecord> getBooks(@PathVariable("id") int id) {
		return carService.getByid(id);
	}

}