package ar.edu.unju.fi.ejercicio01.model;

import java.util.Scanner;

public class Menu {
	public static char[] menu;
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("\tMENU");
		System.out.println("1 – Crear Producto.");
		System.out.println("2 – Mostrar productos.");
		System.out.println("3 – Modificar producto (sólo puede modificar: descripción, precio unitario, origen fabricación o ");
		System.out.println("4 - Salir.");
		System.out.println("Ingrese una opcion: ");
		int opc = sc.nextInt();
		return opc;
	}
	
	public static int elegirOrigenDeFabricacion() {
		System.out.println("---- Origen de Fabricacion ----");
		System.out.println("1- Argentina");
		System.out.println("2- China");
		System.out.println("3- Brasil");
		System.out.println("4- Uruguay");
		System.out.println("Elija una opcion: ");
		int opc = sc.nextInt();
		return opc;
	}
	
	public static int elegirCategoria() {
		System.out.println("------ Categoria ------");
		System.out.println("1- Telefonia");
		System.out.println("2- Informatica");
		System.out.println("3- Electro Hogar");
		System.out.println("4- Herramientas");
		int opc = sc.nextInt();
		return opc;
	}
}