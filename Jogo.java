/*
 * O jogo Adivinha Número consiste de dois participantes que devem adivinhar um número sorteado de 1 a 1000. 
 * A cada turno, um jogador tem a chance de tentar adivinhar o número. Ao errar o palpite, o computador indica se o número secreto é maior ou menor e passa a vez para o oponente. 
 * Seu programa deverá perguntar o nome dos dois jogadores e sortear um deles para iniciar o jogo. 
 */

import java.util.Scanner;
import java.util.Random;

public class Jogo {
	public static void main(String args[]) {

		int num;

		System.out.print("\n******* Bem-vindo ao Jogo de Adivinhacao *******\n\n");

		Scanner ler = new Scanner(System.in);
		String jogador1, jogador2;

		System.out.printf("Informe o nome de dois participantes:\n");
		jogador1 = ler.nextLine();
		jogador2 = ler.nextLine();

		Random participante = new Random();
		String[] jogadores = { jogador1, jogador2 };
		String jogador = jogadores[participante.nextInt(jogadores.length)];
		System.out.printf("JOGADOR(a) sorteado(a) foi: %s \n", jogador);

		Random numero = new Random();
		int num_sorte = numero.nextInt(1000) + 1;

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("Palpite de %s: ", jogador);
			num = scanner.nextInt();

			if (num < num_sorte) {
				System.out.println("Numero é maior!");
			}

			else {
				if (num > num_sorte) {
					System.out.println("Numero é menor!");
				} else {
					System.out.printf("\nO NUMERO %d ESTA CORRETO! \n***** PARABENS %s! *****  \n", num_sorte, jogador);
				}
			}

			if (jogador == jogador1) {
				jogador = jogador2;
			} else {
				if (jogador == jogador2) {
					jogador = jogador1;
				}
			}

		} while (num != num_sorte);
	}
}
