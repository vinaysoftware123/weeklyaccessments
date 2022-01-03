package com.mouritech.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.app.models.Countries;
import com.mouritech.app.repositories.CountriesRepository;


@RestController
@RequestMapping("/Countries")
public class CountriesRestController {
	@Autowired
	private CountriesRepository CntryRepo;

	@PostMapping("/")
	public Countries addCountries(@RequestBody Countries Cntry ) {
		return CntryRepo.save(Cntry);
	}

	@GetMapping("/")
	public List<Countries> listCountries() {
		return CntryRepo.findAll();
	}

	@PutMapping("/")
	public Countries updateCountries(@RequestBody Countries Cntry) {
		return CntryRepo.save(Cntry);
	}

	@DeleteMapping("/")
	public String deleteCountries(@RequestBody Countries Cntry) {
		CntryRepo.delete(Cntry);
		return "Deleted Country";
	}
}
