package cursojava;

import java.util.Scanner;

public class declaracaoConstante {

		private static final double LARGURA = 10.0; // esse metodo deixar como fixo a descrição de largura.
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Entre como o comprimento: ");
			double compr = entrada.nextDouble();
			
			double area = calculaArea(LARGURA, compr);
			System.out.println("A área é: " + area);
			
		}

			private static double calculaArea(double largura, double comprimento) {
				return largura * comprimento;
			}


}
