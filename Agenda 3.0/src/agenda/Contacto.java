package agenda;

class Contacto {
	private String nombre;
	private String apellido;
	private String telf;
	
	public Contacto (String nombre, String apellido, String telf) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telf = telf;
	}
	
	public String getNombre() {
		return this.nombre;
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

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}
	
	// Todas las clases heredan de "Object". Al heredar de esta clase, algunos metodos 
	// los tienen todas las clases y para poder modificarlos, hay que utilizar la etiqueta @Override
	@Override
	public String toString() {
		// "%" Buscar variable
		// "numero$" selecciona posición
		// "s" String, "d" int, "f" float o double
		return String.format("Nombre: %2$s %1$s, Teléfono %3$s", this.apellido, this.nombre, this.telf);
							
	}	
}
