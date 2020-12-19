 import java.util.Iterator;
public class Robot{

	Estado estadoActual;
	Estado estadoAnterior;
	Suspendido suspendido;
	Atendiendo atendiendo;
	Caminando caminando;
	Cocinando cocinando;

	Modulo moduloActual;
	Modulo auxiliar;
	ModuloHamburguesa moduloHamburguesa;
	ModuloBurrito moduloBurrito;
	ModuloPizza moduloPizza;

	PizzaMenu pizzas;
	BurritoMenu burritos;
	HamburguesaMenu hamburguesas;

	MenuItem eleccion;

	public Robot(PizzaMenu p, BurritoMenu b, HamburguesaMenu h){
		this.suspendido = new Suspendido(this);
		this.atendiendo = new Atendiendo(this);
		this.caminando = new Caminando(this);
		this.cocinando = new Cocinando(this);

		estadoActual = suspendido;
		estadoAnterior = null;

		pizzas = p;
		burritos = b;
		hamburguesas = h;

		this.moduloBurrito = new ModuloBurrito(this);
		this.moduloHamburguesa = new ModuloHamburguesa(this);
		this.moduloPizza = new ModuloPizza(this);
	}

	public void setModuloActual(Modulo mod){
		moduloActual = mod;
	}

	public void setModuloHamburguesa(){
		this.moduloActual = moduloHamburguesa;
	}

	public void setModuloBurrito(){
		this.moduloActual = moduloBurrito;
	}

	public void setModuloPizza(){
		this.moduloActual = moduloPizza;
	}

	public void setEstadoActual(Estado estado){
		this.estadoActual = estado;
	}

	public Estado getEstadoActual(){
		return this.estadoActual;
	}

	public void setEstadoAnterior(Estado estado){
		this.estadoAnterior = estado;
	}

	public Estado getEstadoAnterior(){
		return estadoAnterior;
	}

	public void setModuloActual(MenuItem menuItem){
		if (menuItem.getNombre().contains("pizza")){
			setModuloPizza();
		} else if (menuItem.getNombre().contains("hamburguesa")){
			setModuloHamburguesa();
		} else if (menuItem.getNombre().contains("burrito")){
			setModuloBurrito();
		}
	}

	public void setEleccion(MenuItem eleccion){
		this.eleccion = eleccion;
	}

	public MenuItem getEleccion(){
		return eleccion;
	}

	public void camina(){
		estadoActual.caminar();
	}

	public void cocina(){
		estadoActual.cocinar();
	}

	public void suspendete(){
		estadoActual.suspender();
	}

	public void atiende(){
		estadoActual.atender();
	}

	public Estado getSuspendido(){
		return suspendido;
	}

	public Estado getAtendiendo(){
		return atendiendo;
	}

	public Estado getCaminando(){
		return caminando;
	}

	public Estado getCocinando(){
		return cocinando;
	}

	public void entregarComida(){
		System.out.println("Entregando tu orden de: " + eleccion.getNombre());
	}

	public void entregarMercancia(){
		System.out.println("Entregando tu objeto: " + eleccion.getNombre());
	}

	public void printMenu(){
		Iterator hamburguesas = this.hamburguesas.createIterador();
		Iterator pizzas = this.pizzas.createIterador();
		Iterator burritos = this.burritos.createIterador();

		System.out.println("--------------------MENU---------------------");
		System.out.println("                                             ");
		System.out.println("-------------------Pizzas--------------------");
		printMenu(pizzas);
		System.out.println("------------------Burritos-------------------");
		printMenu(burritos);
		System.out.println("----------------Hamburguesas-----------------");
		printMenu(hamburguesas);

	}

	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getNombre() +", "+ 
								menuItem.getPrecio() + " -- "+
								menuItem.getDescripcion());
		}
	}
}