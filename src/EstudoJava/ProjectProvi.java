package EstudoJava;

import javax.swing.JOptionPane;

//import java.util.Scanner;

//import javax.swing.JOptionPane;

//import cursojava.Joption;

//import cursojava.Joption;

public class ProjectProvi {

	public static void main(String[] args) {

		String nome = "";

		while (!nome.equalsIgnoreCase("sair")) {
			nome = JOptionPane.showInputDialog("Digite seus dados");
			System.out.println("nome digitado: " + nome);

			//if (nome == "sair") {
				System.out.println("------------------------");
			}
		
		if(nome =="sair") {
			System.out.println("obrigado por usar nosso sistema");
		}
		}

	}
//}