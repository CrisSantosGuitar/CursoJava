package EstudoJava;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 String nome ="";
		 String endere�o ="";
		 double valor;
		 
		 String dados = nome + endere�o;
		 
		 while(dados.equalsIgnoreCase("sair"))
		 System.out.println("Insira seu Nome: ");
		 nome = entrada.nextLine();
		 
		 System.out.println("Insira de Endere�o: ");
		 endere�o = entrada.nextLine();
		 
		 System.out.println("Insira um c�digo: ");
		 valor = entrada.nextDouble();
		 
		  System.out.println("_________________________________________________________________________________________________");
		 
		System.out.printf("Dados Digitados: " + "\n" + nome + "\n" + endere�o + "\n" + valor);
		
		
		String resul = nome + endere�o + valor;
		
		
		}
		
		
		 
		 
		
			 
			 

	}


