package Aula_15;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		double quantidade, preco = 0, desc = 0.00;
		char cartao = '-';
		String carne = "--", resp = "--";

		System.out.println("Escolha qual carne deseja comprar: ");
		System.out.println("1 - Filé duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		System.out.print("Opção: ");
		op = scan.nextInt();

		// Opção inválida para as carnes
		if (op < 1 || op > 3) {
			System.out.println("\nOpção inválida.");

		} else {

			System.out.print("Digite a quantidade que deseja comprar em quilos: ");
			quantidade = scan.nextDouble();

			System.out.print("A compra será feita com o cartão Tabajara [S/N]? ");
			cartao = scan.next().charAt(0);

			// Opção inválida para os cartões
			if (cartao != 'S' && cartao != 's' && cartao != 'N' && cartao != 'n') {
				System.out.println("\nOpção inválida.");

			} else {
				if (quantidade <= 5) {

					switch (op) {
					case 1:
						carne = "Filé duplo";
						preco = quantidade * 4.9;
						break;
					case 2:
						carne = "Alcatra";
						preco = quantidade * 5.9;
						break;
					case 3:
						carne = "Picanha";
						preco = quantidade * 6.9;
						break;
					}

				} else if (quantidade > 5) {
					switch (op) {
					case 1:
						carne = "Filé duplo";
						preco = quantidade * 5.8;
						break;
					case 2:
						carne = "Alcatra";
						preco = quantidade * 6.8;
						break;
					case 3:
						carne = "Picanha";
						preco = quantidade * 7.8;
						break;
					}

					if (cartao == 'S' || cartao == 's') {
						desc = preco * 5 / 100;
						preco -= desc;
						resp = "Sim";
					} else {
						resp = "Não";
					}

					System.out.println("\n----------Cupom Fiscal----------");
					System.out.println("Carne escolhida: " + carne);
					System.out.println("Quantidade adquirida: " + quantidade);
					System.out.println("Utilizou o cartão Tabajara: " + resp);
					System.out.println("Valor do desconto: " + desc);
					System.out.println("valor a pagar: " + preco);
				}
			}
		}
	}
}
