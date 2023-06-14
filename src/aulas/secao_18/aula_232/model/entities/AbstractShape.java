package aulas.secao_18.aula_232.model.entities;

import aulas.secao_18.aula_232.model.enums.Color;

public abstract class AbstractShape implements Shape{

	  private Color color;
	  
	  public AbstractShape(Color color) 
	  { 
		  this.color = color; 
	  }
	  
	  public Color getColor() { return color; }
	  
	  public void setColor(Color color) { this.color = color; }
	 
}
