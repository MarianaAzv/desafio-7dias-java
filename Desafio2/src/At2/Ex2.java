package At2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	
	public static int meiana(int vetor[]) {
		Arrays.sort(vetor);//Pesquisei como utilizar
		int meio = vetor.length /2;
		if(vetor.length % 2 == 0){
			return(vetor[meio-1] + vetor[meio])/2;
				} else {
					return vetor[meio];
				}
	}
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Tamanho");
		String nx = ler.nextLine();
		int n = Integer.valueOf(nx);
		
		int[] numeros = new int[n];
		
		System.out.println("Numeros");
		for (int i = 0; i < numeros.length; i++) {
			String lex = ler.nextLine();
			numeros[i] = Integer.valueOf(lex);
		}
		
		int resultado = meiana(numeros);
		
		System.out.println("O resultado e:"+ resultado);
	}

}
