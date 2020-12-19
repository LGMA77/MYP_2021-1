/**
 * Class Abasteciendo. Define lo que puede hacer el robot mientras abastece.
 * @author Luis Geovanni Mendez Avila
 */
public class Abasteciendo implements Estado{

	private Robot robot;
	
	/**
	 * Constructor del estado Abasteciendo.
	 */
 	public Abasteciendo(Robot r){
 		robot = r;
 	}

 	/**
 	 * manda a activar al robot mientras se encuentra en estado Abasteciendo.
 	 */
	public void activar(){
		System.out.println("Ya estoy activo ._.??");
	}

	/**
	 * suspende al robot mientras esta abasteciendo.
	 */
	public void suspender(){
		System.out.println("No puedo suspenderme hasta acabar la orden");
	}

	/**
	 * Pone a caminar al robot mientras esta abasteciendo.
	 */
	public void caminar(){
		System.out.println("No puedo caminar mientras abastesco");
	}

	/**
	 * Pone a trabajar al robot mientras está abasteciendo.
	 * @param casa . Es la casa que debe construir.
	 */
	public void trabajar(Casa casa){
		System.out.println("Primero debo terminar de abastecer");
	}

	/**
	 * imprime el mensaje de que esta abasteciendo.
	 */

	public void abastecer(){
		System.out.println("Recogiendo materiales necesarios...");
	}

	/**
	 * le da una orden al robot mientras abastece.
	 */
	public void recibirOrden(){
		System.out.println("Ya recibi una orden");
	}
}