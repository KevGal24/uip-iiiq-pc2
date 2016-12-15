package principal;

import leer.Leer;


public class Test {

	public static void main(String[] args) {


		System.out.println("Bienvenido a la tienda de Libros UIP Prog 2\n--------\n");

		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; // Variables para seleccionar el
												// producto y la cantidad que se
												// quiere comprar

		// Se instancian y cargan los productos
		Producto libro1 = new libro1y2("Don Quijote", 18.53, 6, true, "Literatura");
		Producto libro2 = new libro1y2("Cien años de Soledad", 21.2, 20, true, "Literatura");
		Producto libro3 = new libro3("Programación 2", 30.2, 5, true, "Informatica");
		Producto libro4 = new libro4("Troya", 35.11, 0, false, "Historias");


		Producto catalogo[] = new Producto[Producto.dimesionArray];

		Gestion gestion = new Gestion();

				catalogo[0] = libro1;
		catalogo[1] = libro2;
		catalogo[2] = libro3;
		catalogo[3] = libro4;

		do {
			System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
					+ "1. Mostrar productos\n" + "2. Seleccionar producto que desea\n"
					+ "3. Mostrar monto de compra\n"
					+ "SALIR --> Pulse cualquier otro número\n");
			switch (Leer.datoInt()) {
			case 1:
				gestion.mostrarProductos(catalogo);
				break;
			case 2:
				System.out.println("¿Que producto desea comprar?");
				gestion.mostrarNombreProductos(catalogo);
				lecturaProducto = Leer.datoInt();
				System.out.println("¿Cuánta cantidad desea comprar?");
				lecturaCantidad = Leer.datoInt();
								gestion.comprarProducto(catalogo, lecturaProducto,
						lecturaCantidad);
				break;
			case 3:
				System.out.println(gestion.mostrarCaja() + " USD");
				break;
			default:
				
				continuar = false;
			}

		} while (continuar);

		System.out.println("---- Gracias por usar la aplicación. ----");

	}

}
