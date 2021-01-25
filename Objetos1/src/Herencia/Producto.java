package Herencia;

public class Producto {
	protected String nombre;
	protected float precio;
	
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public float calcular(int cantidad) {
		return precio*cantidad;
	}
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
