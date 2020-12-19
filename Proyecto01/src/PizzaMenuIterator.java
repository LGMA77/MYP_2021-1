import java.util.Iterator;

public class PizzaMenuIterator implements Iterator{

	private MenuItem[] pizzas;
	private int posicion = 0;

	public PizzaMenuIterator(MenuItem[] items){
		pizzas = items;
	}

	public boolean hasNext(){

		if(posicion >= pizzas.length || pizzas[posicion] == null){
			return false;
		}else{
			return true;
		}
	}

	public MenuItem next(){
		if(hasNext()){
			MenuItem pizza = new MenuItem();
			pizza = pizzas[posicion];
			posicion ++;
			return pizza; 
		}else{
			System.out.println("No hay elemento siguiente.");
			throw new NullPointerException();
		}
	}

	public void remove(){
		throw new UnsupportedOperationException("No permitido.");
  	}
}
