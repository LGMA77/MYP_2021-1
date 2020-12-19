public class FabricaCarroceria extends AbstractFactory{
	
	public Object getComponente(String componente){
		return getCarroceria(componente);
	}

	public Carroceria getCarroceria(String carroceria){
		if(carroceria.equalsIgnoreCase("camion")){
			return new CarroceriaCamion();
		}else if(carroceria.equalsIgnoreCase("casual")){
			return new CarroceriaCasual();
		}else if(carroceria.equalsIgnoreCase("deportiva")){
			return new CarroceriaDeportiva();
		}else{
			return null;
		}
	}
}