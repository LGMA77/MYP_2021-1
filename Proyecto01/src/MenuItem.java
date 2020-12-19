public class MenuItem implements MenuItems{

	private String nombre;
	private String descripcion;
	private boolean vegetariano;
	private double precio;

	public MenuItem(){
		nombre = "";
		descripcion = "";
		vegetariano = false;
		precio = 0.0;
	}

	public MenuItem(String n, String d, boolean v, double p){
		nombre = n;
		descripcion = d;
		vegetariano = v;
		precio = p;
	}

	public String getNombre(){
		return nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public boolean getVegetariano(){
		return vegetariano;
	}

	public double getPrecio(){
		return precio;
	}

	public void setNombre(String n){
		nombre = n;
	}

	public void setDescripcion(String d){
		descripcion = d;
	}

	public void setVegetariano(boolean v){
		vegetariano = v;
	}

	public void setPrecio(double p){
		precio = p;
	}

}
