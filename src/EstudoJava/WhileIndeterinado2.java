package EstudoJava;

import java.util.Scanner;

public class WhileIndeterinado2 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		
		while(!valor.equalsIgnoreCase("sair")) { //equalsIgnoreCase faz a compara��o do valor String
			 System.out.print("Nome para cadastro: ");
			 valor = entrada.nextLine();
			 
			} // essa chave e o fechamento da opera��o While e tem que ser antes de fechamento do Scanner 
		 entrada.close();
		
		

	}

}
