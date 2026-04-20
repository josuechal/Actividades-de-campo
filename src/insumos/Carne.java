package insumos;
import productos.Producto;

public class Carne extends Producto {
    private String fechaCaducidad;

    public Carne(String nombre, double precio, int stock, String fechaCaducidad) {
        super(nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caduca: " + fechaCaducidad);
    }
}
