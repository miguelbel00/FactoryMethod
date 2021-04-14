package ConcretProduct;

import Creator.Cuaderno;

public class Mediano extends Cuaderno {

	public Mediano(int precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}
	//metodo abstracto para la descripcion del cuaderno
	@Override
	public String getDescripcion() {
		
		return "Cuaderno Mediano";
	}
	
}
