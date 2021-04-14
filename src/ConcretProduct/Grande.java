package ConcretProduct;

import Creator.Cuaderno;

public class Grande extends Cuaderno{
	//constructor que crea una super clase 
	public Grande(int precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}
	//metodo abstracto para la descripcion del cuaderno
	@Override
	public String getDescripcion() {
		
		return "Cuaderno Grande";
	}

}
