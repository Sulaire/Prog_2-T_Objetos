package Herencia_2;

public abstract class Bebida {
	protected String id;
	protected String marca;
	protected int cantidad;
	protected int litros;
	protected int precio;
	
	public Bebida(String id, String marca, int cantidad, int litros, int precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.cantidad = cantidad;
		this.litros = litros;
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Bebida [id=" + id + ", marca=" + marca + ", cantidad=" + cantidad + ", litros=" + litros + ", precio="
				+ precio + "]";
	}

	
	
}
