public class FabricaMotor extends AbstractFactory{
	
	public Object getComponente(String componente){
		return getMotor(componente);
	}

	public Motor getMotor(String motor){
		if(motor.equalsIgnoreCase("deportivo")){
			return new MotorDeportivo();
		}else if(motor.equalsIgnoreCase("diesel")){
			return new MotorDiesel();
		}else if(motor.equalsIgnoreCase("turbo")){
			return new MotorTurbo();
		}else{
			return null;
		}
	}
}