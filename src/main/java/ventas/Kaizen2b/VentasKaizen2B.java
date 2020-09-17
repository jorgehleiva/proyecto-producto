
package ventas.Kaizen2b;

import ventas.Orden;
import ventas.Producto;


public class VentasKaizen2B {
     public static void main(String[] args) {
        Producto producto1 = new Producto("Laneige Lipstick", 50.00);
        Producto producto2 = new Producto("Eyeshadow 120 Color", 100.00);
        Producto producto3= new Producto("Eyeshadow Palette Cosmetic",30.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
    }
}
    

