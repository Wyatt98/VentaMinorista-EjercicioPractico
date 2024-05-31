package com.ventaminorista.producto;

import com.ventaminorista.anotaciones.Verificar;
import com.ventaminorista.enums.CategoriaProducto;
import com.ventaminorista.enums.EstadoPedido;
import com.ventaminorista.registro.Cliente;

public abstract class Producto {
	
	public String nombre;
	public float precio;
	public String categoria;
	CategoriaProducto categoriaDelProducto;
	EstadoPedido estadoDelPedido;
	Cliente cliente;
	
	public Producto(Cliente cliente, String nombre, float precio, String categoria, CategoriaProducto categoriaDelProducto, EstadoPedido estadoDelPedido) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.categoriaDelProducto = categoriaDelProducto;
		this.estadoDelPedido = estadoDelPedido;
		this.cliente = cliente;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public CategoriaProducto getCategoriaDelProducto() {
		return categoriaDelProducto;
	}

	public EstadoPedido getEstadoDelPedido() {
		return estadoDelPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void rangoPrecio() {
		
	}
	
	public abstract void mostrarDetalles();
	
	@Verificar("Revisión de producto")
	public void verificarPorducto() {
		System.out.println("Revisando el producto " + nombre);
	}

}
