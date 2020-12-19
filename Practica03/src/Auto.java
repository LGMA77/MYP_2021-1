public class Auto{
	private int ataque , defensa , velocidad , costo;
	private Llanta llantas;
	private Motor motor;
	private Carroceria carroceria;
	private Blindaje blindaje;
	private Armas arma;

	public Auto(Llanta l , Motor m , Carroceria c , Blindaje b , Armas a){
		llantas = l;
		motor = m;
		carroceria = c;
		blindaje = b;
		arma = a;
	}

	public void setAtaque(int atq){
		ataque = atq;
	}

	public void setDefensa(int df){
		defensa = df;
	}

	public void setVelocidad(int vel){
		velocidad = vel;
	}

	public void setCosto(int cst){
		costo = cst;
	}

	public int getAtaque(){
		return llantas.getAtaque() +
			   motor.getAtaque() +
			   carroceria.getAtaque() +
			   blindaje.getAtaque() +
			   arma.getAtaque(); 
	}

	public int getDefensa(){
		return llantas.getDefensa() +
			   motor.getDefensa() +
			   carroceria.getDefensa() +
			   blindaje.getDefensa() +
			   arma.getDefensa();
	}

	public int getVelocidad(){
		return llantas.getVelocidad() +
			   motor.getVelocidad() +
			   carroceria.getVelocidad() +
			   blindaje.getVelocidad() +
			   arma.getVelocidad();
	}

	public int getCosto(){
		return llantas.getCosto() +
			   motor.getCosto() +
			   carroceria.getCosto() +
			   blindaje.getCosto() +
			   arma.getCosto();
	}

	public void imprimeDatos(){
		System.out.println(	"Informacion de los componentes: \n"+
							"Llantas: " + llantas.getTipo() + "\n" +
							"Motor: " + motor.getTipo() + "\n" +
							"Carroceria: " + carroceria.getTipo() + "\n" +
							"Blindaje: " + blindaje.getTipo() + "\n" +
							"Arma: " + arma.getTipo() + "\n" +
							"\n"+
							"\n"+
							"Estadisticas de tu auto: \n" +
							"Ataque: " + this.getAtaque() + "\n"+
							"Defensa: " + this.getDefensa() + "\n" +
							"Velocidad: " + this.getVelocidad() + "\n" +
							"Costo: " + this.getCosto());

	}
}