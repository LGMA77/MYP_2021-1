public class MotorDeportivo implements Motor{
	
	private String tipo = "Deportivo";

	private int ataque = 500;
	private int defensa = 400;
	private int velocidad = 1750;
	private int costo = 1800;

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