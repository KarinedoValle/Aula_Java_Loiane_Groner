package aula_13;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorHora, horasMes, salario, impostoRenda, inss, sindicato, salarioLiquido;
		
		System.out.print("Digite o valor que voc� ganha por hora trabalhada: ");
		valorHora = scan.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas neste m�s: ");
		horasMes = scan.nextDouble();
		
		salario = valorHora * horasMes;
		impostoRenda = salario * 11/100;
		inss = salario * 8/100;
		sindicato = salario * 5/100;
		salarioLiquido = salario - impostoRenda - inss - sindicato;
		
		System.out.println("O valor pago ao INSS �: " + inss);
		System.out.println("O valor pago ao imposto de renda �: " + impostoRenda);
		System.out.println("O valor pago ao sindicato �: " + sindicato);
		System.out.println("O valor do sal�rio l�quido �: " + salarioLiquido);
		System.out.println("\nSal�rio bruto: R$ " + salario + " - IR (11%): R$ " + impostoRenda + " - INSS (8%): R$ " + inss + 
				" - Sindicato (5%): R$ " + sindicato + " = Sal�rio l�quido: R$ " + salarioLiquido);
		

	}

}
