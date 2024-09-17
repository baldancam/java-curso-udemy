package fundamentosExerciciosFinais;

import java.util.Scanner;

public class Exercicio2 {

	/**
	 * 1. Criar um programa que leia a temperatura em Fahrenheit e converta para
	 * Celsius.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();

		double conversao = (fahrenheit - 32) / 1.8;

		System.out.print("Valor em Celsius: " + String.format("%.2f", conversao));

		scanner.close();
	}

}
