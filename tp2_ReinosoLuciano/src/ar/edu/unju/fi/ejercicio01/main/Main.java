package ar.edu.unju.fi.ejercicio01.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio01.model.Menu;
import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenDeFabricacion;

public class Main {
	
	
	public static void main(String[] args) throws InterruptedException {
		List<Producto> listado = new ArrayList<Producto>(); 
		boolean band = true;
		do {
			switch (Menu.menu()) {

			case 1: {
				Producto prod = new Producto();
				prod = CrearProducto();
				listado.add(prod);
				System.out.println("Se ha agregado un nuevo producto al listado");
				System.out.println("\n");
				Thread.sleep(3000);
			}
			break;
			
			case 2: {
				System.out.println("Productos: ");				
				for(Producto i:listado) {
					System.out.println("\n");
					i.MostrarProducto();
				}
				Thread.sleep(8000);
			}
			break;
			
			case 3: {
				Scanner sc = new Scanner(System.in);
				System.out.print("\nIngrese codigo del producto para modificar: ");
				String cod = sc.nextLine();
				
				for(Producto i : listado) {
					
					if(cod.equals(i.getCodigo())) {
						Producto prod = new Producto();
						prod = CrearProducto();
						
						i.setDescripcion(prod.getDescripcion());
						i.setPrecioU(prod.getPrecioU());
						i.setCategoria(prod.getCategoria());
						i.setOrigenDeFabricacion(prod.getOrigenDeFabricacion());
						
						System.out.println("\nSe modifico el producto de codigo "+cod);						
					}
					
				}
			}
			break;
			
			case 4: {
				System.out.println("Finalizando programa ...");
				System.out.println("\nFin del programa.");
				band = false;
			}
			break;
			
			default: System.out.println("Opcion incorrecta");
			} //Switch
			
		} while (band != false);

		
	} //MetodoMain
	
	private static Producto CrearProducto() {
		Producto producto = new Producto();
		Scanner sc = new Scanner(System.in);
		System.err.println("--------------------------------------------");
		System.out.println("\tCrear producto");
		System.out.println("\nIngrese codigo del producto: ");
		String codigo = sc.nextLine();
		producto.setCodigo(codigo);
		
		System.out.println("Ingrese una descripcion para el producto: ");
		String descripcion = sc.nextLine();
		producto.setDescripcion(descripcion);
		
		System.out.println("Ingrese un precio unitario: ");
		double precioU = sc.nextDouble();
		producto.setPrecioU(precioU);
		
		System.out.println("Ingrese por teclado un origen de fabricacion");
		switch(Menu.elegirOrigenDeFabricacion()) {
		case 1:{
			producto.setOrigenDeFabricacion(OrigenDeFabricacion.ARGENTINA);
		}
		break;
		
		case 2:{
			producto.setOrigenDeFabricacion(OrigenDeFabricacion.CHINA);
			
		}
		break;
		
		case 3:{
			producto.setOrigenDeFabricacion(OrigenDeFabricacion.BRASIL);
		}
		break;
		
		case 4:{
			producto.setOrigenDeFabricacion(OrigenDeFabricacion.URUGUAY);
		}
		break;
		}
		
		System.out.println("Ingrese por teclado una categoria");
		switch(Menu.elegirCategoria()) {
		case 1:{
			producto.setCategoria(Categoria.TELEFONICA);
		}
		break;
		
		case 2:{
			producto.setCategoria(Categoria.INFORMATICA);

		}
		break;
		
		case 3:{
			producto.setCategoria(Categoria.ELECTROHOGAR);
		}
		break;
		
		case 4:{
			producto.setCategoria(Categoria.HERRAMIENTAS);
		}
		break;
		}
		
		return producto;
		
	} //CrearProducto

} //ClaseMain