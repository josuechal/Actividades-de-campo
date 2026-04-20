package insumos;
import productos.Producto;

public class Bebida extends Producto {

    private double litros;

    public Bebida(String nombre, double precio, int stock, double litros) {
        super(nombre, precio, stock);
        this.litros = litros;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Litros: " + litros);
    }
}