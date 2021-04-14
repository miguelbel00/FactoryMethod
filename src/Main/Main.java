package Main;

import ConcretCreator.CuadernoFactory;
import Creator.Cuaderno;
import CuadernoFactoryMethod.CuadernoFactoryMethod;

public class Main {
	
	public static void main(String[] args) {
		
		//creamos un objeto factory method llamado "factory" que contendra 
		CuadernoFactoryMethod factory = new CuadernoFactory();
		
		/*creamos un objeto cuaderno llamado "cuaderno" que utiliza 
		 * el metodo createCuaderno con el parametro ingresado por el usuario*/
		Cuaderno cuaderno = factory.createCuaderno(10);
		
		//eliminar antes de presentar
		// este pedazo muestra en consola el metodo descripcion del cuaderno que eligio cuadernofactory
		System.out.println(cuaderno.getDescripcion());
		
	}	
}
