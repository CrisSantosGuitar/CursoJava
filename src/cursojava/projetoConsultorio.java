package cursojava;

import java.util.Random;
import java.util.Scanner;

public class projetoConsultorio {

	public static void main(String[] args) {
		
		Random codigo = new Random();
		Scanner entrada = new Scanner(System.in);
	
	String str, end;
	int idade, fone;
	
	int senha = codigo.nextInt(100) + 1;
	
	
	System.out.println("Insira o nome do Paciente: ");
	
	str = entrada.nextLine();
	
	System.out.println("Insira sua Idade: ");
	
	idade = entrada.nextInt();
	
	System.out.println("Endereço do Paciente: ");
	end = entrada.next();
	
	System.out.println("Insira o telefone sem ponto: ");
	fone = entrada.nextInt();
	 
	
	System.out.println("Dados completo do paciente:");
	System.out.println("________________________________________________________________");
	System.out.println("Nome é:" + str);
	System.out.println("_________________________________________________________________");
	System.out.println("Endereço é: " + end);
	System.out.println("___________________________________________________________________");
	System.out.println("A idade é: " + idade);
	System.out.println("___________________________________________________________________");
	System.out.println("Contato é: " + fone);
	System.out.println("____________________________________________________________________");
	System.out.println("Código gerado é: " + senha);
	
	entrada.close();
	

	
	}

}
