package cursojava;

import java.util.Scanner;

import javax.swing.JButton;

public class projetoApostila {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
			
		int idade; 
		
		
		System.out.println("Insira o dia de nascimento: ");
		dia = entrada.nextInt();
		
		
		System.out.println("Insira o mês de nascimento: ");
		mes = entrada.nextInt();
		
		JButton botao = new JButton();
		
		

		System.out.println("Insira o ano de nascimento: ");
		ano = entrada.nextInt();
		
	
		
		System.out.println("__________________________________________________________________");
		
		System.out.println("Dia: " + dia);
		System.out.println("Mês: " + mes);
		System.out.println("Ano: " + ano);
		
		idade = ano * 365 + mes * 30 + dia;
		
		System.out.println(idade);
		
	}

}
