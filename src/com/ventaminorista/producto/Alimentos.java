package com.ventaminorista.producto;

import com.ventaminorista.enums.CategoriaProducto;
import com.ventaminorista.enums.EstadoPedido;
import com.ventaminorista.registro.Cliente;

public class Alimentos extends Producto{

	public Alimentos(Cliente cliente, String nombre, float precio, String categoria,
			CategoriaProducto categoriaDelProducto, EstadoPedido estadoDelPedido) {
		super(cliente, nombre, precio, categoria, categoriaDelProducto, estadoDelPedido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDetalles() {
		StringBuilder detalles = new StringBuilder();
		detalles.append("Producto: " + getNombre() + " " + getCategoria() + "(" + getPrecio() + "), ");
		detalles.append(getCategoriaDelProducto() + ", Estatus del procucto: " + getEstadoDelPedido() + ", Cliente: ");
		detalles.append(getNombre());
		
		System.out.println(detalles.toString());
		
	}

}
