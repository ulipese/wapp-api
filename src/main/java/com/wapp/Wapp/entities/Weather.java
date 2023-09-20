package com.wapp.Wapp.entities;

import java.io.UnsupportedEncodingException;

public class Weather {
	
	public Weather() {
		
	}
//	
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public String getIcon() {
//		return icon;
//	}
//	public void setIcon(String icon) {
//		this.icon = icon;
//	}
//	public double getRain() {
//		return rain;
//	}
//	public void setRain(double rain) {
//		this.rain = rain;
//	}
//	public double getTemp() {
//		return temp;
//	}
//	public void setTemp(double temp) {
//		this.temp = temp;
//	}
	
	public String getWeather(String cityName) throws UnsupportedEncodingException {
		return new WeatherReportAPI().callWeatherApi(cityName);
	}
	
}
