package aula_15;

import java.util.Scanner;

public class Ex_4 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		char letra;
		
		System.out.print("Digite uma letra: ");
		letra = scan.next().charAt(0);
		
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
			letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("A letra digitada é uma vogal.");
		} else {
			System.out.println("A letra digitada é uma consoante.");
		}
	}
}
