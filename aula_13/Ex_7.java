package aula_13;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado, area;
		
		System.out.print("Digite o tamanho dos lados do quadrado: ");
		lado = scan.nextDouble();
		
		area = lado*lado;
		
		System.out.println("A �rea de um quadrado com tamanho de lado " + lado + " �: " + area);
		System.out.println("O dobro do valor da �rea �: " + area*2);

	}

}
