public class LlantaOrugaTanque implements Llanta{
	
	private String tipo = "Oruga de Tanque";

	private int ataque = 700;
	private int defensa = 1000;
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