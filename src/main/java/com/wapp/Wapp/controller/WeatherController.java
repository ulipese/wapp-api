package com.wapp.Wapp.controller;


import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
//import com.wapp.Wapp.entities.Local;
import com.wapp.Wapp.entities.Weather;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@GetMapping(produces = "application/json")
	public String Weather(@RequestParam String cityName) throws UnsupportedEncodingException, JsonMappingException, JsonProcessingException {
		return new Weather().getWeather(cityName.toLowerCase());
	}
	
}
