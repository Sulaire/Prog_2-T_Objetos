package Herencia;

public class Perecedero extends Producto {
	private int dias = 0;

	public int getDias() {
		return dias;
	}

	public Perecedero(String nombre, float precio, int dias) {
		super(nombre, precio);
		this.dias = dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public float calcular(int cantidad) {
		float precioFinal = super.calcular(cantidad);
		switch (dias) {
		case 1:
			precioFinal /=4;
			break;

		case 2:
			precioFinal = precioFinal /3;
			break;
		case 3:
			precioFinal = precioFinal /2;
			break;
		}
		
		
		return super.calcular(cantidad);
	}
}
