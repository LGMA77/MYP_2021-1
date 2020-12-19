import java.util.LinkedList;
public class HammazonNormal implements SistemaCobro{
	private LinkedList<Cliente> clientesNormales;

	public HammazonNormal(Cliente c){
		clientesNormales = new LinkedList<Cliente>();
		clientesNormales.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 7){
			System.out.println(c.getNombre() + " ha perdido su suscripcion a Hammazon :( .");
			clientesNormales.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 7 pesos por usar Hammazon.");
			c.setSaldo(saldo-7);
		}
	}
}