package EstudoJava;

import javax.swing.JOptionPane;

import cursojava.Joption;
// JOption só recebe string...

public class TreinoJOptionPane {

	public static void main(String[] args) {

		String nome = ""; // as variaveis tem que ser declarada como Strings
		String valor = "";

		/*
		 * nomes = JOptionPane.showInputDialog("insira aqui seu nome: ");
		 * System.out.println(nomes);
		 * 
		 * valor = JOptionPane.showInputDialog("IDade aqui: "); int idade =
		 * Integer.parseInt(valor); //esse codigo faz com que, a variável String seja
		 * convertida para Int, valor inteiro.....
		 * 
		 * System.out.println("A idade digitada é: " + idade);
		 */

		while (!nome.equalsIgnoreCase("sair")) {
			nome = JOptionPane.showInputDialog("Insira aqui seu nome: ");
			//System.out.println();

			
			
			if (nome != "") {
				System.out.println("Nome digitado: " + nome);
				
				
				
				System.out.println();
				
			
			}
		}

	}

}
