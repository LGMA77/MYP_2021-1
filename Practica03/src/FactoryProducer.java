public class FactoryProducer{
	
	public AbstractFactory getFactory(String fabrica){
		if(fabrica.equalsIgnoreCase("llantas")){
			return new FabricaLlanta();
		}else if(fabrica.equalsIgnoreCase("motor")){
			return new FabricaMotor();
		}else if(fabrica.equalsIgnoreCase("carroceria")){
			return new FabricaCarroceria();
		}else if(fabrica.equalsIgnoreCase("blindaje")){
			return new FabricaBlindaje();
		}else if(fabrica.equalsIgnoreCase("armas")){
			return new FabricaArmas();
		}else{
			return null;
		}
	}
}