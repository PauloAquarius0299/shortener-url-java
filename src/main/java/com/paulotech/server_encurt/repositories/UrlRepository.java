package com.paulotech.server_encurt.repositories;

import com.paulotech.server_encurt.entity.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String> {
}
