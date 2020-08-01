package aula_13;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double velocidade, tamanho;
		
		System.out.print("Digite o tamanho do arquivo em MB: ");
		tamanho = scan.nextDouble();
		
		System.out.print("Digite a velocidade da internet em Mbps: ");
		velocidade = scan.nextDouble();
		
		System.out.println("\nTempo de download em minutos: " + (tamanho/velocidade));

	}

}
