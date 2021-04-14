package CuadernoFactoryMethod;

import Creator.Cuaderno;

public interface CuadernoFactoryMethod {
	
		/*factory method el cual creara un objeto "createcuaderno" 
		 * de tipo cuaderno y le enviamos como parametros el precio*/
		public Cuaderno createCuaderno(int precio);
}
