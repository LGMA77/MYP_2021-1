import java.util.LinkedList;
public class Spootify implements Servicio{
	private LinkedList<Cliente> clientes;
	private SistemaCobro plan;
	private String recomendacion;

	/**
	 * Constructor que inicializa una lista ligada de tipo cliente
	 * para evitar nullPointerException.
	 */
	public Spootify(){
		clientes = new LinkedList<Cliente>();
	}

	/**
	 * Regresa una recomendacion adecuada para este servicio
	 */
	public String getRecomendacion(){
		return recomendacion;
	}

	/**
	 * Modifica la recomendacion... por si acaso
	 */
	public void setRecomendacion(String r){
		recomendacion = r;
	}

	/**
	 * Inicializa la variable de clase plan
	 * con la clase NetflisUno y su respectiva estrategia
	 */
	public void spootifyNormal(Cliente c){
		plan = new SpootifyNormal(c);
	}

	/**
	 * Inicializa la variable de clase plan
	 * con la clase NetflisDos y su respectiva estrategia
	 */
	public void spootifyPremium(Cliente c){
		plan = new SpootifyPremium(c);
	}

	/**
	 * Revisa el saldo del cliente que recibe como parametro
	 * y lo compara con la tarifa de la respectiva estrategia
	 * si el saldo es menor , el cliente es eliminado de la lista
	 * de clientes. SI el saldo es suficiente aplica el cobro de
	 * la respectiva estrategia.
	 */
	public void cobra(Cliente c){
		plan.cobrar(c);
	}

	/**
	 * Agrega al cliente a la lista de clientes.
	 */
	public void agregar(Cliente c){
		clientes.add(c);

		System.out.println(c.getNombre() + " Te damos la bienvenida a Spootify n.n");
	}

	/**
	 * Elimina al cliente de la lista de clientes
	 */
	public void eliminar(Cliente c){
		System.out.println(c.getNombre() + " lamentamos que tenga que dejar Spootify u.u ");
		clientes.remove(c);
	}

	/**
	 * Envia una recomendacion a todos los clientes de la
	 * lista
	 */
	public void recomendar(){
		for(Cliente c : clientes){
			c.actualizar(this);
		}
	}
}