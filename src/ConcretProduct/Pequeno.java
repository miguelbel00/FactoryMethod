package ConcretProduct;

import Creator.Cuaderno;

public class Pequeno extends Cuaderno{

	public Pequeno(int precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}
	
	//metodo abstracto para la descripcion del cuaderno
	@Override
	public String getDescripcion() {
		
		return "Cuaderno Pequeño";
	}
	
	
	
}
