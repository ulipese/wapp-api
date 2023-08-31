package com.wapp.Wapp.entities;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WeatherReportAPI {
	private String apiId = "f987b5c27bc5c459a4efdea8310dc15a";
	private String units = "metric";
	private String uri = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=%s";
	
	public WeatherReportAPI() {
		
	}
	public String callWeatherApi(String cityName) throws UnsupportedEncodingException {		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(String.format(uri, URLEncoder.encode(cityName, "UTF-8"), apiId, units)))
				.header("Content-Type", "application/json")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		
		HttpResponse<String> response = null;
		
		{
			try {
				response = HttpClient.newHttpClient()
						   .send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException err) {
				err.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return response.body();
		}
		
		
	}
	
}
