public class Sierra implements Armas{
	
	private String tipo = "Sierra"; 

	private int ataque = 700;
	private int defensa = 200;
	private int velocidad = 500;
	private int costo = 900;

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