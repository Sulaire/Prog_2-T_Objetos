package ejem;

public class Gato {

	private String nombre;
	private int vidas;
	private int numPatas;

	public Gato() {
		nombre = "Juan";
		vidas = 7;
		numPatas = 4;
	}
	
	public Gato(String nombre, int vidas, int numPatas) {
		this.nombre = nombre;
		this.vidas = vidas;
		this.numPatas = numPatas;
	}

	public void setNombre(String nombre1) {
		this.nombre = nombre1;
	}
	
}
