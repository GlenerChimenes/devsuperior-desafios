package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	 public double shipment(Order order){

	        double ValorComDesconto = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));

	        if (ValorComDesconto   < 100.0){
	            return ValorComDesconto  + 20  ;
	        }
	         else if (ValorComDesconto >= 100.0 && ValorComDesconto <= 200.0 ){
	             return ValorComDesconto  + 12  ;
	        }
	        else{
	            return ValorComDesconto;
	        }
	    }
}
