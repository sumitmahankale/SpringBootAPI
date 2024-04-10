package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.TrainInfo;
import com.repository.TrainRepository;

@Service
public class TrainServiceIMPL implements TrainService{
	@Autowired
	private TrainRepository repository;
	@Override
	public TrainInfo saveInfo(TrainInfo info) {
		// TODO Auto-generated method stub
		return repository.save(info);
	}
	@Override
	public List<TrainInfo> getAllTrains() {
		
		return repository.findAll();
	}
	@Override
	public TrainInfo getTrainByNumber(int trainNumber) 
	{
		return repository.findById(trainNumber).get();
	}

	@Override
	public String getTrainCurrentStation(int trainNumber) 
	{
	
	if(repository.existsById(trainNumber))
	{
		return repository.findById(trainNumber).get().getTrainCurrentStation();
	}
	else
	{
		return "No Station Found....!";
	}
}
	@Override
	public TrainInfo updateStation(String stationName, int trainNumber)
	{
		TrainInfo info= repository.findById(trainNumber).get();
		info.setTrainCurrentStation(stationName);
		return repository.save(info);       
	}


}
