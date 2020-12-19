/**
 * Interface Activo. Interfaz que modela el comportamiento del Robot
 * cuando esta caminando.
 * @author Luis Geovanni Mendez Avila
 */
 public class Caminando implements Estado{
 	private Robot robot;

 	/**
	 * Constructor del estado caminando.
	 */
  	public Caminando(Robot r){
 		robot = r;
 	}

 	/**
	 * activa al robot. No habra algun cambio ya que esta activo
	 */
 	public void activar(){
 		System.out.println("Ya estoy activo ._.??");
 	}

 	/**
	 * Cambia el estado del robot de caminando a suspendido.
	 */
 	public void suspender(){
 		System.out.println("A mimir uwu");
 		robot.setEstado(robot.getSuspendido());
 	}

 	/**
	 * pone a caminar mientras esta en estado caminando... obvio no cambia nada.
	 */
 	public void caminar(){
 		System.out.println("Ya estoy caminando ._.??");
 	}

 	/**
	 * Cambia el estado del robot de caminando a trabajando.
	 */
 	public void trabajar(Casa casa){
 		System.out.println("Me dirijo a la zona de construccion");
 		robot.setEstado(robot.getTrabajando());
 	}

 	/**
	 * Cambia el estado del robot de caminando a abasteciendo.
	 */
  	public void abastecer(){
 		System.out.println("Me dirijo a la zona de materiales");
 		robot.setEstado(robot.getAbasteciendo());
 	}

 	/**
	 * da una orden al robot , pero si ya se encuentra caminando, ya se le dio una orden.
	 */
 	public void recibirOrden(){
 		System.out.println("Ya me diste una orden");
 	}
 }