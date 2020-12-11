package cursojava;

import java.util.Scanner;

public class condicional_if {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double livroLinux;
		double livroJava;
		
		System.out.println("Entre com o preço do livro Linux: ");
		livroLinux = entrada.nextDouble();
		
		System.out.println("Entre com o preço do livro Java: ");
		livroJava = entrada.nextDouble();
		
		double total = livroLinux + livroJava;
		
		System.out.println("__________________________________________________________________________________________");

				System.out.println("R$: " + total + " Esse é o valor total da compra");
				
				
				if (total <= 100) {
					
					System.out.println("Esse preço é o menor do mercado");
				} else {
					
					System.out.println("Esse preço está muito alto para a comparar");
				}
				
	}

}
