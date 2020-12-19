import java.util.Iterator;

public class PizzaMenu{

	MenuItem [] menuitems;
	private int capacidad = 5;
	private int cantidad = 0;

	public PizzaMenu(){
		menuitems = new MenuItem[capacidad];
	}

	public void setItems(MenuItem[] m){
		menuitems = m;
	}

	public Iterator createIterador(){
		return new PizzaMenuIterator(menuitems);
	}

	public void addPizza(String n, String d, boolean v, double p){
		MenuItem pizza = new MenuItem(n, d, v, p);
		
		if(cantidad < capacidad){
			menuitems[cantidad] = pizza;
			cantidad ++;
		}else{
			System.out.println("Ya está completo el menu.");
		}
  	}
}
