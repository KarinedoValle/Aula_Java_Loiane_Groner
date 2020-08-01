package aula_13;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		double n3;
		
		System.out.print("Digite o primeiro número inteiro: ");
		n1 = scan.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		n2 = scan.nextInt();
		System.out.print("Digite um número real: ");
		n3 = scan.nextDouble();
		
		System.out.println("\nO produto do dobro do primeiro com metade do segundo: " + ((2*n1)*(n2/2)));
		System.out.println("A soma do triplo do primeiro com o terceiro: " + ((3*n1)+(n3)));
		System.out.println("O terceiro elevado ao cubo: " + (Math.pow(n3, 3)));

	}

}
