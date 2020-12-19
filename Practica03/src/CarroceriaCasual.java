public class CarroceriaCasual implements Carroceria{
	
	private String tipo = "Casual";

	private int ataque = 200;
	private int defensa = 400;
	private int velocidad = 300;
	private int costo = 200; 

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