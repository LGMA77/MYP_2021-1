import java.util.ArrayList;
import java.util.Iterator;

public class HamburguesaMenu{

	ArrayList<MenuItem> menuitems;

	public HamburguesaMenu(){
		menuitems = new ArrayList<MenuItem>();
	}

	public HamburguesaMenu(ArrayList<MenuItem> items){
		menuitems = items;
	}

	public void setItems(ArrayList<MenuItem>m){
		menuitems = m;
	}

	public Iterator createIterador(){
		return menuitems.iterator();
	}

	public void addHamburguesa(String n, String d, boolean v, double p){
		MenuItem hamburguesa = new MenuItem(n, d, v, p);

		menuitems.add(hamburguesa);
		
  	}

  	public void addHamburguesa(MenuItem menuItem){
		menuitems.add(menuItem);
	}

}
