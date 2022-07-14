package com.revature.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import javax.management.loading.PrivateClassLoader;

import org.aspectj.lang.reflect.CatchClauseSignature;
import org.hibernate.Session;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.revature.models.Pokemon;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(PokemonController.class);
	private static HttpURLConnection connection;
	
	
	
	@RequestMapping("/pokemon/{id}")
	public Pokemon pokemon(@PathVariable("id") final long id) {
		log.info("RequestMapping received for [/pokemon/{id}]");
		final PokemonController responseController = new PokemonController();
		BufferedReader lineBufferedReader;
		String line;
		StringBuffer responseContentBuffer = new StringBuffer();
		//method 1 assync
		//	create client
		HttpClient client = HttpClient.newHttpClient();
		//	built request using URL
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:5000/")).build();
		
		//	sent request async
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			.thenApply(HttpResponse::body)
			.thenAccept(System.out::println)
			.join();
		
		
		
		
		//method 2 - This method does not use the ObjectMapper JSON dependency
//		try {
//			URL url = new URL("http://localhost:5000/");
//			//jdbc:postgresql://localhost:5432/postgres  
//			connection = (HttpURLConnection) url.openConnection();
//			log.info("Connection successful: " + connection);
//			
//			//Request setup
//			connection.setRequestMethod("GET");
//			connection.setConnectTimeout(5000);
//			connection.setReadTimeout(5000);
//			
//			//log status success
//			int status = connection.getResponseCode();
//			if (status > 299) {
//				lineBufferedReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
//				while ((line = lineBufferedReader.readLine()) != null) {
//					responseContentBuffer.append(line);
//				}
//				lineBufferedReader.close();
//			} else {
//				log.info("Connection successfull: " + status);
//				lineBufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//				while ((line = lineBufferedReader.readLine()) != null) {
//					responseContentBuffer.append(line);
//				}
//				lineBufferedReader.close();
//			}
//			//Testing the API ending. Can be removed later
//			System.out.println(responseContentBuffer.toString());
//			log.info(responseContentBuffer.toString());
//		} catch (MalformedURLException m) {
//			log.warn("MalformedURLException in PokemonController line 29: ", m);
//		} catch (IOException i) {
//			log.warn("I/O exception in PokemonController line 31: ", i);
//		} finally {
//			connection.disconnect();
//		}
//		
		return null;

	}

	private static ObjectMapper objectMapper = new getDefaultObjectMapper();
		
	private	static ObjectMapper getDefaultObjectMapper() {
			
		ObjectMapper defaObjectMapper = new ObjectMapper();
		// -------------
		
		
		
		return getDefaultObjectMapper;
	}
		
}
