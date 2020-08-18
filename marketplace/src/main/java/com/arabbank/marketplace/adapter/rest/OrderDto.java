package com.arabbank.marketplace.adapter.rest;

import com.arabbank.marketplace.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String payment;
    private ArrayList<Product> items;
    private String billingAddress;
    private String shippingAddress;
    private String comment;
}
