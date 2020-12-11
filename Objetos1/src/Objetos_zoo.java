package ejem;

public class Objetos_zoo {
	
	public static void main(String[] args) {
		
		Gato minusi = new Gato("Minusi", 7, 4);

		Perro dogo = new Perro("dogo", 8, false);
		
		dogo.birthday();
		
		dogo.vacunar();
		
		System.out.println(dogo.toString());
		
		
		
		
		
	
	}
}
