package com.ventaminorista.producto;

import java.util.ArrayList;
import java.util.List;

import com.ventaminorista.enums.CategoriaProducto;

public class Inventario {
	
	private List<Producto> productos = new ArrayList<Producto>();
	private static int totalProductos = 0;
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		totalProductos++;
	}
	
	public void mostrarTodosLosVehiculos() {
		for(Producto producto : productos) {
			producto.mostrarDetalles();
		}
	}
	
	public void mostrarPorRangoDePrecio (float precioMin, float precioMax) {
		for (Producto producto : productos) {
			if(producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
				producto.mostrarDetalles();
			}
		}
	}
	
	public void mostrarVehiculosPorCategoria(CategoriaProducto categoriaDelProducto) {
		for (Producto producto : productos) {
			if(producto.getCategoriaDelProducto() == categoriaDelProducto) {
				producto.mostrarDetalles();
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
