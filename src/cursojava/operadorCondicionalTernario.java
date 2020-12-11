package cursojava;

public class operadorCondicionalTernario {

	public static void main(String[] args) {
		
		int a = 5;
		String b = (a == 5)? "a é igual a 5": "a é diferente de 5"; // O usa interrogação é chamada de ternário, onde atribui dos respostas, True e false.;
		// A opção Sring, armazena textos.
		
		System.out.println("resultado: " + b);
			
		
		b = (a == 12)? "a é igual a 12": "a é diferente de 12";
		
			System.out.println("Resultado: " + b);
			
			
			
	}

}
