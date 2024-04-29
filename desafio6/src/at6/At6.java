package at6;
import java.util.Scanner;

public class At6 {
	
		
		public static int Maior(int vetor[]) {
			
		int	ma = -9999;
			
			for (int i = 0; i < vetor.length; i++) {
				if(vetor[i]> ma) {
					ma =vetor[i];
				}
			
			}
			return ma;
			
		}
		
		public static int Menor(int vetorme[]){
		int me = 9999;
		
		for (int i = 0; i < vetorme.length; i++) {
			if(vetorme[i]< me) {
				me= vetorme[i];
			}
			
		}
		return me;
		
		}
		
		
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Tamanho");
		    String nx =ler.nextLine();
		    int n = Integer.valueOf(nx);
		    
		    int[] numeros = new int[n];
		    
		    System.out.println("Numeros");
		    for (int i = 0; i < numeros.length; i++) {
				String lex = ler.nextLine();
				numeros[i]= Integer.valueOf(lex);
			}

		    int respostamaior = Maior(numeros);
		    int respostamenor = Menor(numeros);

		    
		    System.out.println("O maior numero do vetor e:"+ respostamaior);
		    System.out.println("O menor numero do vetor e:"+respostamenor);
		}

	}

