public class LlantaSimple implements Llanta{
	
	private String tipo = "Simple";

	private int ataque = 300;
	private int defensa = 200;
	private int velocidad = 500;
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