public class LlantaDeportiva implements Llanta{
	
	private String tipo = "Deportiva";

	private int ataque = 500;
	private int defensa = 400;
	private int velocidad = 1000;
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