package com.proyecto.principal;
import java.util.Scanner;

import com.proyecto.anotaciones.Revisar;
import com.proyecto.enums.CategoriaProducto;
import com.proyecto.models.Alimentos;
import com.proyecto.models.Electronica;
import com.proyecto.models.Inventario;
import com.proyecto.models.Producto;
import com.proyecto.models.Ropa;
import com.proyecto.registros.Cliente;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Omar", "Direccion Conocida 123", "417-985-8987");

		//System.out.println(cliente1.nombre() + "\t" + cliente1.direccion() + "\t" + cliente1.telefono());

		Electronica television = new Electronica("123456", "Television", 6500.00, CategoriaProducto.ELECTRONICA,
				"Samsung", "SG123");

		Alimentos sandia = new Alimentos("Sandia", 29.99, CategoriaProducto.DESPENSA, "Mimarca", 1.00);

		Ropa camisa = new Ropa("Camisa", 259.99, CategoriaProducto.VESTIMENTA, "ZARA", 'L', "Negro");

		Inventario inventario = new Inventario();
		inventario.agregarProducto(television);
		inventario.agregarProducto(sandia);
		inventario.agregarProducto(camisa);
		
		Scanner lectura = new Scanner (System.in);
		
		System.out.print("Ingresa el valor minimo del rango: ");
		int precioMinimo = lectura.nextInt();
		System.out.print("Ingresa el valor maximo del rango: ");
		int precioMaximo = lectura.nextInt();
		
		System.out.println("Mostrando productos por rango");
		inventario.mostrarProductosPorRango(precioMinimo, precioMaximo);
		System.out.println("\n");

		System.out.println("Mostrando productos por categoria");
		inventario.mostrarProductosPorCategoria(CategoriaProducto.ELECTRONICA);
		System.out.println("\n");

		System.out.println("Mostrando todos los productos");
		inventario.mostrarTodosLosProductos();

		System.out.println("\n");
		System.out.println("Total de Productos: " + Inventario.getTotalProductos());
		
		System.out.println("\n");
		
		for(var metodo: Producto.class.getDeclaredMethods()) {
			if(metodo.isAnnotationPresent(Revisar.class)) {
				Revisar revisar = metodo.getAnnotation(Revisar.class);
				System.out.println("Metodo: "+metodo.getName()+", Anotacion: "+revisar.value());
			}
		}

	}

}
