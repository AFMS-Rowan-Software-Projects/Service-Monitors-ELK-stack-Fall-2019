package io.github.bhuwanupadhyay.order;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_orders")
@Getter
class Order {
    @Id
    private String orderId;
    private String itemId;
    private String customerId;
}
