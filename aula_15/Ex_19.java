package Aula_15;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, res = 0;
		char op;
		
		System.out.print("Digite o primeiro número: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = scan.nextDouble();
		System.out.print("Digite a operação que deseja realizar [+, -, *, /]: ");
		op = scan.next().charAt(0);
		
		System.out.println();
		
		if(op == '+') {
			res = n1 + n2;
			System.out.println("A soma dos números " + n1 + " e " + n2 + " é: " + res);
		} else if(op == '-') {
			res = n1 - n2;
			System.out.println("A subtração dos números " + n1 + " e " + n2 + " é: " + res);
		} else if(op == '*') {
			res = n1 * n2;
			System.out.println("A multiplicação dos números " + n1 + " e " + n2 + " é: " + res);
		} else if(op == '/') {
			if(n2 != 0) {
			res = n1 / n2;
			System.out.println("A divisão dos números " + n1 + " e " + n2 + " é: " + res);
			} else {
				System.out.println("Não é possível dividir um número por zero.");
			}
		} else {
			System.out.println("Operação inválida.");
		}
		
		if(res % 2 == 0) {
			System.out.println("O número " + res + " é par.");
		} else {
			System.out.println("O número " + res + " é ímpar.");
		}
		
		if(res > 0) {
			System.out.println("O número " + res + " é positivo.");
		} else if(res < 0) {
			System.out.println("O número " + res + " é negativo.");
		} else {
			System.out.println("O número " + res + " é neutro.");
		}
	}

}
