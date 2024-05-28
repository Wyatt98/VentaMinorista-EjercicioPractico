package com.proyecto.principal;

import com.proyecto.registros.Cliente;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Omar", "Direccion Conocida 123", "417-985-8987");
		
		System.out.println(cliente1.nombre()+"\t"+ cliente1.direccion()+"\t"+cliente1.telefono());

	}

}
