package ar.edu.unju.fi.ejercicio05.model;

import java.util.Scanner;

public class Menu {
	public static int MostrarMenu() {
		int opc=1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\tMENU");
			System.out.println("1.Mostrar lista de productos");
			System.out.println("2.Realizar compra");
			System.out.println("3.Salir");
			System.out.print("Ingrese una opcion: ");
			opc = sc.nextInt();
		} while (opc < 1 || opc >3);
		return opc;
	}
	
	public static int MenuCompra(double monto) {
		int opc=1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\tRealizar Compra");
			System.out.println("Monto total: "+monto);
			System.out.println("1.Agregar producto");
			System.out.println("2.Pagar con tarjeta");
			System.out.println("3.Pagar con efectivo");
			System.out.println("4.Volver");
			System.out.print("Ingrese una opcion: ");
			opc = sc.nextInt();
		} while (opc < 1 || opc > 4);
		return opc;
	}
}
