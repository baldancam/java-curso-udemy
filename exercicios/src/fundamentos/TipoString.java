package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde!";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde!"));
		System.out.println(s.equalsIgnoreCase("boa tarde!"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: R$ " + salario + "\n\n");
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: R$ " + salario + "\n\n";
		
		System.out.println(maisUmaFrase);		
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		
		System.out.println(frase);
	}
	
}
