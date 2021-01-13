package agenda;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int opc = 0; 
		Contacto[] contactos = new Contacto[16];
		boolean exit = false;
		
		do {
		
			boolean invalid = false;
			do {
			
				System.out.println("Pulsa 1 para AÑADIR");
				System.out.println("Pulsa 2 para BUSCAR");
				System.out.println("Pulsa 3 para BORRAR");
				System.out.println("Pulsa 4 para EDITAR");
				System.out.println("Pulsa 5 para VER");
				System.out.println("Pulsa 6 para SALIR");

				try {
					// Con sc.nextInt() puede dar un error porque coge el caracter "\n" (intro),
					// utilizando Integer.parseInt(sc.nextLine()) no puede dar ese error
					// puesto que sc.nextLine() coge la linea entera siempre y despues parseInt
					// convierte esa linea (que es un string) en un int, si se ha
					// enviado una string que no se puede convertir en int saltará
					// la excepción NumberFormatException
					opc = Integer.parseInt(leer.nextLine());

					if (opc < 1 || opc > 6)
						throw new InputMismatchException();
				} catch (NumberFormatException e) {
					System.out.println("Por favor introduce un numero valido");
					System.out.println(opc);
					invalid = true;
				} catch (InputMismatchException e) {
					System.out.println("Por favor introduce un numero entre el 1 y el 6");
					invalid = true;
				}
			} while (invalid);
		
		
		
			switch (opc) {
				case 1: {
					System.out.println("Dime el nombre del contacto");
					String nombre = leer.nextLine();
					System.out.println("Dime el apellido del contacto");
					String apellido = leer.nextLine();
					System.out.println("Dime el número de teléfono del contacto");
					String telf = leer.nextLine();
						
					Contacto contacto = new Contacto(nombre, apellido, telf);
					
					boolean breik = true;	
					for (int i = 0; i < contactos.length && breik; i++) {
						if (contactos[i] == null) {
							contactos[i] = contacto;
							breik = false;
						}								
					}
					if (breik) {
						System.out.println("La agenda está llena");
					} else {
						System.out.println("Se ha guardado el contacto");   
					}
					break;
				}
				case 2: {
					System.out.println("Escribe el nombre de la persona que quieras buscar");
					String nombre = leer.nextLine();
					for (Contacto contacto : contactos) {
						if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombre)) 
							System.out.println(contacto);
					}
					break;
				}
				case 3: {
					mostrarContactos(contactos);
					System.out.println("Dime el número de contacto que quieres eliminar");
					int num = pedirContacto(contactos);
					// En la funcion se le resta 1 a num por la posicion del array
					contactos[num] = null;
					System.out.println("Contacto eliminado");
					break;
				}
				case 4: {
					mostrarContactos(contactos);
					System.out.println("Dime el número de contacto que quieres editar");
					int num = pedirContacto(contactos);
					System.out.println("Dime el nuevo nombre");
					contactos[num].setNombre(leer.nextLine()); 
					System.out.println("Dime el nuevo apellido");
					contactos[num].setApellido(leer.nextLine()); 
					System.out.println("Dime el nuevo número de telefono");
					contactos[num].setTelf(leer.nextLine()); 
					break;
				}
				case 5: {
					mostrarContactos(contactos);
					break;
				}
				case 6: {
					exit = true;
					break;
				}
			}
			
			if (!exit) System.out.println("\nPresiona una tecla de tu teclado para proseguir con "
					+ "el algoritmo de la agenda realizada mediante objetos en eclipse porfi :3");
			leer.nextLine();
		} while (!exit);
	}
	
	public static void mostrarContactos (Contacto[] contactos) {
		boolean empty = true;
		int i = 0;
		// Le pasas un array (derecha de los ":") y a la izquierda 
		// le pasamos una variable para guardar el valor de cada posición del array.
		// Lo recorre automáticamente :D
		for(Contacto contacto : contactos) {
		// Contacto tiene un método llamado "toString" que se llama automáticamente al 
		// intentar imprimir el objeto.
			i++;
			if (contacto != null) {
				empty = false;
				System.out.println(i+"º Contacto: "+contacto);
				
			} 
				
		} 
		if (empty) System.out.println("La agenda está vacia");
	}
	public static int pedirContacto(Contacto[] contactos) {
		Scanner leer = new Scanner(System.in);
		boolean valid = true;
		int num = 0;
		do {
			valid = true;
			try { 
				num = Integer.parseInt(leer.nextLine())-1;	
				if (num < 01 || num > contactos.length || contactos[num] == null) {
					throw new NumberFormatException();
					
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número válido");
				valid = !valid;
			}
		} while (!valid);
		return num;
	}
}	