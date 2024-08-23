package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double parentesesUm = 3 + 2;
		double parentesesDois = 1 - 5;
		double parentesesTres = 2 - 7;
		
		double multiUm = 6 * parentesesUm;
		double multiDois = parentesesDois * parentesesTres;
		double multiTres = 3 * 2;
		
		double elevaUm = Math.pow(multiUm, 2);
				
		double divUm = elevaUm / multiTres;
		double divDois = multiDois / 2;
		
		double elevaDois = Math.pow(divDois, 2);
		
		double subUm = divUm - elevaDois;
				
		double elevaTres = Math.pow(subUm, 3);
		double elevaQuatro = Math.pow(10, 3);
		
		double resultadoFinal = elevaTres / elevaQuatro;
		
		System.out.println("O resultado da operação é = " + resultadoFinal);
	}

}
