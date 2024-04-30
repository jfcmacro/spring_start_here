package org.jfcmc.sprstahere.chap10.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.jfcmc.sprstahere.chap10.model.Country;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
	Country c = Country.of("France", 67);
	return c;
    }

    @GetMapping("/all")
    public List<Country> all() {
	Country c1 = Country.of("France", 67);
	Country c2 = Country.of("Spain", 47);
	return List.of(c1, c2);
    }
}
