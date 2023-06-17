package com.devsuperior.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import com.devsuperior.desafio01.services.ShippingService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	
	@Autowired
	private ShippingService shippingService;
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);


			Order order = new Order();

			System.out.println("Informe o codigo do pedido: ");
			order.setCode(scan.nextInt());
			System.out.println("Informe o valor basico: ");
			order.setBasic(scan.nextDouble());
			System.out.println("Informe porcentagem de desconto: ");
			order.setDiscount(scan.nextDouble());

			// Retorna total com desconto
		    double total = shippingService.shipment(order);

		    System.out.println("Pedido codigo: " + order.getCode());
		    System.out.println("Valor total: " +  total);
		    
		    scan.close();

	}
}
