package modulos;

public class Modulo {
	private String nombre, codigo;
	private int horas;
	
	public Modulo(String nombre, String codigo, int horas) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + "]";
	}
	
	
	
}
