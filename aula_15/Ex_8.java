package aula_15;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor1, valor2, valor3;
		
		System.out.print("Digite o pre�o do primeiro produto: ");
		valor1 = scan.nextDouble();
		System.out.print("Digite o pre�o do segundo produto: ");
		valor2 = scan.nextDouble();
		System.out.print("Digite o pre�o do terceiro produto: ");
		valor3 = scan.nextDouble();
		
		if(valor1 < valor2 && valor1 < valor3) {
			System.out.println("\nCompre o primeiro produto!");
		} else if(valor2 < valor1 && valor2 < valor3) {
			System.out.println("\nCompre o segundo produto!");
		} else if(valor3 < valor1 && valor3 < valor2) {
			System.out.println("\nCompre o terceiro produto!");
		} else {
			System.out.println("\nOs valores s�o iguais. Compre o produto que desejar.");
		}

	}

}
