public class ModuloHamburguesa implements Modulo{

 String metodoCoccion;
 String ingrediente;
 Boolean vegetariano;
 Robot robot;

 public ModuloHamburguesa(){

 }

 public ModuloHamburguesa(Robot robot){
  this.robot = robot;
 }

public void cocinar(){
 cocer();
 colocarBasePan();
 colocarCarne();
 colocarQueso();
 colocarLechuga();
 colocarMayonesa();
 colocarTapa();
 if (vegetariano){
  System.out.println("Te recordamos que este platillo es vegetariano.");
 } else {
  System.out.println("Te recordamos que este platillo no es vegetariano.");
 }
}

public void set(MenuItem menuitems){

}

public void cocer(){
 System.out.println("Estoy cociendo " + ingrediente + " en " + metodoCoccion + ".");
}

public void colocarCarne(){
 System.out.println("Estoy colocando " + ingrediente + ".");
}

public void colocarBasePan(){
 System.out.println("Estoy colocando la base del pan.");
}

public void colocarLechuga(){
 System.out.println("Estoy colocando la lechuga.");
}

public void colocarMayonesa(){
 System.out.println("Estoy untando mayonesa.");
}

public void colocarQueso(){
 System.out.println("Estoy colocando una rebanada de queso.");
}

public void colocarTapa(){
 System.out.println("Estoy colocando la tapa del pan.");
 } 
}
