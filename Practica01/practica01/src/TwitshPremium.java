import java.util.LinkedList;
public class TwitshPremium implements SistemaCobro{
	private LinkedList<Cliente> clientesPremium;

	public TwitshPremium(Cliente c){
		clientesPremium = new LinkedList<Cliente>();
		clientesPremium.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 10){
			System.out.println(c.getNombre() + " ha perdido su suscripcion a Twitsh Premium :( .");
			clientesPremium.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 10 pesos por usar Twitsh Premium.");
			c.setSaldo(saldo-10);
		}
	}
}