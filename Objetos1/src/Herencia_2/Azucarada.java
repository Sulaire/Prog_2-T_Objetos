package Herencia_2;

public class Azucarada extends Bebida{
	private double azucar;
	private boolean promocion;
	
	public Azucarada(String id, String marca, int cantidad, int litros, int precio, double azucar, boolean promocion) {
		super(id, marca, cantidad, litros, precio);
		this.azucar = azucar;
		this.promocion = promocion;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return super.toString() +"Azucarada [azucar=" + azucar + ", promocion=" + promocion + "]";
	}
	
	
	
}
