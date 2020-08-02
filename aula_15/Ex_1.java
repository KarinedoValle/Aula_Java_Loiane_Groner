package aula_15;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.print("Digite o primeiro número: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = scan.nextDouble();
		
		if (n1 > n2) {
			System.out.println("\nO maior número digitado foi: " + n1);
		} else if (n2 > n1) {
			System.out.println("\nO maior número digitado foi: " + n2);
		} else {
			System.out.println("\nOs números são iguais.");
		}

	}

}
