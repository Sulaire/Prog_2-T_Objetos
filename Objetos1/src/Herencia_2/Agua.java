package Herencia_2;

public class Agua extends Bebida {
	private String origen;

	public Agua(String id, String marca, int cantidad, int litros, int precio, String origen) {
		super(id, marca, cantidad, litros, precio);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Agua [origen=" + origen + "]";
	}
}
