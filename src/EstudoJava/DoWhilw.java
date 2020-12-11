package EstudoJava;

import java.util.Scanner;

public class DoWhilw {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		do {
			System.out.println("Digite o Nome: "); // linha de entrada de dados
			System.out.println("quer sair?"); // texto fixo 
				valor = entrada.nextLine();
			
		} while(!valor.equalsIgnoreCase("sim")); // código de loop
		
		
		System.out.println("Valeu");
		
		
		
			entrada.close();
	}

}
