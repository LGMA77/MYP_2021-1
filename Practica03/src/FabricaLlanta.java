public class FabricaLlanta extends AbstractFactory{
	
	public Object getComponente(String componente){
		return getLlanta(componente);
	}

	public Llanta getLlanta(String llanta){
		if(llanta.equalsIgnoreCase("deportiva")){
			return new LlantaDeportiva();
		}else if(llanta.equalsIgnoreCase("off road")){
			return new LlantaOffRoad();
		}else if(llanta.equalsIgnoreCase("oruga tanque")){
			return new LlantaOrugaTanque();
		}else if(llanta.equalsIgnoreCase("simple")){
			return new LlantaSimple();
		}else{
			return null;
		}
	}
}