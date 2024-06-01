package com.proyecto.models;

import java.util.ArrayList;
import java.util.List;

import com.proyecto.enums.CategoriaProducto;

public class Inventario {

	private List<Producto> productos = new ArrayList<Producto>();
	private static int totalProductos = 0;

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		totalProductos++;
	}

	public void mostrarTodosLosProductos() {
		for (Producto producto : productos) {

			producto.mostrarDetalleProducto();

		}
	}

	public void mostrarProductosPorCategoria(CategoriaProducto categoria) {

		for (Producto producto : productos) {
			if (producto.getCategoria() == categoria) {

				producto.mostrarDetalleProducto();

			}
		}

	}

	public void mostrarProductosPorRango(double precioMinimo, double precioMaximo) {

		for (Producto producto : productos) {

			if (producto.getPrecio() > precioMinimo && producto.getPrecio() < precioMaximo) {
				producto.mostrarDetalleProducto();
			}

		}

	}

	public static int getTotalProductos() {
		return totalProductos;
	}

	public List<Producto> getProductos() {
		return productos;
	}

}
