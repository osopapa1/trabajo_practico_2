package ar.edu.unju.fi.ejercicio07.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio07.model.Producto;

public class Main {
	private static ArrayList<Producto> productos = new ArrayList<>();

	
	public static void main(String[] args) {
		CargarProductos();
		
		Scanner sc = new Scanner(System.in);
		boolean band = true;
		
		while(band) {
			MostrarMenu();
			String op = sc.nextLine();
			switch(op) {
			case "1": {
				Consumer<Producto> prodDisponible = n -> {
					if(n.isEstado()) n.MostrarProducto();
				};
				productos.forEach(prodDisponible);
			}
			break;
			
			case "2": {
				Predicate<Producto> noDisponible = n -> !n.isEstado();
				List<Producto> prod = productos.stream().filter(noDisponible).collect(Collectors.toList());
				prod.forEach(n -> n.MostrarProducto());
			}
			break;
			
			case "3": {
				Function<Producto, Producto> incremento = (n) -> {
					Producto prod = n;
					prod.setPrecio(n.getPrecio()+0.20*n.getPrecio());
					return prod;
				};
				List<Producto> prodIncremento = productos.stream().map(incremento).collect(Collectors.toList());
				prodIncremento.forEach(n -> n.MostrarProducto());
			}
			break;
			
			case "4": {
				Predicate<Producto> cat = n -> n.getCategoria().equals("Bebida");
				List<Producto> prod = productos.stream().filter(cat).collect(Collectors.toList());
				prod.forEach(n -> n.MostrarProducto());
			}
			break;
			
			case "5": {
				productos.sort(Comparator.comparing(Producto::getPrecio).reversed());
				productos.forEach(n -> n.MostrarProducto());
			}
			break;
			
			case "6": {
				Function<Producto, Producto> mayuscula = (n) -> {
					Producto prod = n;
					prod.setNombre(n.getNombre().toUpperCase());
					return prod;
				};
				List<Producto> prodMayus = productos.stream().map(mayuscula).collect(Collectors.toList());
				prodMayus.forEach(n -> n.MostrarProducto());
			}
			break;
			
			case "7": {
				System.out.println("***FIN DEL PROGRAMA***");
				band = false;
			}
			break;
			
			default: System.out.println("Error al ingresar opcion");
			}
		}
		
		sc.close();
	}

	private static void CargarProductos() {
		productos.add(new Producto("1", "Galletas Surtido Bagley", 1200.0, true, 3,"Galleta"));
		productos.add(new Producto("2", "Obleas Opera", 1000.0, false, 0,"Galleta"));
		productos.add(new Producto("3", "Chocolate Cofler", 2500.0, true, 2,"Chocolate"));
		productos.add(new Producto("4", "Gomitas Mogul - Tiburones", 1500.0, true, 8,"Caramelo"));
		productos.add(new Producto("5", "Gomitas Mogul - Ositos", 1500.0, false, 0,"Caramelo"));
		productos.add(new Producto("6", "Turron", 1200.0, false, 0,"Turron"));
		productos.add(new Producto("7", "Barra de cereal", 1800.0, true, 5,"BarraCereal"));
		productos.add(new Producto("8", "Paquete de chicles", 1200.0, false, 0,"Caramelo"));
		productos.add(new Producto("9", "Mantecol", 2200.0, true, 3,"Mantecol"));
		productos.add(new Producto("10", "Bolsa de caramelos", 3000.0, true, 4,"Caramelo"));
		productos.add(new Producto("11", "Alfajor - Jorgito", 1000.0, true, 3,"Alfajor"));
		productos.add(new Producto("12", "Alfajor - Guaymallen", 500.0, true, 3,"Alfajor"));
		productos.add(new Producto("13", "Coca-Cola 2L", 2200.0, false, 0,"Bebida"));
		productos.add(new Producto("14", "Jugo Baggio 1,5L", 1400.0, true, 2,"Bebida"));
		productos.add(new Producto("15", "Caja de Bombones", 3700.0, false, 0,"Caramelo"));
	}
	
	private static void MostrarMenu() {
		System.out.println("\n\tMENU");
		System.out.println("1-Mostrar los productos disponibles");
		System.out.println("2-Mostrar los productos NO disponibles");
		System.out.println("3-Incrementar los precios de los productos un 20%");
		System.out.println("4-Mostrar bebidas disponibles");
		System.out.println("5-Mostrar productos por precio descendente");
		System.out.println("6-Mostrar los productos en Mayusculas");
		System.out.println("7-Salir");
		System.out.println("Ingrese una opcion: ");
	}

}


