 public class Cocinando implements Estado{

Robot robot;

	public Cocinando(Robot robot){
		this.robot = robot;
	}

	public void suspender(){
	    System.out.println("No me puedo suspender mientras cocino.\n");
	}

	public void caminar(){
	    System.out.println("No puedo caminar mientras cocino.\n");
	}

	public void atender(){
	    System.out.println("Ya recibi una orden, espera a que termine.\n");
	}

	public void cocinar(){
		robot.setEstadoAnterior(this);
	   	robot.moduloActual.cocinar();
	    robot.setEstadoActual(robot.getCaminando());
	}

	public void cocinar(Modulo modulo){
		robot.setEstadoAnterior(this);
		robot.setModuloActual(modulo);
		modulo.cocinar();
		robot.setEstadoActual(robot.getCaminando());
	}
}
