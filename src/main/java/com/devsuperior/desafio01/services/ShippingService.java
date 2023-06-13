package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        if (order.getBasic() < 100.0){
            return order.getBasic()  + 20  ;
        }
         else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0 ){
             return order.getBasic()  + 12  ;
        }
        else{
            return order.getBasic();
        }
    }
}
