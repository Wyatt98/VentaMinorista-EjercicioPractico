package clases;

import enums.CategoriaProducto;

abstract class Producto {
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;

    public Producto(String nombre, double precio, CategoriaProducto categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public abstract void mostrarDetalles();
}

