public class CarroceriaCamion implements Carroceria{
	
	private String tipo = "Camion";

	private int ataque = 400;
	private int defensa = 600;
	private int velocidad = 300;
	private int costo = 300;

	public String getTipo(){
		return tipo;
	}

	public int getAtaque(){
		return ataque;
	}

	public int getDefensa(){
		return defensa;
	}

	public int getVelocidad(){
		return velocidad;
	}

	public int getCosto(){
		return costo;
	}
}