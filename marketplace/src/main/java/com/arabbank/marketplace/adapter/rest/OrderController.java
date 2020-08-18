package com.arabbank.marketplace.adapter.rest;

import com.arabbank.marketplace.adapter.repository.OrderHistoryRepositoryRDS;
import com.arabbank.marketplace.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrderController {
    private final OrderHistoryRepositoryRDS repositoryRDS;

    public OrderController(OrderHistoryRepositoryRDS repositoryRDS) {
        this.repositoryRDS = repositoryRDS;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return repositoryRDS.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable("id") String id) {
        return repositoryRDS.findById(id);
    }

    @PostMapping
    public void addOrder(@RequestBody OrderDto order) {
        repositoryRDS.save(toOrder(order));
    }

    private Order toOrder(OrderDto orderDto) {
        return Order.builder().id(generateId()).billingAddress(orderDto.getBillingAddress())
                .comment(orderDto.getComment()).items(orderDto.getItems())
                .payment(orderDto.getPayment()).shippingAddress(orderDto.getShippingAddress())
                .build();
    }

    @GetMapping("/hi")
    public String greeting() {
        return
                "Hi";
    }

    private String generateId() {
        Random random = new Random();
        int i = random.nextInt(9000) + 1000;
        return String.valueOf(i);
    }

}
