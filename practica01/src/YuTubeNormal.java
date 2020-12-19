import java.util.LinkedList;
public class YuTubeNormal implements SistemaCobro{
	private LinkedList<Cliente> clientesNormales;

	public YuTubeNormal(Cliente c){
		clientesNormales = new LinkedList<Cliente>();
		clientesNormales.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		System.out.println(c.getNombre() + " usar YuTube es gratis ;) ");
	}
}