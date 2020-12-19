import java.util.LinkedList;
public class NetflisDos implements SistemaCobro{
	private LinkedList<Cliente> clientesConDos;

	public NetflisDos(Cliente c){
		clientesConDos = new LinkedList<Cliente>();
		clientesConDos.add(c);
	}

	/**
	 * Estrategia especifica para dos dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 10){
			System.out.println(c.getNombre() + " lamentamos que tenga que dejar Netflis :( .");
			clientesConDos.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 10 pesos por Netflis en 2 dispositivos.");
			c.setSaldo(saldo-10);
		}
	}
}