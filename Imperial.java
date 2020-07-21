/* 
 * No sistema imperial são utilizadas as seguintes medidas lineares:
 * 1 pé = 12 polegadas
 * 1 jarda = 3 pés
 * 1 milha = 1760 jardas
 * Faça o programa que converta um valor informado em centímetros para cada uma das unidades do sistema imperial citadas acima.
 */


import java.util.Scanner;

public class Imperial {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Para a conversao, informe uma medida em centimetros: ");
		double medida = ler.nextDouble();

		System.out.println(medida + " centimetro(s) equivale a " + (medida / 2.53995) / 12 + " pes.");
		System.out.println(medida + " centimetro(s) equivale a " + ((medida / 2.53995) / 12) / 3 + " jardas.");
		System.out.println(medida + " centimetro(s) equivale a " + (((medida / 2.53995) / 12) / 3) / 1760 + " milhas.");
	}
}