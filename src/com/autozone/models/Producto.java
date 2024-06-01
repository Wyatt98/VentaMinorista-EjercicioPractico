package com.autozone.models;

import com.autozone.anotaciones.Verificar;
import com.autozone.enums.CategoriaProducto;
import com.autozone.enums.EstadoPedido;
import com.autozone.registros.Cliente;

public abstract class Producto {
	
	private String nombre;
	private float precio;
	private CategoriaProducto categoriaProducto;
	private EstadoPedido estadoPedido;
	private Cliente cliente;
	

	public Producto(String nombre, float precio, CategoriaProducto categoriaProducto, EstadoPedido estadoPedido, Cliente cliente) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoriaProducto = categoriaProducto;
		this.estadoPedido = estadoPedido;
		this.cliente = cliente;
	}
	
	public CategoriaProducto getCategoriaProducto() {
		return categoriaProducto;
	}

	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public String getNombre() {
		return nombre;
	}


	public float getPrecio() {
		return precio;
	}

	public abstract void mostrarDetalles();
	
	@Verificar("Verificacion de seguridad/calidad")
	public void verificarProducto() {
		
	}
	
}
