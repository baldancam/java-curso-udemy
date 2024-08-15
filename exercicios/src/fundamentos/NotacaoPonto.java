package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X! X X X";
		
		s = s.replace("X", "Senhora");
		
		s = s.toUpperCase();
		
		s = s.concat("!!!");
				
		System.out.println(s);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!!");
	
		System.out.println(y);
		
	}

}
