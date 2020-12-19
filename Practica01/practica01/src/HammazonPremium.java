import java.util.LinkedList;
public class HammazonPremium implements SistemaCobro{
	private LinkedList<Cliente> clientesPremium;

	public HammazonPremium(Cliente c){
		clientesPremium = new LinkedList<Cliente>();
		clientesPremium.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 13){
			System.out.println(c.getNombre() + " ha perdido su suscripcion a Hammazon Premium :( .");
			clientesPremium.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 13 pesos por usar Hammazon Premium.");
			c.setSaldo(saldo-13);
		}
	}
}