public class Caniones implements Armas{
	
	private String tipo = "Caniones"; 

	private int ataque = 2000;
	private int defensa = 600;
	private int velocidad = 500;
	private int costo = 1000;

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