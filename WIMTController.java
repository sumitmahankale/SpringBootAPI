package com.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.model.TrainInfo;

@RestController
@RequestMapping("/wimt-service")
public class WIMTController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public ResponseEntity<List<TrainInfo>>getAllData()
	{
		String url="http://localhost:8089/irctc-service/";
		List<TrainInfo>list=restTemplate.getForEntity(url, List.class).getBody();
		return new ResponseEntity<List<TrainInfo>>(list,HttpStatus.OK);
	}
	@GetMapping("/trainNumber/{trainNumber}")
	public ResponseEntity<TrainInfo>getTrainByNumber(@PathVariable int trainNumber) {
		String url="http://localhost:8089/irctc-service/trainNumber/";
		TrainInfo info=restTemplate.getForObject(url, TrainInfo.class);
		return new ResponseEntity<TrainInfo>(info,HttpStatus.OK);
	}
}
