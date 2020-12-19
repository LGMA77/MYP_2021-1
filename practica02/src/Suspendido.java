/**
 * Interface Activo. Interfaz que modela el comportamiento del Robot
 * cuando esta suspendido.
 * @author Luis Geovanni Mendez Avila
 */
 public class Suspendido implements Estado{
 	private Robot robot;

  	public Suspendido(Robot r){
 		robot = r;
 	}

 	/**
	 * Cambia del estado Suspendido al estado Activo.
	 */
 	public void activar(){
 		robot.setEstado(robot.getActivo());
 	}

 	public void suspender(){
 		System.out.println("Ya estoy suspendido ._.??");
 	}

 	public void caminar(){
 		System.out.println("Primero activame");
 	}

 	public void trabajar(Casa casa){
 		System.out.println("primero activame y despues dame una orden");
 	}

  	public void abastecer(){
 		System.out.println("primero activame y me das una orden.");
 	}

 	public void recibirOrden(){
 		System.out.println("primero activame");
 	}
 }