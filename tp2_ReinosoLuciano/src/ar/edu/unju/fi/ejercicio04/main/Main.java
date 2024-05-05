package ar.edu.unju.fi.ejercicio04.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio04.constantes.Posicion;
import ar.edu.unju.fi.ejercicio04.model.Jugador;
import ar.edu.unju.fi.ejercicio04.model.Menu;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Jugador>listado = new ArrayList<Jugador>();
		boolean band = false;
		do {
			switch (Menu.menu()) {
			case 1: {
				Jugador jug = new Jugador();
				jug = CrearJugador();
				listado.add(jug);
				System.out.println("Se ha agregado un jugador a la lista.\n");
			}
			break; 
			
			case 2: {
				for(Jugador i:listado) {
					i.MostrarDatos();
					System.out.println("\n");
					Thread.sleep(4000);
				}
			}
			break;
			
			case 3: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese el nombre y el apellido del jugador a modificar");
				System.out.println("Nombre: ");
				String nombre = sc.nextLine();
				
				System.out.println("Apellido: ");
				String apellido = sc.nextLine();
				
				for(Jugador i:listado) {
					if (i.getNombre().equals(nombre) || i.getApellido().equals(apellido)) {
						System.out.println("Ingrese por teclado la posicion del jugador");
						switch (Menu.ElegirPosicion()) {
						case 1: {
							i.setPosicion(Posicion.DELANTERO);
						}
						break;
						
						case 2: {
							i.setPosicion(Posicion.MEDIO);
						}
						break;
						
						case 3: {
							i.setPosicion(Posicion.DEFENSA);
						}
						break;
						
						case 4: {
							i.setPosicion(Posicion.ARQUERO);
						}
						} //Switch
						
						System.out.println("Se ha modificado correctamente la posicion del jugador "+i.getApellido()+", "+i.getNombre()+"\n");
						break;
					} //if
				} //for
			} //case3
			break;
			
			case 4: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese el nombre y el apellido del jugador a modificar");
				System.out.println("Nombre: ");
				String nombre = sc.nextLine();
				
				System.out.println("Apellido: ");
				String apellido = sc.nextLine();
				
				for(Jugador i:listado) {
					if (i.getNombre().equals(nombre) || i.getApellido().equals(apellido)) {
						listado.remove(i);
						System.out.println("Se ha eliminado correctamente al jugador "+i.getApellido()+", "+i.getNombre()+"\n");
						break;
					} //if
				} //for
			} //case4
			break; 
			
			case 5: {
				System.out.println("Finalizando programa ...");
				System.out.println("Fin del programa.");
				band = true;
			}
			break;
			} //Switch
			
		} while (band != true);
	} //MetodoMain
	
	public static Jugador CrearJugador() {
		Scanner sc = new Scanner(System.in);
		Jugador jugador = new Jugador();
		
		System.out.println("\nCargar datos de un jugador");
		System.out.println("Ingrese Apellido del jugador: ");
		String apellido = sc.nextLine();
		jugador.setApellido(apellido);
		
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = sc.nextLine();
		jugador.setNombre(nombre);
		
		System.out.println("Ingrese fecha de nacimiento del jugador...");
		System.out.println("Dia: ");
		int dia = sc.nextInt();
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		System.out.println("Año: ");
		int anio = sc.nextInt();
		LocalDate fechaDeNac = LocalDate.of(anio, mes, dia);
		jugador.setFechaDeNac(fechaDeNac);
		
		System.out.println("Ingrese nacionalidad: ");
		String nacionalidad = sc.next();
		jugador.setNacionalidad(nacionalidad);
		
		System.out.println("Ingrese estatura del jugador (En metros): ");
		double estatura = sc.nextDouble();
		jugador.setEstatura(estatura);
		
		System.out.println("Ingrese el peso del jugador: ");
		byte peso = sc.nextByte();
		jugador.setPeso(peso);
		
		System.out.println("Ingrese por teclado la posicion del jugador");
		switch (Menu.ElegirPosicion()) {
		case 1: {
			jugador.setPosicion(Posicion.DELANTERO);
		}
		break;
		
		case 2: {
			jugador.setPosicion(Posicion.MEDIO);
		}
		break;
		
		case 3: {
			jugador.setPosicion(Posicion.DEFENSA);
		}
		break;
		
		case 4: {
			jugador.setPosicion(Posicion.ARQUERO);
		}
		} //Switch
		
		return jugador;
	} //CrearJugador

} //ClaseMain