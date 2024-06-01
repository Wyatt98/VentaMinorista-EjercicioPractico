package com.proyecto.models;

import com.proyecto.enums.CategoriaProducto;

public class Electronica extends Producto {

	private String modelo;
	private String codigoDeBarras;
	
	public Electronica(String codigoDeBarras,String nombre, double precio, CategoriaProducto categoria, String marca, String modelo) {
		super(nombre, precio, categoria, marca);
		this.modelo = modelo;
		this.codigoDeBarras = codigoDeBarras;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	
	public String getModelo() {
		return modelo;
	}

	@Override
	public void mostrarDetalleProducto() {
		StringBuilder detalleProducto = new StringBuilder();
		detalleProducto.append("Nombre: "+getNombre()+"||Precio: $"+getPrecio()+"||Categoria: "+getCategoria());
		detalleProducto.append("||Marca: "+getMarca()+"||Modelo: "+getModelo());
		System.out.println(detalleProducto.toString());
		
	}

}
