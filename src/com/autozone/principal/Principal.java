package com.autozone.principal;

import java.util.Scanner;

import com.autozone.enums.CategoriaProducto;
import com.autozone.models.Inventario;

public class Principal {

	@SuppressWarnings("resource")
	static Scanner scanner = new Scanner(System.in);
	static Inventario invent = new Inventario();

	public static void main(String[] args) {
		int seleccion = 0;

		System.out.println("Bienvenido al programa de tienda minorista S.A. de C.V.");
		System.out.println("");
		System.out.println("Que desea hacer?");
		System.out.println("1. Buscar en productos");
		System.out.println("2. Agregar un producto");
		System.out.println("3. Salir");
		System.out.println("");
		System.console().readLine();
		switch (seleccion) {
		case 1: {
			busquedasMenu();
		}
		case 2: {
			String nombreNewProducto = null;
			float precioNewProducto;
			int agregProducto = 0;
			System.out.println("Nombre del producto: ");
			scanner.next(nombreNewProducto);
			System.out.println("Precio del producto: ");
			//scanner.nextFloat(precioNewProducto);
			System.out.println("Categorias: ");
			System.out.println("1. Belleza");
			System.out.println("2. Tecnologia");
			System.out.println("3. Cocina");
			System.out.println("");
			scanner.nextInt(agregProducto);
			switch (agregProducto) {
			case 1: {
				invent.agregarProducto(null);
			}
			case 2: {
				invent.mostrarProductosPorCategoria(CategoriaProducto.TECNOLOGIA);
			}
			case 3: {
				invent.mostrarProductosPorCategoria(CategoriaProducto.COCINA);
			}

			default:
				throw new IllegalArgumentException("Opcion no esta entre los valores esperados: ");
			}
		}
		case 3: {
			// System.exit();
			return;
		}

		default:
			throw new IllegalArgumentException("Opcion no esta entre los valores esperados: ");
		}
	}

	public static void busquedasMenu() {
		int busquedasSelect = 0;
		System.out.println("Como desea buscar entre los productos?");
		System.out.println("1. Buscar todos los productos");
		System.out.println("2. Buscar por categoria");
		System.out.println("3. Buscar por rango de precios");
		System.out.println("4. Volver al menu anterior");
		System.out.println("");
		scanner.nextInt(busquedasSelect);
		switch (busquedasSelect) {
		case 1: {
			invent.mostrarTodosLosProductos();
		}
		case 2: {
			int catSelect = 0;
			System.out.println("Categorias: ");
			System.out.println("1. Belleza");
			System.out.println("2. Tecnologia");
			System.out.println("3. Cocina");
			System.out.println("");
			scanner.nextInt(catSelect);
			switch (catSelect) {
			case 1: {
				invent.mostrarProductosPorCategoria(CategoriaProducto.BELLEZA);
			}
			case 2: {
				invent.mostrarProductosPorCategoria(CategoriaProducto.TECNOLOGIA);
			}
			case 3: {
				invent.mostrarProductosPorCategoria(CategoriaProducto.COCINA);
			}

			default:
				throw new IllegalArgumentException("Opcion no esta entre los valores esperados: ");
			}
		}
		case 3: {
			int minimo = 0, maximo = 0;
			System.out.println("Precio Minimo: ");
			scanner.nextInt(minimo);
			System.out.println("");
			System.out.println("Precio Maximo: ");
			scanner.nextInt(maximo);
			System.out.println("");
			invent.mostrasProductosPorRangoDePrecio(minimo, maximo);
		}
		case 4: {
			return;
		}

		default:
			throw new IllegalArgumentException("Opcion no esta entre los valores esperados: ");
		}
	}

}
