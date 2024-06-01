package com.autozone.models;

import java.util.ArrayList;
import java.util.List;

import com.autozone.enums.CategoriaProducto;

public class Inventario {
		
	private List<Producto> productos = new ArrayList<Producto>();
	private static int totalProductos = 0;
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		totalProductos++;
	}
	
	public void mostrarTodosLosProductos() {
		for (Producto producto : productos) {
			producto.mostrarDetalles();
		}
	}
	
	public void mostrarProductosPorCategoria(CategoriaProducto categoriaProducto) {
		for (Producto producto : productos) {
			if (producto.getCategoriaProducto() == categoriaProducto) {
				System.out.println(producto.getCategoriaProducto() + " " + producto.getNombre());
			}
		}
	}
	
	public void mostrasProductosPorRangoDePrecio(int min, int max) {
		for (Producto producto : productos) {
			if (producto.getPrecio() > min && producto.getPrecio() < max) {
				producto.mostrarDetalles();
			}
		}
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public static int getTotalProductos() {
		return totalProductos;
	}
	
}
