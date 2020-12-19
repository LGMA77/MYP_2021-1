import java.util.LinkedList;
public class NetflisCuatro implements SistemaCobro{
	private LinkedList<Cliente> clientesConCuatro;

	public NetflisCuatro(Cliente c){
		clientesConCuatro = new LinkedList<Cliente>();
		clientesConCuatro.add(c);
	}

	/**
	 * Estrategia especifica para cuatro dispositivos
	 */
	public void cobrar(Cliente c){
		int saldo = c.getSaldo();
		if(saldo < 15){
			System.out.println(c.getNombre() + " lamentamos que tenga que dejar Netflis :( .");
			clientesConCuatro.remove(c);
		}else{
			System.out.println(c.getNombre() + " te estamos cobrando 15 pesos por Netflis en 4 dispositivos.");
			c.setSaldo(saldo-15);
		}
	}
}