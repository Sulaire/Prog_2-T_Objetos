package modulos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leerTxt = new Scanner(System.in);
		Scanner leerNum = new Scanner(System.in);
		
		String codigo = "", nombre = "";
		int horas = 0, horasYear = 0;
		
		Modulo vModulos[] = new Modulo[2];
		
		for (int i = 0; i < vModulos.length; i++) {
			System.out.println("Dime el codigo del modulo "+(i+1));
			codigo = leerTxt.nextLine();
			System.out.println("Dime el nombre del modulo "+(i+1));
			nombre = leerTxt.nextLine();
			System.out.println("Dime las horas anuales del modulo "+(i+1));
			horas = leerNum.nextInt();
			vModulos[i] = new Modulo(codigo, nombre, horas);
						
		}
		for (Modulo m : vModulos) {
			System.out.println(m.toString());
			horasYear += m.getHoras();
		}
		
		System.out.println("El año lectivo contara con "+horasYear+" horas de enseñanzas totales");
		
	}

}
