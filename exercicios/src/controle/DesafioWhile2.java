package controle;

import java.util.Scanner;

public class DesafioWhile2 {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);

	 double nota = 0;
	 double total = 0;
	 
	 int contador = 0;
	 
	 do {
		 
		 System.out.println("Informe uma nota:");
		 nota  = entrada.nextDouble();
		 
		 if (nota <= 10 && nota >=0) {
			 total += nota;
			 contador++;
		}
		 
	 } while (nota != -1); {
		 
	 }
	 
	 double media = total / contador;
	 System.out.println("Média = " + media + "\nTotal de notas válidas= " + contador);

	entrada.close();
		
		

	}

}
