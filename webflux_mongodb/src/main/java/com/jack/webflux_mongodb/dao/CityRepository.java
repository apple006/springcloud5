package com.jack.webflux_mongodb.dao;

import com.jack.webflux_mongodb.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * create by jack 2018/5/12
 */
@Repository
public interface CityRepository extends ReactiveMongoRepository<City, Long> {
}
