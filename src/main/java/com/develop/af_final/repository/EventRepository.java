package com.develop.af_final.repository;

import com.develop.af_final.model.EventAll;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<EventAll, String> {
}
