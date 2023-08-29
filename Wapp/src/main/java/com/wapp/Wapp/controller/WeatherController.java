package com.wapp.Wapp.controller;


import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.wapp.Wapp.entities.Local;
import com.wapp.Wapp.entities.Weather;

@RestController
@RequestMapping("/weather/{cityName}")
public class WeatherController {
	
	@GetMapping
	public Object Weather(@PathVariable String cityName) throws UnsupportedEncodingException {
		Weather Weather = new Weather(cityName.toLowerCase());
		return Weather;
		
	}
	
}
