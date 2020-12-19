public class MotorTurbo implements Motor{
	
	private String tipo = "Turbo";

	private int ataque = 500;
	private int defensa = 500;
	private int velocidad = 2500;
	private int costo = 2500;

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