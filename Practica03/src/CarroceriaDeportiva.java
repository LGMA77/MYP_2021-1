public class CarroceriaDeportiva implements Carroceria{
	
	private String tipo = "Deportiva";

	private int ataque = 250;
	private int defensa = 400;
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