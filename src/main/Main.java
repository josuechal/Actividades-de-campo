package main;
import insumos.*;
import productos.Producto;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Bebida("Coca Cola", 3.5, 20, 1.5);
        Producto p2 = new Carne("Pollo", 10.0, 15, "25/04/2026");
        Producto p3 = new Galleta("Rellenita",0.50, 24, "Chocolate");

        p1.mostrarInfo();
        System.out.println("-----------");
        p2.mostrarInfo();
        System.out.println("-----------");
        p3.mostrarInfo();
    }
}