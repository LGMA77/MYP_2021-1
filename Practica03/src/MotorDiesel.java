public class MotorDiesel implements Motor{
	
	private String tipo = "Diesel";

	private int ataque = 300;
	private int defensa = 200;
	private int velocidad = 750;
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