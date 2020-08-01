package aula_13;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado, area;
		
		System.out.print("Digite o tamanho dos lados do quadrado: ");
		lado = scan.nextDouble();
		
		area = lado*lado;
		
		System.out.println("A área de um quadrado com tamanho de lado " + lado + " é: " + area);
		System.out.println("O dobro do valor da área é: " + area*2);

	}

}
