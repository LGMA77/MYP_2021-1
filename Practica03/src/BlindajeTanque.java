public class BlindajeTanque implements Blindaje{
	
	private String tipo = "Tanque";
	
	private int ataque = 700;
	private int defensa = 1500;
	private int velocidad = 600;
	private int costo = 1500; 

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