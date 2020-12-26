package EstudoJava;

import java.util.Scanner;

public class TabelaDeNotas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com a nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("__________________________________________________________________\n\n");
		
		
		System.out.println("Insira a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("__________________________________________________________________\n\n");
		
		System.out.println("Insira a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("__________________________________________________________________\n\n");
		
		
		System.out.println("Insira a Quarta nota: ");
		double nota4 = scan.nextDouble();
		
		System.out.println("__________________________________________________________________\n\n");
		
		double resumo = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média do aluno nesse semestre foi: " + resumo);
		
		
		System.out.println("____________________________________________________________________\n\n");
		
		
		
		//double resultado = resumo;
		
		
		if(resumo <= 4) {
			
		System.out.println("O Aluno está Reprovado");
		} else if (resumo >=5 && resumo < 7) {
			System.out.println("Aluno em recuperção");
		}else {
			System.out.println("Aluno Aprovado");
		}
		
		
	}

}
