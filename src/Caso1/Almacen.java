package Caso1;

public class Almacen {
	 private int numProductos; // Aqui se declara las variables del almacen
     public Almacen(int nProductos){
             this.numProductos=nProductos;//Aqui la para ver las cantidades
     }
     public boolean cogerProducto(){//se crea un un metodo para coger los productos
             if (this.numProductos>0){
                     this.numProductos--;//aqui dice que estar en esta variable
                     return true;
             }
             return false;
     }
}
