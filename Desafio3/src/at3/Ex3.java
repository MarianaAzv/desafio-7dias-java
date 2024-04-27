package at3;

import java.util.Scanner;

public class Ex3 {

	public static int Buscar (int vetor[]) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Que numero buscar?");
		String busx = ler.nextLine();
		int busca = Integer.valueOf(busx);
		
		for (int i = 0; i < vetor.length; i++) {
			if(busca == vetor[i]) {
				return 1;
			} 
						
		}
		return 2;
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
        
        int resposta = Buscar(numeros);
        
        if(resposta == 1) {
        	System.out.println("Tem no vetor");
        } else {
        	System.out.println("Nao tem no vetor");
        }
	}

}
