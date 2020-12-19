public class BlindajeSimple implements Blindaje{
	
	private String tipo = "Simple";

	private int ataque = 200;
	private int defensa = 600;
	private int velocidad = 400;
	private int costo = 200;

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