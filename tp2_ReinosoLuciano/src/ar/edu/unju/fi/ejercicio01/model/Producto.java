package ar.edu.unju.fi.ejercicio01.model;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precioU;
	private OrigenDeFabricacion origenDeFabricacion;
	private Categoria categoria;
	
	public Producto() {
	}

	public Producto(String codigo, String descripcion, double precioU, OrigenDeFabricacion origenDeFabricacion,
			Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioU = precioU;
		this.origenDeFabricacion = origenDeFabricacion;
		this.categoria = categoria;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioU() {
		return precioU;
	}

	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	public OrigenDeFabricacion getOrigenDeFabricacion() {
		return origenDeFabricacion;
	}

	public void setOrigenDeFabricacion(OrigenDeFabricacion origenDeFabricacion) {
		this.origenDeFabricacion = origenDeFabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public enum OrigenDeFabricacion {
		ARGENTINA, CHINA, BRASIL, URUGUAY;
	}
	
	public enum Categoria {
		TELEFONICA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS;
	}
	
	public void MostrarProducto() {
		System.out.println("----- Mostrar Datos -----");
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Descripcion: "+this.descripcion);
		System.out.println("Precio unitario: "+this.precioU);
		System.out.println("Origen de fabricacion: "+this.origenDeFabricacion);
		System.out.println("Categoria: "+this.categoria);
		System.out.println("\n");
	}
}