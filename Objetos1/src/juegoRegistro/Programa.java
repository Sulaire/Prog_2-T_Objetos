package juegoRegistro;

public class Programa {

	public static void verTodosJuegos(Juego vJuegos[]) {
		//leer datos		
		
		//guardar dato en array
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] == null) {
				vJuegos[i] = new Juego("Jun");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Juego vJuegos[] = new Juego[100];

		Juego juego1 = new Juego("Pong");
		Juego juego2 = new Juego("Pacman");
		Juego juego3 = new Juego("Pacmaaan");
		Juego juego4 = new Juego("Sims");

		// Guardar un nuevo juego
		// Poner puntuaci�n a un juego
		// Ver todos los juegos

		vJuegos[0] = juego1;
		vJuegos[1] = juego2;
		vJuegos[2] = juego3;
		vJuegos[3] = juego4;

		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] != null && !vJuegos[i].isMultijugador()) {
				System.out.println(vJuegos[i]);
			}
		}
		
		
		verTodosJuegos(vJuegos);
		

	}

}
