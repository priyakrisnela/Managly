package com.krisnela.test.mvp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.krisnela.test.mvp.domain.Comments;

public interface CommentsRepository extends MongoRepository<Comments		, String>{

}
