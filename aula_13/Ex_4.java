package aula_13;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = scan.nextDouble();
		
		System.out.println("\nA média das notas digitadas é: " + (nota1 + nota2 + nota3 + nota4)/4);
	}
}
