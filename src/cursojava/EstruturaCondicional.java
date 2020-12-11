package cursojava;

public class EstruturaCondicional {
	
	public static void main(String[] args) {
		
		
		int idade =  18;
		
		if (idade  < 16 ) {
			
			System.out.println("Não pode votar");
			
		} else if ( idade >= 18 && idade <= 70) {
			
			System.out.println("Apto a votação");	
				
			} else if( idade == 16 || idade == 17 || idade > 70 ) {
				System.out.println("Voto facultativo");
			}
		}
		
	}
	

			
			

