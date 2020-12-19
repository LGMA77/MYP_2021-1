import java.util.LinkedList;
public class TwitshNormal implements SistemaCobro{
	private LinkedList<Cliente> clientesNormales;

	public TwitshNormal(Cliente c){
		clientesNormales = new LinkedList<Cliente>();
		clientesNormales.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 6){
			System.out.println(c.getNombre() + " ha perdido su suscripcion a Twitsh :( .");
			clientesNormales.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 6 pesos por usar Twitsh.");
			c.setSaldo(saldo-6);
		}
	}
}