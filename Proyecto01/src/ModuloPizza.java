 public class ModuloPizza implements Modulo {

 String ingrediente;
 String metodococcion;
 Boolean vegetariana;
 Robot robot;

 public ModuloPizza(){

 }

 public ModuloPizza(Robot robot){
  this.robot = robot;
 }

 public void cocinar() {
  colocarMasa();
  colocarSalsaJitomate();
  colocarQueso();
  colocarIngredientes();
  hornear();
  sacarHorno();
 }

 public void colocarMasa() {
  System.out.println("Estoy amasando la masa.");
 }

 public void colocarSalsaJitomate() {
  System.out.println("Estoy colocando salsa de tomate.");
 }

 public void colocarQueso() {
  System.out.println("Estoy colocando queso mozarella.");
 }

 public void colocarIngredientes() {
  System.out.println("Estoy colocando " + ingrediente + ".");
 }

 public void hornear(){
  System.out.println("Estoy metiendo la pizza al horno.");
 }
 public void sacarHorno(){
  System.out.println("Estoy sacando la pizza del horno.");
 }
}