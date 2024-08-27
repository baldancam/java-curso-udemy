package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.err.println(condicao1 && condicao2);
		System.err.println(condicao1 || condicao2);
		System.err.println(condicao1 ^ condicao2);
		System.err.println(!condicao1);
		System.err.println(!condicao2);
		
		
		System.err.println("\nTabela verdade E (AND)");
		System.err.println(true && true);
		System.err.println(true && false);
		//System.err.println(false && true);
		//System.err.println(false && false);
		
		
		System.err.println("\nTabela verdade OU (OR)");
		//System.err.println(true || true);
		//System.err.println(true || false);
		System.err.println(false || true);
		System.err.println(false || false);
		
		System.err.println("\nTabela verdade OU Exclusivo (XOR)");
		System.err.println(true ^ true);
		System.err.println(true ^ false);
		System.err.println(false ^ true);
		System.err.println(false ^ false);
		
		System.err.println("\nTabela verdade NOT");
		System.err.println(!true);
		System.err.println(!false);
		
		
		
		
		
	}
	
	

}
