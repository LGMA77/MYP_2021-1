/**
 * Interface Activo. Interfaz que modela el comportamiento del Robot
 * cuando esta trabajando.
 * @author Luis Geovanni Mendez Avila
 */
 public class Trabajando implements Estado{
 	private Robot robot;

  	public Trabajando(Robot r){
 		robot = r;
 	}

 	public void activar(){
 		System.out.println("Ya estoy activo ._.??");
 	}

 	public void suspender(){
 		System.out.println("Primero debo terminar la orden");
 	}

 	public void caminar(){
 		System.out.println("En este momento no puedo caminar");
 	}

 	/**
	 * pone al robot a construir la casa.
	 */
 	public void trabajar(Casa casa){
 		robot.estadoTrabajando();
 		robot.construir(casa);
 	}

  	public void abastecer(){
 		System.out.println("Ya tengo los materiales");
 	}

 	public void recibirOrden(){
 		System.out.println("Ya me dieron una orden");
 	}
 }