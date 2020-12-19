public class Suspendido implements Estado{

	Robot robot;

	public Suspendido(Robot robot){
		this.robot = robot;
	}

	public void suspender(){
		System.out.println("Me encuentro suspendido.\n");
	}

	public void caminar(){
		System.out.println("No puedo caminar mientras estoy suspendido.\n");
	}

	public void atender(){
		robot.setEstadoAnterior(this);
		robot.setEstadoActual(robot.getAtendiendo());
	}

	public void cocinar(){
	  	System.out.println("No puedo cocinar mientras estoy suspendido.\n");
	}
}
