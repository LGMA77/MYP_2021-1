public class FabricaBlindaje extends AbstractFactory{
	
	public Object getComponente(String componente){
		return getBlindaje(componente);
	}

	public Blindaje getBlindaje(String blindaje){
		if(blindaje.equalsIgnoreCase("reforzado")){
			return new BlindajeReforzado();
		}else if(blindaje.equalsIgnoreCase("simple")){
			return new BlindajeSimple();
		}else if(blindaje.equalsIgnoreCase("Tanque")){
			return new BlindajeTanque();
		}else{
			return null;
		}
	}
}