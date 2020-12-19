import java.util.LinkedList;
public class Cliente implements Usuario{
	private LinkedList<Servicio> servicios;
	private String nombre;
	private int saldo;
	private String recomendacionDelDia;

	/**
	 * Crea una objeto cliente con un nombre y saldo inicial
	 */
	public Cliente(String n, int s){
		this.nombre = n;
		this.saldo = s;
		servicios = new LinkedList<Servicio>();
	}

	/**
	 * Regresa el nombre del cliente
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * Regresa el saldo del cliente
	 */
	public int getSaldo(){
		return saldo;
	}

	/**
	 * Establece el saldo del cliente
	 */
	public void setSaldo(int s){
		saldo = s;
	}

	public void suscribir(Servicio s){
		servicios.add(s);
		s.agregar(this);
	}

	public void cancelar(Servicio s){
		servicios.remove(s);
		s.eliminar(this);
	}

	/**
	 * Es parte del patron observer pero aun no lo puedo implementar bien (auxiliar)
	 */
	private void imprimeRecomendacion(){
		//System.out.println(recomendacion);
	}

	/**
	 * Actualiza las recomendaciones de los servicios
	 * todavia no lo puedo implementar bien.
	 */
	public void actualizar(Servicio s){
		//recomendacionDelDia = s.darRecomendacion();
	}
}