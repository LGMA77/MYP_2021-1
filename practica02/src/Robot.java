/**
 * Class Robot. Clase que modela el comportamiento y caracteristicas
 * de un Robot constructor de casas.
 * @author Luis Geovanni Mendez Avila
 */
public class Robot{
	private Estado estadoActual;
	private boolean estadoTrabajando = false;
	private Casa casaAuxiliar;

	private Estado activo;
	private Estado suspendido;
	private Estado caminando;
	private Estado trabajando;
	private Estado recibiendoOrden;
	private Estado abasteciendo;

	/**
	 * Constructor del Robot.
	 */
	public Robot(){
		activo = new Activo(this);
		suspendido = new Suspendido(this);
		caminando = new Caminando(this);
		abasteciendo = new Abasteciendo(this);
		trabajando = new Trabajando(this); 
		recibiendoOrden = new RecibiendoOrden(this);

		estadoActual = suspendido;
		casaAuxiliar = null;
	}

	/**
	 * Metodo que hace que el robot ejecute el algoritmo de armar una casa.
	 * @param casa. La casa que debe armar.
	 */
	public void construir(Casa casa){
		casa.armaCasa();
	}

	public Casa getCasa(){
		return casaAuxiliar;
	}

	public void setCasa(Casa casa){
		casaAuxiliar = casa;
	}

	/**
	 * Metodo para deifinir el estado acutal del robot.
	 */
	public void setEstado(Estado nuevo){
		estadoActual = nuevo;
	}

 	/**
 	 * Una bandera para saber que esta en el estado trabajando
 	 */
	public boolean estadoTrabajando(){
		estadoTrabajando = true;
		return estadoTrabajando;
	}

	public void imprimeMenu(){
		System.out.println("Hola soy un robot constructor elige una de las siguientes opciones: \n" +
							"Ingresa (1) para activarme. \n"+
							"Ingresa (2) para ponerme a caminar. \n"+
							"Ingresa (3) para darme una orden. \n"+
							"Ingresa (4) para ponerme a abastecer. \n"+
							"Ingresa (5) para ponerme a trabajar. \n"+
							"Ingresa (6) para suspenderme.");
	}

	/**
	 * Metodo que llama activar al robot, dependiendo del estado actual del robot
	 * resultara una respuesta distinta.
	 */
	public void activarRobot(){
		estadoActual.activar();
	}

	/**
	 * Metodo que manda al robot a abstecerse de materiales para la construccion
	 * resultara una respuesta distinta dependiendo del estado actual del robot.
	 */
	public void ponerAabastecer(){
		estadoActual.abastecer();
	}

	/**
	 * Pone a trabajar al robot, dependiendo del estado del robot su respuesta
	 * sera distinta.  
	 */
	public void ponerAtrabajar(Casa casa){
		estadoActual.trabajar(casa);
	}

	/**
	 * Método que hace que el robot camine, dependiendo del estado del robot su
	 * respuesta sera distinta.
	 */
	public void ponerAcaminar(){
		estadoActual.caminar();
	}

	/**
	 * Metodo que le da una orden al robot. En este caso la orden se basa en el tipo
	 * de casa que debe hacer el robot en su rutina de trabajo, por eso depende de un
	 * par de parametros de tipo entero.
	 */
	public void darOrden(){
		estadoActual.recibirOrden();
	}

	/**
	 * Metodo que manda a suspender al robot, su respuesta depende del estado actual
	 * del robot,
	 */
	public void suspendeRobot(){
		estadoActual.suspender();
	}

	/**
	 * Regresa una referencia al parametro de clase de tipo Activo.
	 */
	public Estado getActivo(){
		return activo;
	}

	/**
	 * Regresa una referencia al parametro de clase de tipo Suspendido.
	 */
	public Estado getSuspendido(){
		return suspendido;
	}

	/**
	 * Regresa una referencia al parametro de clase de tipo Caminando.
	 */
	public Estado getCaminando(){
		return caminando;
	}

	/**
	 * Regresa una referencia al parametro de clase de tipo Abasteciendo.
	 */
	public Estado getAbasteciendo(){
		return abasteciendo;
	}

	/**
	 * Regresa una referencia al parametro de clase de tipo Trabajando.
	 */
	public Estado getTrabajando(){
		return trabajando;
	}

	/**
	 * Regresa una referencia al parametro de clase de tipo RecibiendoOrden.
	 */
	public Estado getRecibiendoOrden(){
		return recibiendoOrden;
	}
}