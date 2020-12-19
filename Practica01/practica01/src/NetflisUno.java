import java.util.LinkedList;
public class NetflisUno implements SistemaCobro{
	private LinkedList<Cliente> clientesConUno;

	public NetflisUno(Cliente c){
		clientesConUno = new LinkedList<Cliente>();
		clientesConUno.add(c);
	}


	/**
	 * Estrategia especifica para un dispositivo
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 15){
			System.out.println(c.getNombre() + " lamentamos que tenga que dejar Netflis :( .");
			clientesConUno.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 7 pesos por Netflis en 1 dispositivo.");
			c.setSaldo(saldo-7);
		}
	}
}