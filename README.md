# VentaMinorista-EjercicioPractico
Ejercicio práctico para el bootcamp de Autozone Java SE 17

<br>
## Objetivo
<br>

Aplicar conceptos de programación orientada a objetos, como encapsulación, herencia, polimorfismo y abstracción, así como el uso de enumeraciones, registros, anotaciones y estructuras de control de flujo en Java. Los estudiantes deberán construir un sistema básico para gestionar el inventario de una empresa de venta minorista.

<br>
## Requisitos técnicos
<br>

1. Enumeraciones
   - Crear enumeraciones para CategoriaProducto y EstadoPedido que incluyan diferentes valores relacionados con productos y estados de pedidos.
2. Registro
   - Definir un registro cliente que contenga información sobre el nombre, dirección y teléfono del cliente.
3. Anotaciones
    - Crear una anotación @Verificar que se utilice para marcar métodos que requieren verificación de seguridad o calidad.
4. Clases Abstractas y Subclases
   - Definir una clase abstracta Producto con atributos comunes a todos los productos (nombre, precio, categoría) y métodos abstractos.
   - Crear subclases Electronica, Ropa y Alimentos que hereden de Producto e implementen los métodos abstractos.
5. Clase Contenedora
    - Implementar una clase Inventario que mantenga una lista de productos, y métodos para agregar productos, mostrar todos los productos, mostrar productos por categoría y mostrar productos por rango de precio.
    - Incluir un miembro estático para llevar un conteo total de productos en el inventario.
6. Clase Principal
    - Implementar una clase main que cree instancias de productos y clientes, los agregue al inventario y utilice los métodos de la clase Inventario para mostrar información.
7. Lógica Condicional y Ciclos
    - Utilizar operadores de comparación y ciclos for en los métodos de la clase Inventario para filtrar y mostrar productos según los criterios especificados.
8. Interacción con el Usuario (Opcional)
    - Implementar una simple interfaz de línea de comandos para permitir al usuario buscar productos según criterios específicos.

<br>
## Funcionalidades específicas
<br>
1. Mostrar Todos los Productos
    - Crear un método en la clase inventario que itere sobre la lista de productos y llame al método mostrarDetalles de cada producto.
2. Mostrar Productos por Categoría
    - Crear un método que reciba una CategoriaProducto muestre todos los productos que pertenecen a esa categoría.
3. Mostrar Productos por Rango de Precio
    - Crear un método que reciba un rango de precios (mínimo y máximo) y muestre todos los productos que están dentro de ese rango.
4. Procesamiento de Anotaciones
    - Implementar lógica en la clase main para identificar y procesar métodos que tienen la anotación @Verificar
