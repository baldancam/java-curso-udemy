package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
	 Scanner lerNumero =  new Scanner(System.in);
	 
	 System.out.println("Informe o primeiro número:");
	 double num1 = lerNumero.nextDouble();
	 
	 System.out.println("Informe o segundo número:");
	 double num2 = lerNumero.nextDouble();
	 
	 System.out.println("Informe a operação:");
	 String operador = lerNumero.next();
	 
	 double resultado = "+".equals(operador) ? num1 + num2 : 0;
	 resultado = "-".equals(operador) ? num1 - num2 : resultado;
	 resultado = "*".equals(operador) ? num1 * num2 : resultado;
	 resultado = "/".equals(operador) ? num1 / num2 : resultado;
	 resultado = "%".equals(operador) ? num1 % num2 : resultado;

	 System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
	 
	 lerNumero.close();
		
	}

}
