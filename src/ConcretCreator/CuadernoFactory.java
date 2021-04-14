package ConcretCreator;

import ConcretProduct.Grande;
import ConcretProduct.Mediano;
import ConcretProduct.Pequeno;
import Creator.Cuaderno;
import CuadernoFactoryMethod.CuadernoFactoryMethod;

public class CuadernoFactory implements CuadernoFactoryMethod{

	public Cuaderno createCuaderno(int precio) {
		
		//Argumentos para determinar que tipo de cuaderno puede comprar
		//Devuelven un objeto dependiendo del cuaderno
		if((precio >=1 && precio <= 2000  )) {
			
			return new Pequeno(precio);
		}else if((precio >2000 && precio <= 4000 )) {
			
			return new Mediano(precio);
		}else {
			
			return new Grande(precio);
		}
	}
}
