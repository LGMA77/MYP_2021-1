/**
 * Interface Activo. Interfaz que modela el comportamiento del Robot
 * cuando recibe una orden.
 * @author Luis Geovanni Mendez Avila
 */
 public class RecibiendoOrden implements Estado{
 	private Robot robot;

 	/**
	 * Constructor del estado Recibiendo orden
	 */
  	public RecibiendoOrden(Robot r){
 		robot = r;
 	}

 	/**
	 * Activa al robot, pero no cambia nada por restriccion.
	 */
 	public void activar(){
 		System.out.println("Ya estoy activo ._.??");
 	}

 	/**
	 * Suspende al robot, pero no cambia nada por restriccion.
	 */
 	public void suspender(){
 		System.out.println("No puedo suspenderme en este momento");
 	}

 	/**
	 * Pone a caminar al robot, pero no cambia nada por restriccion.
	 */
 	public void caminar(){
 		System.out.println("No puedo caminar mientras recibo una orden");
 	}

 	/**
	 * Cambia el estado del robot de recibiendo orden a trabajando
	 */
 	public void trabajar(Casa casa){
 		robot.setEstado(robot.getTrabajando());
 	}

 	/**
	 * Pone a abastecer al robot, pero no funciona si aun no recibe una orden
	 */
  	public void abastecer(){
 		System.out.println("Dame la orden para poder ir a abastecer");
 	}

 	/**
	 * La orden de todo lo que debe hacer el robot en el proceso de construir una casa.
	 */
 	public void recibirOrden(){
 		System.out.println("Recibiendo tu orden...");
 		robot.setEstado(robot.getCaminando()); // ponte a caminar
 		robot.ponerAabastecer(); // dirigete a abastecer
 		robot.setEstado(robot.getAbasteciendo()); // cambia a estado abasteciendo
 		robot.ponerAabastecer(); // abastece
 		robot.setEstado(robot.getCaminando()); // ponte a caminar
 		robot.ponerAtrabajar(robot.getCasa()); // dirigete a trabajar
 		robot.setEstado(robot.getTrabajando()); // cambia a estado trabajando
 		robot.ponerAtrabajar(robot.getCasa()); // trabaja
 		robot.setEstado(robot.getCaminando()); // ponte a caminar
 		robot.suspendeRobot(); // dirigete a descansar
 		robot.setEstado(robot.getSuspendido()); // cambia a estado suspendido
 	}
 }