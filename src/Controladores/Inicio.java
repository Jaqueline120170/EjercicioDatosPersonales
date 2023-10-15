package Controladores;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¡Vamos a pedirte unos datos personales!\n");
		System.out.print("¿Cuál es tu nombre?: ");
		String nombre = sc.next();
		System.out.print("¿Cuál es tu edad?: ");
		int edad = sc.nextInt();
		System.out.print("¿Cuál es tu sexo? (H/M): ");
		char sexo = sc.next().charAt(0);
		System.out.print("¿Cuál es tu altura? (cm): ");
		double altura = sc.nextDouble();
		
		System.out.print("Nombre: " + nombre + " || edad: " + edad + " || sexo: " + sexo + " || altura: " + altura);
	}

}
