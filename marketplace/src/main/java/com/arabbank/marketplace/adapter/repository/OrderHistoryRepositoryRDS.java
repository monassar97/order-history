package com.arabbank.marketplace.adapter.repository;

import com.arabbank.marketplace.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryRepositoryRDS extends JpaRepository<Order, String> {
}
