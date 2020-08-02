package aula_15;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.print("Digite o primeiro número: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = scan.nextDouble();
		System.out.print("Digite o terceiro número: ");
		n3 = scan.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("\nO maior número é: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("\nO maior número é: " + n2);
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("\nO maior número é: " + n3);
		} else {
			System.out.println("\nOs número são iguais.");
		}
		
	

	}

}
