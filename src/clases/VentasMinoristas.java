package clases;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import registros.Cliente;


public class VentasMinoristas {
    private static Inventario inventario = new Inventario();
    private static List<Cliente> clientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    agregarCliente();
                    break;
                case 4:
                    mostrarClientes();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1) Añadir producto");
        System.out.println("2) Mostrar productos");
        System.out.println("3) Añadir cliente");
        System.out.println("4) Mostrar clientes");
        System.out.println("5) Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.println("Seleccione categoría del producto: ");
        System.out.println("1) Electrónica");
        System.out.println("2) Ropa");
        System.out.println("3) Alimentos");
        int categoriaOpcion = scanner.nextInt();
        scanner.nextLine(); 

        Producto producto = null;
        switch (categoriaOpcion) {
            case 1:
                producto = new Electronica(nombre, precio);
                break;
            case 2:
                producto = new Ropa(nombre, precio);
                break;
            case 3:
                producto = new Alimentos(nombre, precio);
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

        inventario.agregarProducto(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void mostrarProductos() {
        System.out.println("\n--- Lista de Productos ---");
        inventario.mostrarTodosLosProductos();
        System.out.println("Total de productos en el inventario: " + Inventario.getTotalProductos());
    }

    private static void agregarCliente() {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese dirección del cliente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese teléfono del cliente: ");
        String telefonoStr = scanner.nextLine();
        
        long telefono = Long.parseLong(telefonoStr);

        Cliente cliente = new Cliente(nombre, direccion, telefono);
        clientes.add(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }

    private static void mostrarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.nombre());
            System.out.println("Dirección: " + cliente.direccion());
            System.out.println("Teléfono: " + cliente.telefono());
            System.out.println("-------------------------");
        }
    }
}