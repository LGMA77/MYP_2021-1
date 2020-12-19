public class BlindajeReforzado implements Blindaje{
	
	private String tipo = "Reforzado";
	
	private int ataque = 500;
	private int defensa = 1000;
	private int velocidad = 750;
	private int costo = 500;

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