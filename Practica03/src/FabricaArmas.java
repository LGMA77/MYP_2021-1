public class FabricaArmas extends AbstractFactory{
	
	public Object getComponente(String componente){
		return getArma(componente);
	}

	public Armas getArma(String arma){
		if(arma.equalsIgnoreCase("arpones")){
			return new Arpones();
		}else if(arma.equalsIgnoreCase("lanzallamas")){
			return new Lanzallamas();
		}else if(arma.equalsIgnoreCase("caniones")){
			return new Caniones();
		}else if(arma.equalsIgnoreCase("sierra")){
			return new Sierra();
		}else if(arma.equalsIgnoreCase("metralleta")){
			return new Metralleta();
		}else{
			return null;
		}
	}
}