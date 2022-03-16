package com.datastax.tutorials.service.order;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface OrderRepository extends CassandraRepository<OrderEntity,OrderPrimaryKey> {

	List<OrderEntity> findByKeyOrderId(UUID orderId);
}
