package clases;

import enums.CategoriaProducto;

class Alimentos extends Producto {
    public Alimentos(String nombre, double precio) {
        super(nombre, precio, CategoriaProducto.ALIMENTOS);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Alimentos: " + getNombre() + " - Precio: " + getPrecio());
    }
}