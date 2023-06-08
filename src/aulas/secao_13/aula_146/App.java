package aulas.secao_13.aula_146;

import java.time.LocalDateTime;

import aulas.secao_13.aula_146.entities.Order;
import aulas.secao_13.aula_146.entities.enums.OrderStatus;

public class App {

	public static void main(String[] args) {

		Order order = new Order(1080L, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
