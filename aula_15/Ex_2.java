package aula_15;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite um n�mero qualquer: ");
		numero = scan.nextDouble();
		
		if (numero > 0) {
			System.out.println("\nO n�mero digitado � positivo.");
		} else if (numero < 0) {
			System.out.println("\nO n�mero digitado � negativo.");
		} else {
			System.out.println("\nZero � um n�mero neutro.");
		}

	}

}
