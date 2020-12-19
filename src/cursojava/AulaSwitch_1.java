package cursojava;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class AulaSwitch_1 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Insira a cor desejada");
		String teste = entrada.nextLine();
		
		
	

		switch (teste.toLowerCase()) {

		case "preto":
			System.out.println("Essa cor " + teste + " está em nosso banco de dados");
			break;
		case "branco":
			System.out.println("Essa cor " + teste + " está em nosso banco de dados");
			break;
		case "azul":
			System.out.println("Essa cor " + teste + " está em nosso banco de dados");
			break;
		case "verde":
			System.out.println("Essa cor " + teste + " está em nosso banco de dados");
			break;
			
			default:
				System.out.println("essa cor não consta no banco de dados");
				break;
		}

	}
}
