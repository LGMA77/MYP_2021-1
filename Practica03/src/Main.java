import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		FactoryProducer productor = new FactoryProducer();

		AbstractFactory fabricaLlantas = productor.getFactory("llantas");
		AbstractFactory fabricaMotores = productor.getFactory("motor");
		AbstractFactory fabricaCarroceria = productor.getFactory("carroceria");
		AbstractFactory fabricaBlindaje = productor.getFactory("blindaje");
		AbstractFactory fabricaArmas = productor.getFactory("armas");

		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenido a la constructora de carros tipo MadMax. \n");
		System.out.println("Puede armar un auto de acuerdo con las opciones de componentes que ofrecemos.");
		System.out.println("En caso de no elegir uno en especial le ofrecemos tres opciones ya fabricadas. \n");

		
		System.out.println("Selecciona 1 si quieres tomar un auto prediseñado.\n "+
							"Selecciona 2 si quieres diseñar tu auto. \n ");

		int opcion = scan.nextInt();

		if(opcion == 1){
			System.out.println( "----------------------- Autos prediseniados ----------------------- \n"+
								"1) Simple (Llantas simples, Motor diesel, Carroceria casual, Blindaje Simple, Arpones) \n" +
								"2) Deportivo (Llantas deportivas, Motor deportivo, Carroceria deportiva, Blindaje simple, Lanzallamas) \n" +
								"3) Pesado (Llantas Oruga de Tanque, Motor diesel, Carroceria camion, Blindaje tanque, Caniones) \n");
			System.out.println("Ingresa la opcion que prefieres: ");
			int opcionAuto = scan.nextInt();
			System.out.println("\n");
			if(opcionAuto == 1){

				Llanta llantas1 = (Llanta) fabricaLlantas.getComponente("simple");
				Motor motor1 = (Motor) fabricaMotores.getComponente("diesel");
				Carroceria carroceria1 = (Carroceria) fabricaCarroceria.getComponente("casual");
				Blindaje blindaje1 = (Blindaje) fabricaBlindaje.getComponente("simple");
				Armas arpon = (Armas) fabricaArmas.getComponente("arpones");

				Auto simple = new Auto(llantas1, motor1, carroceria1, blindaje1, arpon);
				simple.imprimeDatos();

			}else if(opcionAuto == 2){

				Llanta llantas2 = (Llanta) fabricaLlantas.getComponente("deportiva");
				Motor motor2 = (Motor) fabricaMotores.getComponente("deportivo");
				Carroceria carroceria2 = (Carroceria) fabricaCarroceria.getComponente("deportiva");
				Blindaje blindaje2 = (Blindaje) fabricaBlindaje.getComponente("simple");
				Armas lanzallamas = (Armas) fabricaArmas.getComponente("lanzallamas");

				Auto deportivo = new Auto(llantas2, motor2, carroceria2, blindaje2, lanzallamas);
				deportivo.imprimeDatos();

			}else if(opcionAuto == 3){

				Llanta llantas3 = (Llanta) fabricaLlantas.getComponente("oruga tanque");
				Motor motor3 = (Motor) fabricaMotores.getComponente("diesel");
				Carroceria carroceria3 = (Carroceria) fabricaCarroceria.getComponente("camion");
				Blindaje blindaje3 = (Blindaje) fabricaBlindaje.getComponente("tanque");
				Armas caniones = (Armas) fabricaArmas.getComponente("caniones");

				Auto pesado = new Auto(llantas3, motor3, carroceria3, blindaje3, caniones);
				pesado.imprimeDatos();
			}

			else{
				System.out.println("No es un parametro valido.");
			}

		}else if(opcion == 2){


			System.out.println( "---------------------------- Llantas ---------------------------- \n" +
								"Simple       ----- Atq = 300 , Df = 200 , Vel = 500 , Costo = 300 \n"+
								"Deportiva    ----- Atq = 500 , Df = 400 , Vel = 1000 , Costo = 750 \n"+
								"Off Road     ----- Atq = 500 , Df = 600 , Vel = 700 , Costo = 500 \n"+
								"Oruga Tanque ----- Atq = 700 , Df = 1000 , Vel = 500 , Costo = 1000 \n");

			System.out.println( "---------------------------- Motores ---------------------------- \n" +
								"Diesel       ----- Atq = 300 , Df = 200 , Vel = 500 , Costo = 300 \n"+
								"Deportivo    ----- Atq = 500 , Df = 400 , Vel = 1000 , Costo = 750 \n"+
								"Turbo        ----- Atq = 500 , Df = 600 , Vel = 700 , Costo = 500 \n");

			System.out.println( "--------------------------- Carroceria -------------------------- \n" +
								"Casual       ----- Atq = 200 , Df = 400 , Vel = 300 , Costo = 200 \n"+
								"Camion       ----- Atq = 400 , Df = 600 , Vel = 300 , Costo = 300 \n"+
								"Deportiva    ----- Atq = 250 , Df = 400 , Vel = 500 , Costo = 300 \n");


			System.out.println( "---------------------------- Blindaje ---------------------------- \n" +
								"Simple       ----- Atq = 200 , Df = 600 , Vel = 400 , Costo = 200 \n"+
								"Reforzado    ----- Atq = 500 , Df = 1000 , Vel = 750 , Costo = 500 \n"+
								"Tanque       ----- Atq = 700 , Df = 1500 , Vel = 600 , Costo = 1500 \n");

			System.out.println( "------------------------------ Armas ----------------------------- \n" +
								"Arpones      ----- Atq = 1000 , Df = 200 , Vel = 750 , Costo = 200 \n"+
								"Caniones     ----- Atq = 2000 , Df = 600 , Vel = 500 , Costo = 1000 \n"+
								"Lanzallamas  ----- Atq = 1750 , Df = 400 , Vel = 900 , Costo = 750 \n"+
								"Metralleta   ----- Atq = 2500 , Df = 700 , Vel = 1500 , Costo = 2000 \n");

			
			System.out.println("Selecciona un juego de llantas: ");
			String aaaaaaaaa = scan.nextLine();
			String opcionLlantas = scan.nextLine();

			System.out.println("Selecciona un motor: ");
			String opcionMotor = scan.nextLine();

			System.out.println("Selecciona una carroceria: ");
			String opcionCarroceria = scan.nextLine();

			System.out.println("Selecciona un blindaje: ");
			String opcionBlindaje = scan.nextLine();

			System.out.println("Selecciona un arma: ");
			String opcionArma = scan.nextLine();
			System.out.println("\n");

			Llanta llantas4 = (Llanta) fabricaLlantas.getComponente(opcionLlantas);
			Motor motor4 = (Motor) fabricaMotores.getComponente(opcionMotor);
			Carroceria carroceria4 = (Carroceria) fabricaCarroceria.getComponente(opcionCarroceria);
			Blindaje blindaje4 = (Blindaje) fabricaBlindaje.getComponente(opcionBlindaje);
			Armas arma = (Armas) fabricaArmas.getComponente(opcionArma);

			Auto creado = new Auto(llantas4, motor4, carroceria4, blindaje4, arma);
			creado.imprimeDatos();

		}else{
			System.out.println("No es un parametro valido.");
		}

	}
}