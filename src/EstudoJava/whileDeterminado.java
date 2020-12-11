package EstudoJava;

public class whileDeterminado {

	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 5) {		// enquanto o valor da variável for menor ou igual a 30, ele vai repetir o print
		
			System.out.println( contador);
		
			contador += 4; // com o ++ ele vai fazer o contrador receber sempre mais um... para que quando chegar no valor em questão
		// haja o cancelamento da repetição.
		
		}
		

	}

}
