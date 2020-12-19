import java.util.LinkedList;
public class SpootifyNormal implements SistemaCobro{
	private LinkedList<Cliente> clientesNormales;

	public SpootifyNormal(Cliente c){
		clientesNormales = new LinkedList<Cliente>();
		clientesNormales.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		System.out.println(c.getNombre() + " usar Spootify es gratis ;) ");
	}
}