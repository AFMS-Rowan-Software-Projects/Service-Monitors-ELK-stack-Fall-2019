package io.github.bhuwanupadhyay.order;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
class OrderEndpoints {

    private final OrderRepository repository;

    @GetMapping
    public ResponseEntity<List<Order>> listOrders() {
        return ResponseEntity.ok((List<Order>) repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(repository.save(order));
    }

}