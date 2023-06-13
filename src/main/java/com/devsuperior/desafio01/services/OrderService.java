package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double total(Order order){
        return order.getBasic() - order.getBasic() * order.getDiscount();
    }
}
