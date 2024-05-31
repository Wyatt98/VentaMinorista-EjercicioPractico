package com.ventaminorista.principal;

import com.ventaminorista.anotaciones.Verificar;
import com.ventaminorista.enums.*;
import com.ventaminorista.producto.*;
import com.ventaminorista.registro.Cliente;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean busqueda = true;
		Cliente cliente1 = new Cliente("Juan Pérez", "Calle ficticia 123", "55-1122-3344");
		Cliente cliente2 = new Cliente("Ana Gómez", "Calle ficticia 321", "55-4433-1122");

		Electronica electronico = new Electronica(cliente1, "Audifonos Sonic", 540.99f, "Electronico", CategoriaProducto.ACCESORIOS, EstadoPedido.ORDEN_PREPARACION);
		Ropa ropa = new Ropa(cliente2, "Sueter", 160.00f, "Ropa", CategoriaProducto.MUJER, EstadoPedido.ORDEN_PREPARACION);
		Alimentos alimento = new Alimentos(cliente1, "Manzanas", 100.00f, "Alimento", CategoriaProducto.FRUTAS, EstadoPedido.ORDEN_PREPARACION);
		
		
		Inventario inventario = new Inventario();
		inventario.agregarProducto(electronico);
		inventario.agregarProducto(ropa);;
		inventario.agregarProducto(alimento);
		
		/*System.out.println("Mostrando todos los vehiculos");
		inventario.mostrarTodosLosVehiculos();
		
		System.out.print("\n\n");
		
		System.out.println("Mostrando todos los vehiculos del año 2019");
		inventario.mostrarPorRangoDePrecio(100f, 600f);
		
		System.out.print("\n\n");
		
		System.out.println("Mostrando todos los vehiculos de gasolina");
		inventario.mostrarVehiculosPorCategoria(CategoriaProducto.ACCESORIOS);
		
		System.out.print("\n\n");
		System.out.println("Total de vehiculos en la agencia: " + inventario.getTotalProductos());*/
		
			System.out.println("Tipo de busqueda:");
			System.out.println(" 1. Categoria \n 2. Precio \n 3. Mostrar todos productos");
			Scanner Input = new Scanner (System.in);
			String nombre = Input.next();
			
			switch (nombre) {
			case "1":
				System.out.println("que categoria?");
				String categoria = Input.next();
				for (CategoriaProducto categoriaproducto : CategoriaProducto.values()) {
					if (categoria.equalsIgnoreCase(categoriaproducto.name())) {
						inventario.mostrarVehiculosPorCategoria(categoriaproducto);
					}
					
				}
				break;
			case "2":
				System.out.println("valor minimo?");
				String precioMin = Input.next();
				System.out.println("valor maximo?");
				String precioMax = Input.next();
				inventario.mostrarPorRangoDePrecio(Float.valueOf(precioMin), Float.valueOf(precioMax));
				break;
			case "3":
				inventario.mostrarTodosLosVehiculos();
				break;
			default:
				System.out.println("opcion no valida");
				break;
				}
		
		
		/*
		 * Procesar anotaciones
		 * */
		for(var metodo : Producto.class.getDeclaredMethods()) {
			if(metodo.isAnnotationPresent(Verificar.class)) {
				Verificar verificar = metodo.getAnnotation(Verificar.class);
				//System.out.println("Método: " + metodo.getName() + ", Anotación: " + verificar.value());
			}
		}

	}

}
