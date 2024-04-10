package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.TrainInfo;

public interface TrainRepository extends JpaRepository<TrainInfo, Integer>{

}
