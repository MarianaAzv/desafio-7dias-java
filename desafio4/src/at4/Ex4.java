package at4;

import java.util.Scanner;

public class Ex4 {

	public static int Posicao(int vetor[]) {
	Scanner ler = new Scanner(System.in);
		
		System.out.println("Buscar?");
	    String bx =ler.nextLine();
	    int buscab = Integer.valueOf(bx);
	    
		int rb = -1;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == buscab) {
				rb = i;
				break;
					}		
		}
		return rb;
		
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

    int resposta = Posicao(numeros);
    
    if(resposta != -1) {
    	System.out.println("A posiçao e:"+ resposta);
    } else  {
    	System.out.println(" Nao foi encontrado");
    } 
    
	}

	}


