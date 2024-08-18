package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasenha:  %d %d %d %d %d %d \n\n", 1, 2, 3, 4, 5, 6);

		System.out.printf("Salário: %.1f \n\n", 1234.5978);
		System.out.printf("Nome: %s \n\n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite o seu nome: ");
		int idade = entrada.nextInt();
		
		System.out.println("\n\nNome Completo: " + nome + " " + sobrenome + "\nCom " + idade + " anos de idade");
		
		entrada.close();
		
	}

}
