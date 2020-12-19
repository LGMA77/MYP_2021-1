public class Lanzallamas implements Armas{
	
	private String tipo = "Lanzallamas";

	private int ataque = 1750;
	private int defensa = 400;
	private int velocidad = 900;
	private int costo = 750;

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