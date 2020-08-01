package aula_13;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorHora, horasMes;
		
		System.out.print("Digite o valor que você ganha por hora: ");
		valorHora = scan.nextDouble();
		System.out.print("Digite quantas horas você trabalhou neste mês: ");
		horasMes = scan.nextDouble();
		
		System.out.println("O valor do seu salário para este mês é: " + (valorHora*horasMes));
		

	}

}
