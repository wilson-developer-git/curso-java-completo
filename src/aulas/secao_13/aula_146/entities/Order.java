package aulas.secao_13.aula_146.entities;

import java.time.LocalDateTime;

import aulas.secao_13.aula_146.entities.enums.OrderStatus;

public class Order {

	private Long id;
	private LocalDateTime data;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Long id, LocalDateTime data, OrderStatus status) {
		super();
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
}
