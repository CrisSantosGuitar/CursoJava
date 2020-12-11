package cursojava;

import javax.swing.JOptionPane;

public class ConversaoString {
	
	public static void main(String[] args) {
		 String valor1 = JOptionPane.showInputDialog(
				 "Seus dados aqui nessa janela por favor");
		 
		 String valor2 = JOptionPane.showInputDialog(
				 "Seus dados aqui nessa janela por favor");
		 
		 System.out.println(valor1 + valor2 );
		 
		 double numero1 = Double.parseDouble(valor1);
		 double numero2 = Double.parseDouble(valor2);
		 
		 
		 double soma = numero1 + numero2;
		 System.out.println("A soma é" + soma );
		 System.out.println("a média desse valor é " + soma / 2 );
	}

}
