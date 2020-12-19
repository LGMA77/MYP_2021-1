import java.util.LinkedList;
public class YuTubePremium implements SistemaCobro{
	private LinkedList<Cliente> clientesPremium;

	public YuTubePremium(Cliente c){
		clientesPremium = new LinkedList<Cliente>();
		clientesPremium.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 6){
			System.out.println(c.getNombre() + " ha perdido su suscripcion a YuTube Premium :( .");
			clientesPremium.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 6 pesos por usar YuTube Premium.");
			c.setSaldo(saldo-6);
		}
	}
}