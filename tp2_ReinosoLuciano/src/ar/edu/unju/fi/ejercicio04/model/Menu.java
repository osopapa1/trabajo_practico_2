package ar.edu.unju.fi.ejercicio04.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static int menu() {
		int opc=0;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("\tMENU");
			System.out.println("1- Alta de jugador.");
			System.out.println("2- Mostrar todos los jugadores.");
			System.out.println("3- Modificar la posicion de un jugador.");
			System.out.println("4- Eliminar un jugador.");
			System.out.println("5- Salir.");
		
		do {
			try {
				System.out.print("\nIngrese una opcion: ");
				opc = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.print("\nError al ingresar opcion");
			}
			sc.nextLine();
		}while(opc < 1 || opc > 5);
		
		return opc;
	}
	
	public static int ElegirPosicion () {
		int opc;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\tElija la posicion del jugador");
			System.out.println("1- Delantero.");
			System.out.println("2- Medio.");
			System.out.println("3- Defensa.");
			System.out.println("4- Arquero.");
			opc = sc.nextInt();
		} while (opc < 1 || opc > 4);
	
		return opc;
	}
}