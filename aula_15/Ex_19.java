package Aula_15;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, res = 0;
		char op;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		n2 = scan.nextDouble();
		System.out.print("Digite a opera��o que deseja realizar [+, -, *, /]: ");
		op = scan.next().charAt(0);
		
		System.out.println();
		
		if(op == '+') {
			res = n1 + n2;
			System.out.println("A soma dos n�meros " + n1 + " e " + n2 + " �: " + res);
		} else if(op == '-') {
			res = n1 - n2;
			System.out.println("A subtra��o dos n�meros " + n1 + " e " + n2 + " �: " + res);
		} else if(op == '*') {
			res = n1 * n2;
			System.out.println("A multiplica��o dos n�meros " + n1 + " e " + n2 + " �: " + res);
		} else if(op == '/') {
			if(n2 != 0) {
			res = n1 / n2;
			System.out.println("A divis�o dos n�meros " + n1 + " e " + n2 + " �: " + res);
			} else {
				System.out.println("N�o � poss�vel dividir um n�mero por zero.");
			}
		} else {
			System.out.println("Opera��o inv�lida.");
		}
		
		if(res % 2 == 0) {
			System.out.println("O n�mero " + res + " � par.");
		} else {
			System.out.println("O n�mero " + res + " � �mpar.");
		}
		
		if(res > 0) {
			System.out.println("O n�mero " + res + " � positivo.");
		} else if(res < 0) {
			System.out.println("O n�mero " + res + " � negativo.");
		} else {
			System.out.println("O n�mero " + res + " � neutro.");
		}
	}

}
