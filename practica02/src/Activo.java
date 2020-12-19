/**
 * Interface Activo. Interfaz que modela el comportamiento del Robot
 * cuando esta activo.
 * @author Luis Geovanni Mendez Avila
 */
 public class Activo implements Estado{
 	private Robot robot;

 	/**
	 * Constructor del estado activo.
	 */
 	public Activo(Robot r){
 		robot = r;
 	}

 	/**
	 * activa al robot, no va a funcionar ya que se encuentra activo.
	 */
 	public void activar(){
 		System.out.println("Ya estoy activo ._.??");
 	}

 	/**
	 * Manda a suspender al robot, por restriccion no va a poderse.
	 */
 	public void suspender(){
 		System.out.println("No puedo suspenderme mientras estoy esperando orden.");
 	}

 	/**
	 * Cambia el estado del robot a caminando.
	 */
 	public void caminar(){
 		robot.setEstado(robot.getCaminando());
 	}

 	/**
	 * Manda a trabajar al robot, pero no va a poder por restriccion.
	 */
 	public void trabajar(Casa casa){
 		System.out.println("Primero debo recibir una orden.");
 	}

 	/**
 	 * Manda a abastecer al robot, pero no va a poder por restriccion.
 	 */
 	public void abastecer(){
 		System.out.println("Primero debo recibir una orden.");
 	}

 	/**
 	 * Le da una orden al robot, no va a poder por restriccion.
 	 */
 	public void recibirOrden(){
 		robot.setEstado(robot.getRecibiendoOrden());
 		robot.darOrden();
 	}
 }