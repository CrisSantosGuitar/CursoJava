package cursojava;

import java.util.Scanner;

public class ScannerTeste {
	public static void main(String[] args) {
		
	
		Scanner texto = new Scanner(System.in); // System.in Captura dados do teclado, tudo oque � digitado.
		
		String str; // o str receber� pque ser� digitado.
		
		System.out.print("entre com seu nome: ");
		
	 		str = texto.nextLine(); //nextLine metodo que vai captura tudo oque ser� digitado no teclado.
	 		
		 System.out.println("Bem vindo ao site do samuca para sua comodidade siga as instru��es: " + str);
		 
		 System.out.println("...............................................................................");
		 
		 System.out.println("Digite um valor: ");
		 
		 int valor = texto.nextInt();
		 
		 System.out.println("Esse � o valor que vc digitou: " + valor );
		 
		 System.out.println("_________________________________________________________________________________");
		 
		 System.out.println("Obrigado por usar nosso sistema");

		 texto.close(); // esse codigo encerra a entrada dados para que n�o seja colocado mais nenhum informa��o.
	}

}
