package EstudoJava;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchSemBreak {

	public static void main(String[] args) {

		//String nome = JOptionPane.showInputDialog("Insira a Primeira nota:");
		
		String nome2 = "";
		
		
		//int nota = Integer.parseInt(nome);

		/*switch (nome) {
		case "Cristiano": //
			System.out.println("Esse nome esta no banco de dados");
			break;
		case "Maria":
			System.out.println("Esse nome esta no banco de dados");
			break;
		case "Rogério":
			System.out.println("Esse nome esta no banco de dados");
			break;
		case "Andressa":
			System.out.println("Esse nome esta no banco de dados");
			break;
		case "Gonçalo":
			System.out.println("Esse nome esta no banco de dados");
			break;
		case "Muriel":
			System.out.println("Esse nome esta no banco de dados");
			break;
		case "Paora":
			System.out.println("Esse nome esta no banco de dados");
			break;
		default: // essa linha de codigo é enserida para fazer encerrar o switch
			System.out.println("esse nome não está em nosso banco"); // mensagem que aparecerá quando nenhuma das
																		// informações forem
			// encontradas
		}*/

		while (!nome2.equalsIgnoreCase("sair")) {
			nome2 = JOptionPane.showInputDialog(null,"Insira o Nome: ","Cadastro",JOptionPane.INFORMATION_MESSAGE);
			System.out.println();

			switch (nome2) {
			case "Cristiano": //
				System.out.println("O nome " + nome2  + " está no bando de dados");
				break;
			case "Maria":
				System.out.println("Esse nome esta no banco de dados");
				break;
			case "Rogério":
				System.out.println("Esse nome esta no banco de dados");
				break;
			case "Andressa":
				System.out.println("Esse nome esta no banco de dados");
				break;
			case "Gonçalo":
				System.out.println("Esse nome esta no banco de dados");
				break;
			case "Muriel":
				System.out.println("Esse nome esta no banco de dados");
				break;
			case "Paora":
				System.out.println("Esse nome esta no banco de dados");
				break;
			default: // essa linha de codigo é enserida para fazer encerrar o switch
				System.out.println("esse nome não está em nosso banco"); // mensagem que aparecerá quando nenhuma das
																			// informações forem
				// encontradas
			}
		}
		
	}
}
		//entrada.close();

	


