package com.autozone.models;

import com.autozone.enums.CategoriaProducto;
import com.autozone.enums.EstadoPedido;
import com.autozone.registros.Cliente;

public class Ropa extends Producto{

	public Ropa(String nombre, float precio, CategoriaProducto categoriaProducto, EstadoPedido estadoPedido, Cliente cliente) {
		super(nombre, precio, categoriaProducto, estadoPedido, cliente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void mostrarDetalles() {
		StringBuilder detalles = new StringBuilder();
		detalles.append("Nombre del producto: "+ getNombre() + "\n" + "Precio" + getPrecio() + " \n");
		detalles.append("Categoria: " + getCategoriaProducto());
	}

}
