package EstudoJava;

import java.util.Scanner;

public class TesteTemporal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		String str;
		
			System.out.print("Inclua o nome do aluno para ver a nota: ");
			
			String nome = entrada.nextLine();
			
			System.out.println(" Insira a nota do aluno: ");
			
			int nota = entrada.nextInt();
			
			System.out.println("Insira a segunda nota: ");
			
		int nota1 = entrada.nextInt();
		
		System.out.println("resultado da Nota: " + (nota + nota1)/2 );
		
		entrada.close();
			
		
		

	}

}
