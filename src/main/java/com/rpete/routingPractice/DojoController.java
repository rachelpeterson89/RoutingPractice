package com.rpete.routingPractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/dojo/{dojo}")
	public String dojo(@PathVariable("dojo") String dojoInput) {
		return "The " + dojoInput + " is awesome!";
	}
	
	@RequestMapping("/{location}-dojo")
	public String location(@PathVariable("location") String locInput) {
		return locInput + " Dojo is located in " + locInput;
	}
	
	@RequestMapping("/{hq}")
	public String hq(@PathVariable("hq") String hqInput) {
		return hqInput + " dojo is the headquarters";
	}
}
