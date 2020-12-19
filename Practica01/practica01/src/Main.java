public class Main{
	public static void main(String[] args) {

		Cliente alicia = new Cliente("Alicia", 500);
		Cliente bob = new Cliente("Bob", 70);
		Cliente cesar = new Cliente("Cesar", 40);
		Cliente diego = new Cliente("Diego", 200);
		Cliente erika = new Cliente("Erika", 220);

		Netflis netflis = new Netflis();
		Hammazon hammazon = new Hammazon();
		Spootify spootify = new Spootify();
		Twitsh twitsh = new Twitsh();
		YuTube yutube = new YuTube();

		System.out.println("________________________________Iniciando main________________________________");

		for(int i = 0; i < 5; i++){
			do{
				System.out.println("Dia uno: ");
				netflis.netflisCuatro(alicia);
				hammazon.hammazonPremium(alicia);
				spootify.spootifyPremium(alicia);
				twitsh.twitshPremium(alicia);
			}while(i < 1);

			do{
				System.out.println("Dia dos: ");

			}while(i < 2  && i > 1);

			do{
				System.out.println("Dia tres: ");

			}while(i < 3);

			do{
				System.out.println("Dia cuatro: ");

			}while(i < 5);

			do{
				System.out.println("Dia cinco: ");

			}while(i < 4);

		}

		System.out.println("________________________________Finalizando main______________________________");
	}
}