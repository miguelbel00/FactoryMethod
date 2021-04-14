package Creator;

public abstract class Cuaderno {
		//variable para el precio del cuaderno
		private int precio;
		
		//constructor con el precio del cuaderno
		public Cuaderno (int precio) {
			setPrecio(precio);
			
		}
		//metodo abstracto para la descripcion del cuaderno
		public abstract String getDescripcion();
		
		
		
		//getter and setter
		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

}
