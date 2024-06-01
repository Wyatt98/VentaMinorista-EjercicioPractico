package clases;

import enums.CategoriaProducto;

class Ropa extends Producto {
    public Ropa(String nombre, double precio) {
        super(nombre, precio, CategoriaProducto.ROPA);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + getNombre() + " - Precio: " + getPrecio());
    }
}