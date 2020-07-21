/*
 * Escreva um programa que mostre no console uma pirâmide de números, com um número de linhas entre 1 e 9, fornecido pelo usuário. 
 * Caso o número esteja fora do limite, mostrar mensagem de erro e solicitar novamente o número
 */

import java.util.Scanner;

public class Piramide {
	public static void main(String args[]) {

		Scanner ler_num = new Scanner(System.in);
		System.out.print("Informe um numero entre 1 e 9: ");
		int numero = ler_num.nextInt();

		while (numero < 1 || numero > 9) {
			System.out.print("ERRO! NUMERO INFORMADO INCORRETO!!!\n");

			Scanner ler_num_cor = new Scanner(System.in);
			System.out.print("Informe um numero entre 1 e 9: ");
			numero = ler_num_cor.nextInt();
		}

		int base = 1;
		String inicio = "", fim = "", espaco = "";

		while (numero - 1 > espaco.length()) {
			espaco = " " + espaco;
		}
		System.out.println(espaco + inicio + base + fim);

		for (int i = 1; i < numero; i++) {
			inicio += i;
			fim = i + fim;
			base++;

			if (i == numero - 1) {
				espaco = espaco.trim();
				System.out.println(espaco + inicio + base + fim);
			} else {
				espaco = espaco.trim();
				while ((numero - 1) - i > espaco.length()) {
					espaco = " " + espaco;
				}
				System.out.println(espaco + inicio + base + fim);
			}
		}
	}
}