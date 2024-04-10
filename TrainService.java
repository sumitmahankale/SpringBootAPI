package com.service;

import java.util.List;

import com.model.TrainInfo;

public interface TrainService {

	TrainInfo saveInfo(TrainInfo info);

	List<TrainInfo> getAllTrains();

	TrainInfo getTrainByNumber(int trainNumber);

	String getTrainCurrentStation(int trainNumber);

	TrainInfo updateStation(String stationName, int trainNumber);


}
