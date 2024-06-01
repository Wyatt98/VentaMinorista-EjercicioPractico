package clases;

import java.util.ArrayList;
import java.util.List;

import enums.CategoriaProducto;

class Inventario {
    private List<Producto> productos;
    private static int totalProductos = 0;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        totalProductos++;
    }

    public void mostrarTodosLosProductos() {
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }

    public void mostrarProductosPorCategoria(CategoriaProducto categoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                producto.mostrarDetalles();
            }
        }
    }

    public void mostrarProductosPorRangoDePrecio(double min, double max) {
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                producto.mostrarDetalles();
            }
        }
    }

    public static int getTotalProductos() {
        return totalProductos;
    }
}