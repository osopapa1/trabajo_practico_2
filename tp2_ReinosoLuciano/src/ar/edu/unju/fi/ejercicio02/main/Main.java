package ar.edu.unju.fi.ejercicio02.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio02.constantes.mes;
import ar.edu.unju.fi.ejercicio02.model.Efemeride;
import ar.edu.unju.fi.ejercicio02.model.Menu;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Efemeride> listado = new ArrayList<>();
		boolean band = false;
		do {
			switch (Menu.menu()){
			case 1: {
				Efemeride efem = new Efemeride();
				efem = CrearEfemeride();
				listado.add(efem);
				System.out.println("Se ha agregado una nueva efemeride al listado.\n");
			}
			break;
			
			case 2: {
				for (Efemeride i:listado) {
					System.out.println("\nDatos: ");
					i.MostrarDatos();
					System.out.println("\n");
				}
				Thread.sleep(5000);
			}
			break;
			
			case 3: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese el codigo de la efemeride a eliminar: ");
				String codigo = sc.nextLine();
				
				for(Efemeride i:listado) {
					if(codigo.equals(i.getCodigo())) {
						listado.remove(i);
						System.out.println("Se ha eliminado correctamente la efemeride de codigo: "+codigo+"\n");
						break;
					} //if
				} //for
				
			} //case3
			break;
			
			case 4: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingrese el codigo de la efemeride a modificar: ");
				String codigo = sc.nextLine();
				
				for(Efemeride i:listado) {
					if(codigo.equals(i.getCodigo())) {
						Efemeride efem = new Efemeride();
						efem = CrearEfemeride();
						i.setDetalle(efem.getDetalle());
						i.setDia(efem.getDia());
						i.setMes(efem.getMes());
						
						System.out.println("Se ha modificado correctamente la efemeride de codigo: "+codigo+"\n");
						break;
					} //if
				} //for
			}
			break;
			
			case 5: {
				System.out.println("Finalizando programa ...");
				System.out.println("Fin del programa.");
				band = true;
			}
			break;
			
			}//Switch
			
		} while (band != true);
		
	} //MetodoMain
	
	private static Efemeride CrearEfemeride() {
		Efemeride efemeride = new Efemeride();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el codigo de la efemeride: ");
		String codigo = sc.nextLine();
		efemeride.setCodigo(codigo);
		
		System.out.println("Ingrese por teclado el numero del mes: ");
		int opc = Menu.ElegirMes();
		switch (opc) {
		case 1: {
			efemeride.setMes(mes.ENERO);
		}
		break;
		
		case 2: {
			efemeride.setMes(mes.FEBRERO);
		}
		break;
		
		case 3: {
			efemeride.setMes(mes.MARZO);
		}
		break;
	
		case 4: {
			efemeride.setMes(mes.ABRIL);
		}
		break;
		
		case 5: {
			efemeride.setMes(mes.MAYO);
		}
		break;
		
		case 6: {
			efemeride.setMes(mes.JUNIO);
		}
		break;
		
		case 7: {
			efemeride.setMes(mes.JULIO);
		}
		break;
		
		case 8: {
			efemeride.setMes(mes.AGOSTO);
		}
		break;
		
		case 9: {
			efemeride.setMes(mes.SEPTIEMBRE);
		}
		break;
		
		case 10: {
			efemeride.setMes(mes.OCTUBRE);
		}
		break;
		
		case 11: {
			efemeride.setMes(mes.NOVIEMBRE);
		}
		break;
		
		case 12: {
			efemeride.setMes(mes.DICIEMBRE);
		}
		break;
		} // switch
		
		System.out.println("Ingrese un dia: ");
		byte dia = sc.nextByte();
		efemeride.setDia(dia);
		
		System.out.println("Proporcione detalles de la efemeride: ");
		String detalle = sc.next();
		efemeride.setDetalle(detalle);
		
		return efemeride;
		
	} //CrearEfemeride

} //ClaseMain