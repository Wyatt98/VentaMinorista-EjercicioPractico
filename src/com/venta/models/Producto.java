package com.venta.models;

import com.venta.enums.CategoriaProducto;

public abstract class Producto {
	
	private String nombre;
	private float precio;
	private CategoriaProducto categoria;
	
	public Producto(String nombre, float precio, CategoriaProducto categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.setCategoria(categoria);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
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
