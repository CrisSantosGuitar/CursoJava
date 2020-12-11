package cursojava;

public class operadoresdeAtribuição {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("Valor Original: " + num);
		num += 3; // nesse caso o num recebe mais 3.
		System.out.println("Valor de Num: " + num);
		num *= 4; // neste caso num recebe * 4
		System.out.println("Valor de num: " + num);
		num /= 2;
		System.out.println("Valor de num: " + num);
		num %= 2;
		System.out.println("Valor de num: " + num);
	}

}
