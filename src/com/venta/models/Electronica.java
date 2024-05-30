package com.venta.models;

import com.venta.enums.CategoriaProducto;

public class Electronica extends Producto {

	public Electronica(String nombre, float precio) {
		super(nombre, precio, CategoriaProducto.ELECTRODOMESTICOS);
		// TODO Auto-generated constructor stub
	}

}
