package aulas.secao_18.aula_232.model.entities;

import aulas.secao_18.aula_232.model.enums.Color;

public class Circle extends AbstractShape{

	private Double radius;
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}