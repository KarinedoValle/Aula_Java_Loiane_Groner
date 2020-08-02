package aula_15;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char turno;
		
		System.out.println("Digite em que turno você estuda.");
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		System.out.print("Turno: ");
		turno = scan.next().charAt(0);
		
		if(turno == 'M' || turno == 'm') {
			System.out.println("\nBom dia!");
		} else if(turno == 'V' || turno == 'v') {
			System.out.println("\nBoa tarde!");
		} else if(turno == 'N' || turno == 'n') {
			System.out.println("\nBoa noite!");
		} else {
			System.out.println("\nValor inválido!");
		}

	}

}
