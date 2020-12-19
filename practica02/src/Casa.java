/**
 * Class Casa. Clase que implementa el agoritmo para construir una casa.
 * @author Luis Geovanni Mendez Avila.
 */
public class Casa{
	private int costo = 1000000;
	private Aislamiento aislamiento;
	private Esqueleto esqueleto;

	/**
	 * Constructor de la clase casa.
	 * @param e . El esqueleto que se va a construir.
	 * @param a . El aislamiento que se va a poner.
	 */
	public Casa(Esqueleto e, Aislamiento a){
		esqueleto = e;
		aislamiento = a;
	}

	/**
	 * Metodo que hace todo el procedimiento para construir una casa.
	 */
	public void armaCasa(){
		preparacionTerreno();
		colocacionCimientos();
		construccionEsqueleto();
		instalacion();
		aislamientoCasa();
		acabados();
	}

	public void setEsqueleto(Esqueleto e){
		esqueleto = e;
	}

	public Esqueleto getEsqueleto(){
		return esqueleto;
	}

	public void setAislamiento(Aislamiento a){
		aislamiento = a;
	}

	public Aislamiento getAislamiento(){
		return aislamiento;
	}
	
	/**
	 * Mensaje de preparacion de terreno.
	 */
	public void preparacionTerreno(){
		System.out.println("Preparando el terreno...");
	}

	/**
	 * Mensaje de colocacion de cimientos.
	 */
	public void colocacionCimientos(){
		System.out.println("Colocando cimientos...");
	}

	/**
	 * Mensaje de construccion de esqueleto, dependera del tipo de esqueleto elegido.
	 */
	public void construccionEsqueleto(){
		esqueleto.tipoDeEsqueleto();
	}

	/**
	 * Mensaje de instalacion de plomeria y electricidad.
	 */
	public void instalacion(){
		System.out.println("Instalando plomeria y electricidad...");
	}

	/**
	 * Mensaje de colocacion del aislamiento, dependera del tipo de aislamiento elegido.
	 */
	public void aislamientoCasa(){
		aislamiento.tipoDeAislamiento();
	}

	/**
	 * Mensaje de colocacion de acabados.
	 */
	public void acabados(){
		System.out.println("Haciendo acabados...");
	}

}