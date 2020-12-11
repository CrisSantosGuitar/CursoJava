package cursojava;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inclua o dia da semana: ");
		String dia = entrada.next();
		
		
		
		
		if (dia.equalsIgnoreCase("segunda")) { //a função equalsIgnoreCase, a faz a comparação entre duas Strings, quando se usa 
			//essa função não precisamos usar os sinais de comparação.
			System.out.print(1);
		} 
		if (dia.equalsIgnoreCase("terça")) {
			System.out.print(2);
		}
		if (dia.equalsIgnoreCase("quarta")) {
			System.out.print(3);
		}
		if (dia.equalsIgnoreCase("quinta")) {
			System.out.print(4);
		}
		if (dia.equalsIgnoreCase("sexta")) {
			System.out.print(5);
		}
		if (dia.equalsIgnoreCase("sabado")) {
			System.out.print(6);
		}
		
		entrada.close();
		}
		
		
		
		

	}


