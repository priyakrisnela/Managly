package com.krisnela.test.mvp.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.krisnela.test.mvp.domain.Greeting;

public interface  GreetingRepository extends MongoRepository<Greeting, Serializable> {

}
