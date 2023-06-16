package aulas.secao_19.aula_241;

import java.util.ArrayList;
import java.util.List;

import aulas.secao_19.aula_241.entities.Circle;
import aulas.secao_19.aula_241.entities.Rectangle;
import aulas.secao_19.aula_241.entities.Shape;

public class App {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
