package com.maxtrain.bootcamp.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/equipment")
public class EquipmentController {
	
	@Autowired
	private EquipmentRepository eqpRepo;
	
	@GetMapping
	public ResponseEntity<Iterable<Equipment>> getEquipment() {
		var equipment = eqpRepo.findAll();
		return new ResponseEntity<Iterable<Equipment>>(equipment, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Equipment> getEquipment(@PathVariable int id) {
		var eqp = eqpRepo.findById(id);
		if(eqp.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Equipment>(eqp.get(), HttpStatus.OK);
	}
	
//	@PostMapping
//	public

}
