package com.arabbank.marketplace.adapter.repository;

import com.arabbank.marketplace.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderHistoryRepositoryRDS extends MongoRepository<Order,String> {
}
