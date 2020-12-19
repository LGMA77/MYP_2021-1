public class LlantaOffRoad implements Llanta{
	
	private String tipo = "Off Road";
		
	private int ataque = 500;
	private int defensa = 600;
	private int velocidad = 700;
	private int costo = 500;

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