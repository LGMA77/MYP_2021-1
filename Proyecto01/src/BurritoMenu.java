import java.util.Hashtable;
import java.util.Iterator;

public class BurritoMenu{

	Hashtable<Integer, MenuItem> menuitems;
	int capacidad = 5;
	int elementos = 1;

	public BurritoMenu(){
		menuitems = new Hashtable(capacidad);
	}

	public void setItems(Hashtable<Integer, MenuItem> burritos){
		menuitems = burritos;
	}

	public Iterator createIterador(){
		return menuitems.values().iterator();
	}

	public void addBurrito(String n, String d, boolean v, double p){

		MenuItem burrito = new MenuItem(n, d, v, p);

		if(elementos <= capacidad){
			menuitems.put(elementos, burrito);
			elementos ++;
		}else{
			System.out.println("Ya no puedo meter mas opciones.");
		}
	}
}