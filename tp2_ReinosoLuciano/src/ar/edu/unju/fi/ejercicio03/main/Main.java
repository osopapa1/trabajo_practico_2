package ar.edu.unju.fi.ejercicio03.main;

import java.util.ArrayList;
import java.util.Arrays;

import ar.edu.unju.fi.ejercicio03.constantes.provincia;


public class Main {

	public static void main(String[] args) {
		ArrayList<provincia>provincias = new ArrayList<provincia>(Arrays.asList(provincia.values()));
		
		for (provincia i:provincias) {
			System.out.println("\nProvincia de "+i);
			System.out.println("Poblacion: "+i.getCantPoblacion());
			System.out.println("Superficie: "+i.getSuperficie());
			System.out.println("Densidad poblacional: "+i.DensidadPoblacion());
			System.out.println();
		}
		
	}

}