package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Skills;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class TestController {

	@GetMapping(path = "/skills")
	public ResponseEntity<List<Skills>> getSkills(){
		List<Skills> skillsList = new ArrayList<>();
		Skills skills1 = new Skills(1, "HTML 5");
		Skills skills2 = new Skills(2, "CSS 3");
		Skills skills3 = new Skills(3, "JS");
		Skills skills4 = new Skills(4, "Bootstrap");
		Skills skills5 = new Skills(5, "Angular 11");
		Skills skills6 = new Skills(6, "Java");
		Skills skills7 = new Skills(7, "SQL");
		Skills skills8 = new Skills(8, "Python");
		Skills skills9 = new Skills(9, "MongoDb");

		skillsList.add(skills1);
		skillsList.add(skills2);
		skillsList.add(skills3);
		skillsList.add(skills4);
		skillsList.add(skills5);
		skillsList.add(skills6);
		skillsList.add(skills7);
		skillsList.add(skills8);
		skillsList.add(skills9);
		return ResponseEntity.ok(skillsList);
		
	}
	
}
