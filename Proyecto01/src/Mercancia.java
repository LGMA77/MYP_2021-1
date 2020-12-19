public class Mercancia{

	String nombre;
	double precio;
	String color;
	String material;

	public Mercancia(String n, double p, String c, String m){
		this.nombre = n;
		this.precio = p;
		this.color = c;
		this.material = m;
	}

	public String getNombre(){
		return this.nombre;
	}

	public double getPrecio(){
		return this.precio;
	}

	public String getMaterial(){
		return this.material;
	}

	public String getColor(){
		return this.color;
	}

}
