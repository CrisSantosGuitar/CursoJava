package EstudoJava;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 String nome ="";
		 String endereço ="";
		 double valor;
		 
		 String dados = nome + endereço;
		 
		 while(dados.equalsIgnoreCase("sair"))
		 System.out.println("Insira seu Nome: ");
		 nome = entrada.nextLine();
		 
		 System.out.println("Insira de Endereço: ");
		 endereço = entrada.nextLine();
		 
		 System.out.println("Insira um código: ");
		 valor = entrada.nextDouble();
		 
		  System.out.println("_________________________________________________________________________________________________");
		 
		System.out.printf("Dados Digitados: " + "\n" + nome + "\n" + endereço + "\n" + valor);
		
		
		String resul = nome + endereço + valor;
		
		
		}
		
		
		 
		 
		
			 
			 

	}


