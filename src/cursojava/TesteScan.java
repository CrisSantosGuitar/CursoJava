package cursojava;

import java.util.Scanner;

public class TesteScan {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Insira a nota do Aluno: ");
	double nota = entrada.nextDouble();
		
	System.out.println("insira a segunda nota: ");
	double nota2 = entrada.nextDouble();
	
	System.out.println("Inisira a ultima nota: ");
	double ult = entrada.nextDouble();
	
	double total = nota + nota2 + ult;
	
	System.out.println("__________________________________________________________________________________________________________________");
	
	System.out.printf("\n\nPrimeira nota é: " + nota + "\n\nSegunda nota é: "+ nota2 + "\n\nE a terceira nota é: " +  ult);
	
	System.out.println("\n\n\n\ntotal de notas: " + total);
	
	System.out.println("____________________________________________________________________________________________________________________");
	
	String aprovacao = total >=60 ? "Aprovado" : "Reprovado";
	
	System.out.println("O aluno está: " + aprovacao);
	
	
	
	entrada.close();
	
	
	
		
		
		
		
		
		
	
	}
	
	
	

}
