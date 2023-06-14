package aulas.secao_18.aula_232;

import aulas.secao_18.aula_232.model.entities.AbstractShape;
import aulas.secao_18.aula_232.model.entities.Circle;
import aulas.secao_18.aula_232.model.entities.Rectangle;
import aulas.secao_18.aula_232.model.enums.Color;

public class App {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.BLUE, 3.0, 4.0);
		
		System.out.println("Circle color: "+ s1.getColor());
		System.out.println("Circle area: "+ String.format("%.3f", s1.area()));
		
		System.out.println("Rectangle color: "+ s2.getColor());
		System.out.println("Rectangle area: "+ String.format("%.3f", s2.area()));
	}

}
