package com.mscourse.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscourse.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
	
	
}
