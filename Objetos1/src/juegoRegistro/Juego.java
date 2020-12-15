package juegoRegistro;

public class Juego {
	private String nombre = "";
	private int record = 0;
	private boolean multijugador;

	public Juego(String nombre) {
		this.nombre = nombre;
		this.record = record;
		multijugador = false;
	}
	
	public String getNombre() {
		return nombre;
	}
	


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setRecord(int record) {
		this.record = record;
	}

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	@Override

	public String toString() {
		return nombre +" --- " + record;
	}

}
