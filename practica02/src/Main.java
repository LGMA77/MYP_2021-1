import java.util.Scanner;
public class Main{

	public static Esqueleto esqueletoPedido(int e){
		if(e == 1){
			Esqueleto esq = new EsqConcreto();
			return esq;
		}

		if(e == 2){
			Esqueleto esq = new EsqReforzado();
			return esq;
		}else{
			return null;
		}
	}

	public static Aislamiento asilamientoPedido(int a){
		switch(a){
			case 1:
				Aislamiento a1 = new AisConcreto();
				return a1;
			case 2:
				Aislamiento a2 = new AisVidrio();
				return a2;
			case 3:
				Aislamiento a3 = new AisMadera();
				return a3;
			case 4:
				Aislamiento a4 = new AisReforzado();
				return a4;
			default:
				return null;
		}
	}

	public static void estadoPedido(Robot robot, int opcion){
		switch(opcion){
			case 1:
				robot.activarRobot();
			case 2:
				robot.ponerAcaminar();
			case 3:
				robot.darOrden();
			case 4:
				robot.ponerAabastecer();
			case 5:
				System.out.println("Espere un momento...");
			case 6:
				robot.suspendeRobot();
			default:
				robot.suspendeRobot();
		}	
	}

	public static void main(String[] args) {
		Robot eva01 = new Robot();
		Scanner entrada = new Scanner(System.in);
		eva01.imprimeMenu();
		int opcionAccion = entrada.nextInt();
		
		do{	

			if(opcionAccion == 5 || eva01.estadoTrabajando() == true){
				System.out.println("Ingresa un numero para el esqueleto:  \n" +
									"(1) Esqueleto de concreto. \n" +
									"(2) Esqueleto reforzado.");
				int opcionEsqueleto = entrada.nextInt();
				Esqueleto e = esqueletoPedido(opcionEsqueleto);

				System.out.println("Ingresa un numero para el aislamiento: \n"+
									"(1) Aislamiento de concreto \n"+
									"(2) Aislamiento de vidrio \n"+
									"(3) Aislamiento de madera \n"+
									"(4) Aislamiento reforzado.");
				int opcionAislamiento = entrada.nextInt();
				Aislamiento a = asilamientoPedido(opcionAislamiento);

				Casa casa = new Casa(e,a);
				eva01.setCasa(casa);

				eva01.ponerAtrabajar(casa);
			}else{
				estadoPedido(eva01, opcionAccion);
			}

		}while(opcionAccion > 0 || opcionAccion < 7);

	}
}