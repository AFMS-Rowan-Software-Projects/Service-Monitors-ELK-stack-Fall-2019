package io.github.bhuwanupadhyay.order;

import org.springframework.data.repository.CrudRepository;

interface OrderRepository extends CrudRepository<Order, String> {
}