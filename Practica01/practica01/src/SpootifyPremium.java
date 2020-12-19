import java.util.LinkedList;
public class SpootifyPremium implements SistemaCobro{
	private LinkedList<Cliente> clientesPremium;

	public SpootifyPremium(Cliente c){
		clientesPremium = new LinkedList<Cliente>();
		clientesPremium.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 4){
			System.out.println(c.getNombre() + " ha perdido su suscripcion a Spootify Premium :( .");
			clientesPremium.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 4 pesos por usar Spootify Premium.");
			c.setSaldo(saldo-4);
		}
	}
}