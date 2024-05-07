package ar.edu.unju.fi.ejercicio07.model;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private boolean estado;
	private int unidades;
	private String categoria;
	
	public Producto() {
		super();
	}

	public Producto(String codigo, String nombre, double precio, boolean estado, int unidades, String categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;
		this.unidades = unidades;
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void MostrarProducto() {
		System.out.println("----- Mostrar Datos -----");
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Categoria: "+this.categoria);
		if(estado) {
			System.out.println("Estado: Disponible.");
			System.out.println("Precio: "+this.precio);
			System.out.println("Unidades disponibles:"+this.unidades);
		}
		else {
			System.out.println("Estado: No disponible.");
		}
		System.out.println("\n");	
	}
}
