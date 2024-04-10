package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrainInfo {
	@Id
	private int trainId;
	private String trainName;
	private String trainSource;
	private String trainDesiganation;
	private String trainCurrentStation;
	private double time;
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTrainDesiganation() {
		return trainDesiganation;
	}
	public void setTrainDesiganation(String trainDesiganation) {
		this.trainDesiganation = trainDesiganation;
	}
	public String getTrainCurrentStation() {
		return trainCurrentStation;
	}
	public void setTrainCurrentStation(String trainCurrentStation) {
		this.trainCurrentStation = trainCurrentStation;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
	public TrainInfo() {
		
	}
	public TrainInfo(int trainId, String trainName, String trainSource, String trainDesiganation,
			String trainCurrentStation, double time) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.trainSource = trainSource;
		this.trainDesiganation = trainDesiganation;
		this.trainCurrentStation = trainCurrentStation;
		this.time = time;
	}
	@Override
	public String toString() {
		return "HomeController [trainId=" + trainId + ", trainName=" + trainName + ", trainSource=" + trainSource
				+ ", trainDesiganation=" + trainDesiganation + ", trainCurrentStation=" + trainCurrentStation
				+ ", time=" + time + "]";
	}
}
