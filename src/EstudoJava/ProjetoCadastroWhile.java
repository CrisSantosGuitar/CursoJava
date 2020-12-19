package EstudoJava;

import java.util.Scanner;

public class ProjetoCadastroWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 
		String nome, endereco, cidade, bairro ="";
		int numero;
		
		do {
			System.out.print("Insira o nome do pacientes:");
			nome = entrada.nextLine();
		}while(nome.equalsIgnoreCase("sair"));
		
		
		do {
			System.out.print("Insira o endrereço:");
			endereco =entrada.nextLine();
		}while(endereco.equalsIgnoreCase("sair"));
		
		do {
			System.out.print("Cidade que residi: ");
			cidade = entrada.nextLine();
		}while(cidade.equalsIgnoreCase("sair"));
		
		do {
			System.out.print("Bairro onde mora:");
			bairro = entrada.nextLine();
		}while(bairro.equalsIgnoreCase("sair"));
		
		do {
			System.out.print("insira o numero da casa:");
			numero = entrada.nextInt();
		}while(numero < 0);
		
		
		System.out.println("******************* Cadastro Realizado com Sucessso********************************");
		
		
		
		
			

			
			
			entrada.close();
		}

	}


