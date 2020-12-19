public class Metralleta implements Armas{
	
	private String tipo = "Metralleta";

	private int ataque = 2500;
	private int defensa = 700;
	private int velocidad = 1500;
	private int costo = 2000;

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