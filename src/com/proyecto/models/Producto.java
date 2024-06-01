package com.proyecto.models;

import com.proyecto.anotaciones.Revisar;
import com.proyecto.enums.CategoriaProducto;

public abstract class Producto {

	private String nombre;
	private double precio; 
	private CategoriaProducto categoria;
	private String marca;
	
	public Producto(String nombre, double precio, CategoriaProducto categoria, String marca) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.marca = marca;
		
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

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public CategoriaProducto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProducto categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public abstract void mostrarDetalleProducto();

	@Revisar("Revision de seguridad")
	public void revisarProducto() {
		System.out.println("Revisando el producto "+nombre+" "+marca);
	}
}
