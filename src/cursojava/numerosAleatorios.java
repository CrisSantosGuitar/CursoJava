package cursojava;

import java.util.Random;
			//metodo Random gera numeros aleatorios 

public class numerosAleatorios {

	public static void main(String[] args) {
		
			Random aleatorio = new Random();
			
			int valor = aleatorio.nextInt(30) + 1; // esse valor 30 determina que o c�digo gerado vai de "0" a "29".
											   // Para que o valor conte at� o valor 30 devemos incluir a soma de + 1,
			
			// para fazer a opera��o com valores com casas decimais, alteramos o "int", para "float", e nextInt, para nextFloat.
			// para fazer que a fun��o nextFloat gere n�meros at� 100, colocamos ( * 100) no final.
			
		System.out.println("Numero gerado: " + valor );
	}

}
