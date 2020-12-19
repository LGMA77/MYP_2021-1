 public class Caminando implements Estado{

	Robot robot;

	public Caminando(Robot robot){
		this.robot = robot;
	}

	public void suspender(){
		System.out.println("No me puedo suspender\n");
	}

	public void caminar(){
		if(robot.getEstadoAnterior() instanceof Atendiendo){
			System.out.println("Ahorita vengo, voy a cocinar.");
			robot.setEstadoAnterior(robot.getCaminando());
			robot.setEstadoActual(robot.getCocinando());
			robot.setModuloActual(robot.getEleccion());
			return;
		}else if(robot.getEstadoAnterior() instanceof Cocinando){
			System.out.println("Ya regrese de la cocina");
			robot.setEstadoAnterior(robot.getCaminando());
			robot.setEstadoActual(robot.getAtendiendo());
			return;
		}else{
			System.out.println("No puedo caminar en este momento.");
		}
	}

	public void atender(){
		System.out.println("No puedo tomar tu orden mientras camino\n");
	}

	public void cocinar(){
	    System.out.println("No puedo cocinar mientras camino");
	}
}
