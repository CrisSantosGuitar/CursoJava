package cursojava;

import javax.swing.JOptionPane;

public class Joption {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Insira a Primeira nota:");
		int nota = Integer.parseInt(valor);
		
		System.out.println("Insira a nota do Aluno: " + nota);
		
		String valor1 = JOptionPane.showInputDialog("Insira a Segunda nota:");
		int nota1 = Integer.parseInt(valor1);
		
		System.out.println("Insira a nota do Aluno: " + nota1);
		
		String valor2 = JOptionPane.showInputDialog("Insira a terceira nota:");
		int nota2 = Integer.parseInt(valor2);
		
		System.out.println("Insira a nota do Aluno: " + nota2);
			
	
		
		double total = nota + nota1 + nota2;
		
		System.out.println("__________________________________________________________________________________________________________________");
		
		System.out.printf("\n\nPrimeira nota é: " + nota + "\n\nSegunda nota é: "+ nota1 + "\n\nE a terceira nota é: " +  nota2);
		
		System.out.println("\n\n\n\ntotal de notas: " + total);
		
		System.out.println("____________________________________________________________________________________________________________________");
		
		String aprovacao = total >=60 ? "Aprovado" : "Reprovado";
		
		System.out.println("O aluno está: " + aprovacao);
		
		

	}





	}


