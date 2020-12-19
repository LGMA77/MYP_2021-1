public class Arpones implements Armas{
	
	private String tipo = "Arpones";

	private int ataque = 1000;
	private int defensa = 200;
	private int velocidad = 750;
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