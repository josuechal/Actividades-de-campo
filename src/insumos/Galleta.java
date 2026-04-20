package insumos;
import productos.Producto;

public class Galleta extends Producto {
    private String sabor;

    public Galleta(String nombre, double precio, int stock, String sabor) {
        super(nombre, precio, stock);
        this.sabor = sabor;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Sabor: " + sabor);
    }
}