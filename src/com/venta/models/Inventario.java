package com.venta.models;

import java.util.ArrayList;
import java.util.List;

import com.venta.enums.CategoriaProducto;

public class Inventario {
	
	private List<Producto> listaProductos = new ArrayList<Producto>();
	private static int totalProductos = 0;

	public Inventario() {
		// TODO Auto-generated constructor stub
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void addProducto(Producto p) {
		listaProductos.add(p);
		totalProductos++;
	}
	
	public void mostrarTodosLosProductos() {
		for (Producto producto : listaProductos) {
			producto.mostrarProducto();
		}
	}
	
	public void productosPorCategoria(CategoriaProducto categoria) {
		for (Producto producto : listaProductos) {
			if (producto.getCategoria() == categoria)
				producto.mostrarProducto();
		}
	}
	
	public void productosPorRango(double inferior, double superior) {
		for (Producto producto : listaProductos) {
			if ((producto.getPrecio() <= superior) && (producto.getPrecio() >= inferior) )
				producto.mostrarProducto();
		}
	}

	public static int getTotalProductos() {
		return totalProductos;
	}
	
	
}
