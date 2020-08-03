package aula_15;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salarioBruto, sindicato, fgts, valorHora, horasTrabalhadas, inss, ir = 0, totalDescontos;
		
		System.out.print("Digite o valor por hora trabalhada do colaborador: ");
		valorHora = scan.nextDouble();
		System.out.print("Digite a quantidade de horas trabalhadas cumpridas pelo colaborador: ");
		horasTrabalhadas = scan.nextDouble();
		
		salarioBruto = valorHora*horasTrabalhadas;
		sindicato = salarioBruto * 3/100;
		fgts = salarioBruto * 11/100; //Não é descontado do salário
		inss = salarioBruto * 10/100;
		
		if(salarioBruto <= 900) {
			ir = 0;
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = salarioBruto * 0.1;
		} else if(salarioBruto > 2500) {
			ir = salarioBruto * 0.2;
		}
		
		totalDescontos = sindicato + inss + ir;
		
		//No exemplo não tem o sindicato e no enunciado não tem o INSS, coloquei os dois
		System.out.println("\nSalário bruto: Valor da hora = (" + valorHora + ") * Horas trabalhadas = (" + horasTrabalhadas + ")");
		System.out.println("(-) IR (" + (ir*100) + "%): R$ " + ir);
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("(-) Sindicato (3%): R$ " + sindicato);
		System.out.println("FGTS (11%): R$ " + fgts);
		System.out.println("Total de descontos: R$ " + totalDescontos);
		System.out.println("Salário líquido: R$ " + (salarioBruto - totalDescontos));

	}

}
