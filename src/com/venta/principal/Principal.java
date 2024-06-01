package com.venta.principal;

import java.util.Scanner;

import com.venta.enums.CategoriaProducto;
import com.venta.models.*;
import com.venta.registros.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inventario inventario = new Inventario();

		Producto camisa1 = new Ropa("Camisa Chida 1", 299.99);
		Producto camisa2 = new Ropa("Camisa Chida 2", 249.99);

		Producto computadora1 = new Electronica("ASUS XD123", 19_999.0);
		Producto computadora2 = new Electronica("DELL A321", 22_999.0);

		Cliente cliente1 = new Cliente("Juan Pérez", "Calle ficticia 123", "55-1122-3344");
		Cliente cliente2 = new Cliente("Ana Gómez", "Calle ficticia 321", "55-4433-1122");

		inventario.addProducto(camisa1);
		inventario.addProducto(camisa2);
		inventario.addProducto(computadora1);
		inventario.addProducto(computadora2);

		System.out.println("Total de productos: " + Inventario.getTotalProductos() + "\n");

		while (true) {
			System.out.println("Seleccione el tipo de búsqueda:\n");
			System.out.println("1. Categoría\n" + "2. Rango de precios\n" + "3. Total de productos\n" + "4. Finalizar");
			System.out.println();

			Scanner input = new Scanner(System.in);
			String eleccion = input.next();

			switch (eleccion) {
			case "1":
				System.out.print("Categoria: ");
				String categoria = input.next();
				System.out.println();
				for (CategoriaProducto categoriaproducto : CategoriaProducto.values()) {
					if (categoria.equalsIgnoreCase(categoriaproducto.name()))
						inventario.productosPorCategoria(categoriaproducto);

				}
				
			case "2":
				double inferior;
				double superior;
				
				System.out.print("Rango inferior: ");
				inferior = Double.parseDouble(input.next());
				
				System.out.print("Rango superior: ");
				superior = Double.parseDouble(input.next());
				
				
			}
			
			System.out.println("---------------------------------------\n");
			
			input.close();
		}

	}

}
