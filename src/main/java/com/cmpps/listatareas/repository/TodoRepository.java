package com.cmpps.listatareas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmpps.listatareas.model.Todo;

public interface TodoRepository extends JpaRepository< Todo, Long>{
	List < Todo > findByUserName(String user);
}
