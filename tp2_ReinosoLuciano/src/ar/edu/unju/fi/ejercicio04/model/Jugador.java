package ar.edu.unju.fi.ejercicio04.model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.ejercicio04.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNac;
	private String nacionalidad;
	private double estatura;
	private byte peso;
	private Posicion posicion;
	
	public Jugador() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}

	public void setFechaDeNac(LocalDate fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public byte getPeso() {
		return peso;
	}

	public void setPeso(byte peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public int CalcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period period = Period.between(fechaDeNac, hoy);
		int edad = period.getYears();
		return edad;
	}
	
	public void MostrarDatos() {
		System.out.println("----- Mostrar datos -----");
		System.out.println("Apellido y nombre: "+this.apellido+", "+this.nombre);
		System.out.println("Fecha de Nacimiento: "+this.fechaDeNac+"\nEdad: "+CalcularEdad());
		System.out.println("Nacionalidad: "+this.nacionalidad);
		System.out.println("Estatura: "+this.estatura);
		System.out.println("Peso: "+this.peso);
		System.out.println("Posicion: "+this.posicion);
	}
}