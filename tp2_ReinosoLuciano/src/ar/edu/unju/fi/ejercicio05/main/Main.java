package ar.edu.unju.fi.ejercicio05.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio05.model.Menu;
import ar.edu.unju.fi.ejercicio05.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio05.model.PagoTarjeta;
import ar.edu.unju.fi.ejercicio05.model.Producto;



public class Main {

	private static ArrayList<Producto> productos = new ArrayList<>();
	private static double monto=0.0;
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		CargarProductos();
		boolean band = true;
		
		do {
			switch (Menu.MostrarMenu()) {
			case 1: {
				System.out.println("\n");
				for(Producto i : productos) {
					i.MostrarProducto();
				}
			}
			break;
			
			case 2: {
				System.out.println("\n");
				ComprarProducto();
			}
			break;
			
			case 3: {
				System.out.println("Finalizando programa ...");
				System.out.println("\nFin del programa.");
				band = false;
			}
			
			} //Switch
			}while (band != false);
		
	} //MetodoMain
	
	
	private static void ComprarProducto() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		boolean band=true;
		
		do {
			switch (Menu.MenuCompra(monto)) {
			case 1: {
				System.out.print("Ingrese codigo del producto para agregar al monto: ");
				String cod = sc.nextLine();
				System.out.println("\n");
				
				for(Producto i : productos) {
					if(i.getCodigo().equals(cod)) {
						if(!i.isEstado()) {
							System.out.println("\nEl producto se encuentra sin stock.");
							break;
						} //IfStock
						
						monto += i.getPrecio();
						i.setUnidades(i.getUnidades()-1);
						if(i.getUnidades() == 0) i.setEstado(false);
						break;
					} //1erIf
				} //for
			} //case1
			break;
			
			case 2: {
				PagoTarjeta pagoTarjeta = new PagoTarjeta("4539123456789090", LocalDate.now(), 0.0);
				pagoTarjeta.realizarPago(monto);
				monto = 0.0;
				pagoTarjeta.imprimirRecibo();
				System.out.println("\n");
			}
			break;
			
			case 3: {
				PagoEfectivo pagoEfectivo = new PagoEfectivo(0.0, LocalDate.now());
				pagoEfectivo.realizarPago(monto);
				monto = 0.0;
				pagoEfectivo.imprimirRecibo();
				System.out.println("\n");
			}
			break;
			
			case 4: {
				System.out.println("\nVolviendo al menu principal ...");
				Thread.sleep(2000);
				System.out.println("\n");
				band = false;
			}
			
			} //Switch
		} while (band != false);
		
	} //ComprarProducto
	
	
	private static void CargarProductos() {
		productos.add(new Producto("1", "Galletas Surtido Bagley", 1200.0, true, 3));
		productos.add(new Producto("2", "Obleas Opera", 1000.0, true, 5));
		productos.add(new Producto("3", "Chocolate Cofler", 2500.0, true, 2));
		productos.add(new Producto("4", "Gomitas Mogul - Tiburones", 1500.0, true, 8));
		productos.add(new Producto("5", "Gomitas Mogul - Ositos", 1500.0, true, 6));
		productos.add(new Producto("6", "Turron", 1200.0, true, 4));
		productos.add(new Producto("7", "Barra de cereal", 1800.0, true, 5));
		productos.add(new Producto("8", "Paquete de chicles", 1200.0, true, 7));
		productos.add(new Producto("9", "Mantecol", 2200.0, true, 3));
		productos.add(new Producto("10", "Bolsa de caramelos", 3000.0, true, 4));
		productos.add(new Producto("11", "Alfajor - Jorgito", 1000.0, true, 3));
		productos.add(new Producto("12", "Alfajor - Guaymallen", 500.0, true, 3));
		productos.add(new Producto("13", "Coca-Cola 2L", 2200.0, true, 6));
		productos.add(new Producto("14", "Jugo Baggio 1,5L", 1400.0, true, 2));
		productos.add(new Producto("15", "Caja de Bombones", 3700.0, true, 1));
	} //CargarProductos
	
} //ClaseMain
