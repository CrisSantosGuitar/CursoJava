package cursojava;

import java.util.Scanner;

public class whileAula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome ou s para sair: ");
		nome = entrada.nextLine();
		
		while (!nome.equals("s")) {
			System.out.printf("Bem-vindo %s\n: ", nome);
			System.out.println("Digite seu nome ou s para sair: ");
			nome = entrada.nextLine();			
		}
			System.out.println("Fim da execu��o");
			
			entrada.close();
	}

}
