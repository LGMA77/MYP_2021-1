 public class Atendiendo implements Estado{

  Robot robot;

  public Atendiendo(Robot robot){
    this.robot = robot;
  }

  public void suspender(){
      System.out.println("No me puedo suspender,\n");
  }

  public void caminar(){
      System.out.println("No puedo caminar sin tener una orden.\n");
  }

  public void atender(){
      if(robot.getEstadoAnterior() instanceof Suspendido){
          robot.printMenu();
          robot.setEstadoAnterior(robot.getAtendiendo());
          robot.setEstadoActual(robot.getCaminando());
          return;
      }else if(robot.getEstadoAnterior() instanceof Caminando){
          robot.entregarComida();
          robot.setEstadoActual(robot.getSuspendido());
          return;
      }else{
          System.out.println("No te puedo atender en este momento");
      }
  }

  public void cocinar(){
      System.out.println("No puedo cocinar.\n");
  }
}
