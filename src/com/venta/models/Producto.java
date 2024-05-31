package com.venta.models;

import java.text.NumberFormat;

import com.venta.enums.CategoriaProducto;

public abstract class Producto {
	
	private String nombre;
	private double precio;
	private CategoriaProducto categoria;
	
	public Producto(String nombre, double precio, CategoriaProducto categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public void mostrarProducto() {
		// Darle al precio formato de moneda
		NumberFormat cFormatter = NumberFormat.getCurrencyInstance();
		StringBuilder detalles = new StringBuilder();
		
		detalles.append("Producto: " + nombre + ", Precio: " + cFormatter.format(precio));
		detalles.append("\nCategoría: " + categoria);
		
		System.out.println(detalles.toString() + "\n");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public CategoriaProducto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}


	
	
}
