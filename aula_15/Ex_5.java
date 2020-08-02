package aula_15;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 7 && media < 10) {
			System.out.println("\nAluno aprovado!");
		} else if(media < 7) {
			System.out.println("\nAluno reprovado!");
		} else if (media == 10) {
			System.out.println("\nAluno aprovado com distinção!");
		}

	}

}
