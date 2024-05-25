package com.ventaminorista.producto;

import com.ventaminorista.enums.CategoriaProducto;
import com.ventaminorista.enums.EstadoPedido;

public abstract class Producto {
	
	public String nombre;
	public float precio;
	public Producto categoria;
	CategoriaProducto categoriaDelProduto;
	EstadoPedido estadoDelPedido;
	
	public Producto(String nombre, float precio, Producto categoria, CategoriaProducto categoriaDelProduto, EstadoPedido estadoDelPedido) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.categoriaDelProduto = categoriaDelProduto;
		this.estadoDelPedido = estadoDelPedido;
		
	}
	
	

}
