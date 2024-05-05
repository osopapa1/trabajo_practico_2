package ar.edu.unju.fi.ejercicio02.model;

import ar.edu.unju.fi.ejercicio02.constantes.mes;

public class Efemeride {
	private String codigo;
	private mes mes;
	private byte dia;
	private String detalle;
	
	public Efemeride() {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public mes getMes() {
		return mes;
	}

	public void setMes(mes mes) {
		this.mes = mes;
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public void MostrarDatos() {
		System.out.println("----- Mostrar Datos -----");
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Mes: "+this.mes);
		System.out.println("Dia: "+this.dia);
		System.out.println("Detalles: "+this.detalle);
	}
}