package Aula_15;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero para saber se ele � par ou �mpar: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("\nO n�mero " + numero + " � par.");
		} else {
			System.out.println("\nO n�mero " + numero + " � �mpar.");
		}

	}

}
