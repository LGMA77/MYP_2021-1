import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
public class Prueba{
	
	public static void main(String[] args) {
		HamburguesaMenu hm = new HamburguesaMenu();
		PizzaMenu pizzas = new PizzaMenu();
		BurritoMenu burritos = new BurritoMenu();


		Mercancia pikachu = new Mercancia("pikachu", 50.0, "Amarillo", "Plastico");
		Mercancia plato = new Mercancia("plato", 20.0, "rojo", "ceramica");
		Mercancia vaso = new Mercancia("vaso", 15.0, "rojo", "vidrio");
		Mercancia gorra = new Mercancia("gorra", 35.0, "rojo", "tela");
		Mercancia playera = new Mercancia("playera", 25.0, "rojo", "algodon");
		Mercancia tenis = new Mercancia("tenis", 550.0, "rojo", "gamusa");
		Mercancia poster = new Mercancia("poster", 10.0, "muchos colores", "papel ilustracion");
		Mercancia lentes = new Mercancia("lentes", 400.0, "rojo", "acetato");
		Mercancia calendario = new Mercancia("calendario", 50.0, "muchos colores", "carton");
		Mercancia chamarra = new Mercancia("chamarra", 700.0, "rojo", "cuero");

		MercanciaAdaptada adapter = new MercanciaAdaptada();

		MenuItem pikachuAdaptado = adapter.adaptar(pikachu);
		MenuItem platoAdaptado = adapter.adaptar(plato);
		MenuItem vasoAdaptado = adapter.adaptar(vaso);
		MenuItem gorraAdaptada = adapter.adaptar(gorra);
		MenuItem playeraAdaptada = adapter.adaptar(playera);
		MenuItem tenisAdaptado = adapter.adaptar(tenis);
		MenuItem posterAdaptado = adapter.adaptar(poster);
		MenuItem lentesAdaptados = adapter.adaptar(lentes);
		MenuItem calendarioAdaptado = adapter.adaptar(calendario);
		MenuItem chamarraAdaptada = adapter.adaptar(chamarra);
		
		pizzas.addPizza("pizza_pepperoni", "Clasica", true, 150.0);
		pizzas.addPizza("pizza_hawaiana", "Pizza con piña >:) ", true, 150.0);
		pizzas.addPizza("pizza_4_quesos", "Puro queso", true, 150.0);
		pizzas.addPizza("pizza_vegetariana", "Que aburrido", true, 150.0);
		pizzas.addPizza("pizza_mexicana", "Ajua", false, 150.0);

		burritos.addBurrito("burrito_vegetariano", "Pura hierba", false, 50.0);
		burritos.addBurrito("burrito_arrachera", "carne norteña", false, 50.0);
		burritos.addBurrito("burrito_pollo", "pechuga de pollo", false, 50.0);
		burritos.addBurrito("burrito_choriqueso", "Chorizo 7u7", false, 50.0);
		burritos.addBurrito("burrito_lomo_cerdo", "lomo de cerdo", false, 50.0);

		hm.addHamburguesa("hamburguesa_de_res" , "Hamburguesa clasica", false, 80.0);
		hm.addHamburguesa("hamburguesa_de_costilla" , "costillas BBQ", false, 80.0);
		hm.addHamburguesa("hamburguesa_de_pollo" , "carne de pollo", false, 80.0);
		hm.addHamburguesa("hamburguesa_vegetariana" , "soya", false, 80.0);
		hm.addHamburguesa("hamburguesa_de_queso" , "Queso empanizado", false, 80.0);

		hm.addHamburguesa(pikachuAdaptado);
		hm.addHamburguesa(platoAdaptado);
		hm.addHamburguesa(vasoAdaptado);
		hm.addHamburguesa(gorraAdaptada);
		hm.addHamburguesa(playeraAdaptada);
		hm.addHamburguesa(tenisAdaptado);
		hm.addHamburguesa(posterAdaptado);
		hm.addHamburguesa(lentesAdaptados);
		hm.addHamburguesa(calendarioAdaptado);
		hm.addHamburguesa(chamarraAdaptada);

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenido al restaurante -----");
		System.out.println("Quieres hacer una orden? \n 1) si \n 2) no ");
		int opcion = scan.nextInt();

		Robot eva02 = new Robot(pizzas, burritos, hm);

		if(opcion == 1){
			eva02.atiende(); //para que el robot no este suspendido
			System.out.println("Por favor elija una opcion de nuestro menu (escribir como se ve el nombre en el menu): ");	
		}else{
			System.out.println("De nada , vuelta pronto.");
			System.exit(0);
		}
		eva02.atiende(); //robot entra a estado antender.
		
		String opcionCliente = scan.next();
		
			switch(opcionCliente){
				case "pizza_pepperoni":
					eva02.setEleccion(pizzas.menuitems[0]);
					Pizza_Pepperoni pp = new Pizza_Pepperoni();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(pp);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "pizza_hawaiana":
					eva02.setEleccion(pizzas.menuitems[1]);
					Pizza_Hawaiana ph = new Pizza_Hawaiana();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(ph);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "pizza_4_quesos":
					eva02.setEleccion(pizzas.menuitems[2]);
					Pizza_Quesos pq = new Pizza_Quesos();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(pq);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "pizza_vegetariana":
					eva02.setEleccion(pizzas.menuitems[3]);
					Pizza_Vegetariana pv = new Pizza_Vegetariana();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(pv);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "pizza_mexicana":
					eva02.setEleccion(pizzas.menuitems[4]);
					Pizza_Mexicana mx = new Pizza_Mexicana();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(mx);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "burrito_vegetariano":
					eva02.setEleccion(burritos.menuitems.get(1));
					Burrito_Vegetariano bv = new Burrito_Vegetariano();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(bv);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "burrito_arrachera":
					eva02.setEleccion(burritos.menuitems.get(2));
					Burrito_Arrachera ba = new Burrito_Arrachera();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(ba);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "burrito_pollo":
					eva02.setEleccion(burritos.menuitems.get(3));
					Burrito_Pollo bp = new Burrito_Pollo();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(bp);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "burrito_choriqueso":
					eva02.setEleccion(burritos.menuitems.get(4));
					Burrito_Choriqueso bc = new Burrito_Choriqueso();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(bc);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "burrito_lomo_cerdo":
					eva02.setEleccion(burritos.menuitems.get(5));
					Burrito_LomoCerdo blc = new Burrito_LomoCerdo();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(blc);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "hamburguesa_de_res":
					eva02.setEleccion(hm.menuitems.get(0));
					Hamburguesa_Res hr = new Hamburguesa_Res();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(hr);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "hamburguesa_de_costilla":
					eva02.setEleccion(hm.menuitems.get(1));
					Hamburguesa_Costillitas hc = new Hamburguesa_Costillitas();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(hc);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "hamburguesa_de_pollo":
					eva02.setEleccion(hm.menuitems.get(2));
					Hamburguesa_Pollo hp = new Hamburguesa_Pollo();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(hp);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "hamburguesa_vegetariana":
					eva02.setEleccion(hm.menuitems.get(3));
					Hamburguesa_Vegetariana hv = new Hamburguesa_Vegetariana();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(hv);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "hamburguesa_de_queso":
					eva02.setEleccion(hm.menuitems.get(4));
					Hamburguesa_QuesoEmpanizado hqe = new Hamburguesa_QuesoEmpanizado();
					eva02.camina(); // el robot solo camina
					eva02.setModuloActual(hqe);
					eva02.cocina(); 
					eva02.camina();
					eva02.atiende(); // el robot al final se suspende
					
					break;

				case "pikachu":
					eva02.setEleccion(hm.menuitems.get(5));
					eva02.entregarMercancia();
					
					break;

				case "plato":
					eva02.setEleccion(hm.menuitems.get(6));
					eva02.entregarMercancia();
					
					break;

				case "vaso":
					eva02.setEleccion(hm.menuitems.get(7));
					eva02.entregarMercancia();
					
					break;

				case "gorra":
					eva02.setEleccion(hm.menuitems.get(8));
					eva02.entregarMercancia();
					
					break;

				case "playera":
					eva02.setEleccion(hm.menuitems.get(9));
					eva02.entregarMercancia();
					
					break;

				case "tenis":
					eva02.setEleccion(hm.menuitems.get(10));
					eva02.entregarMercancia();
					
					break;

				case "poster":
					eva02.setEleccion(hm.menuitems.get(11));
					eva02.entregarMercancia();
					
					break;

				case "lentes":
					eva02.setEleccion(hm.menuitems.get(12));
					eva02.entregarMercancia();
					
					break;

				case "calendario":
					eva02.setEleccion(hm.menuitems.get(13));
					eva02.entregarMercancia();
					
					break;

				case "chamarra":
					eva02.setEleccion(hm.menuitems.get(14));
					eva02.entregarMercancia();
					
					break;

				default :
					System.out.println("Por favor asegure escribir bien lo que quiere pedir, escribelo tal como se su nombre en el menu.");
					
					break;
			}
		
	}
}