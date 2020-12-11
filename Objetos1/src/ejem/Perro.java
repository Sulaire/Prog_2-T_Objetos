package ejem;

public class Perro {

	private String nombre = "";
	private int edad = 0;
	private boolean vacunado = false;

	public Perro(String nombre, int edad, boolean vacunado) {
		this.nombre = nombre;
		this.edad = edad;
		this.vacunado = vacunado;
	}

	public void birthday() {
		if (edad > 15) {
			System.out.println("Adios chauchau");
		} else {
			edad++;
		}

	}

	public void vacunar() {
		if (vacunado == false) {
			vacunado = true;
		} else {
			System.out.println("Ya estoy vacunado");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		
		return ("El perro se llama " + nombre + " tiene " + edad + " años y su estado de vacuna es " + vacunado);
	}
}
