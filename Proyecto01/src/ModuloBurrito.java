public class ModuloBurrito implements Modulo{

 String ingrediente;
 String metodococcion;
 Boolean vegetariano;
 Robot robot;

 public ModuloBurrito(){
  ingrediente = "";
  metodococcion = "";
  vegetariano = false;
 }

 public ModuloBurrito(Robot robot){
  this.robot = robot;
 }

public void cocinar(){
 colocarTortilla();
 colocarFrijol();
 colocarIngrediente();
}

public void colocarTortilla(){
 System.out.println("Estoy colocando una tortilla.");
}
public void colocarFrijol(){
 System.out.println("Estoy colocando frijoles.");
 }

 public void colocarIngrediente(){
  System.out.println("Estoy colocando " + ingrediente + ".");
 }
}
