package io.javabrains.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springboot.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{
	
	

}
