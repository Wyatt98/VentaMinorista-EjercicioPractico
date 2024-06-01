package com.proyecto.models;

import com.proyecto.enums.CategoriaProducto;

public class Alimentos extends Producto {
	
	private double peso;

	public Alimentos(String nombre, double precio, CategoriaProducto categoria, String marca, double peso) {
		super(nombre, precio, categoria, marca);
		this.peso = peso;
		// TODO Auto-generated constructor stub
	}
	
	public double getPeso() {
		return peso;
	}

	@Override
	public void mostrarDetalleProducto() {
		String detalleProducto = "Nombre: "+getNombre()+"||Precio: $"+getPrecio()+"||Categoria: "+getCategoria()+"||Marca: "+getMarca()+"||Peso (Kg): "+getPeso();
		System.out.println(detalleProducto);
		
	}

}
