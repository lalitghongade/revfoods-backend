package com.app.revfoodsbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.revfoodsbackend.model.Chef;
import com.app.revfoodsbackend.service.ChefService;

@RestController
@CrossOrigin
public class ChefController {

	@Autowired
	private ChefService chefService;

	@PostMapping("/chef")
	public Chef addChef(@RequestBody Chef chef) {

		return chefService.addChef(chef);
	}

	@PutMapping("/chef")
	public Chef updateChef(@RequestBody Chef chef) {

		return chefService.updateChef(chef);
	}

	@DeleteMapping("/chef/{chefId}")
	public void deleteChef(@PathVariable int chefId) {

		chefService.deleteChef(chefId);
	}

	@GetMapping("/chefs")
	public List<Chef> getAllChefs() {

		return chefService.getAllChefs();
	}

	@GetMapping("/chef/{chefId}")
	public Chef getChefById(@PathVariable int chefId) {

		return chefService.getChefById(chefId);
	}

}