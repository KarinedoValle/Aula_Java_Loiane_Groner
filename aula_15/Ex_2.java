package aula_15;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite um número qualquer: ");
		numero = scan.nextDouble();
		
		if (numero > 0) {
			System.out.println("\nO número digitado é positivo.");
		} else if (numero < 0) {
			System.out.println("\nO número digitado é negativo.");
		} else {
			System.out.println("\nZero é um número neutro.");
		}

	}

}
