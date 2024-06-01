package clases;

import enums.CategoriaProducto;

class Electronica extends Producto {
    public Electronica(String nombre, double precio) {
        super(nombre, precio, CategoriaProducto.ELECTRONICA);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónica: " + getNombre() + " - Precio: " + getPrecio());
    }
}