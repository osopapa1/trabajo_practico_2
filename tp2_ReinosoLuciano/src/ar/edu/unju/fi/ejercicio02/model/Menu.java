package ar.edu.unju.fi.ejercicio02.model;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("\tMENU");
		System.out.println("1 – Crear efemeride.");
		System.out.println("2 – Mostrar efemerides.");
		System.out.println("3 – Eliminar efemeride.");
		System.out.println("4 - Modificar efemeride.");
		System.out.println("5 - Salir.");
		System.out.println("Ingrese una opcion: ");
		int opc = sc.nextInt();
		return opc;
	}
	
	public static int ElegirMes() {
		int opc;
		do {
			System.out.println("Elija un mes: ");
			System.out.println("1- Enero.");
			System.out.println("2- Febrero.");
			System.out.println("3- Marzo.");
			System.out.println("4- Abril.");
			System.out.println("5- Mayo.");
			System.out.println("6- Junio.");
			System.out.println("7- Julio.");
			System.out.println("8- Agosto.");
			System.out.println("9- Septiembre.");
			System.out.println("10- Octubre.");
			System.out.println("11- Noviembre.");
			System.out.println("12- Diciembre.");
			opc = sc.nextInt();
		} while (opc < 0 || opc > 12);
		return opc;
	}
}