package com.proyecto.models;

import com.proyecto.enums.CategoriaProducto;

public class Ropa extends Producto{

	
	private char talla;
	private String color;
	public Ropa(String nombre, double precio, CategoriaProducto categoria, String marca, char talla, String color) {
		super(nombre, precio, categoria, marca);
		this.talla = talla;
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public String getColor() {
		return color;
	}
	
	public char getTalla() {
		return talla;
	}

	@Override
	public void mostrarDetalleProducto() {
		
		StringBuilder detalleProducto = new StringBuilder();
		detalleProducto.append("Nombre: "+getNombre()+"||Precio: $"+getPrecio()+"||Categoria: "+getCategoria());
		detalleProducto.append("||Marca: "+getMarca()+"||Talla (CH,M,G): "+getTalla()+"||Color: "+getColor());
		System.out.println(detalleProducto.toString());
		
	}

}
