package Aula_15;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano;
		
		System.out.print("Digite o ano para saber se � bissexto ou n�o: ");
		ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			if(ano % 100 != 0) {
				System.out.println("\nO ano de " + ano + " � bissexto.");
			}
		} else {
			if(ano % 400 != 0) {
				System.out.println("\nO ano de " + ano + " n�o � bissexto.");
			} else {
				System.out.println("\nO ano de " + ano + " � bissexto.");
			}
		}

	}

}
