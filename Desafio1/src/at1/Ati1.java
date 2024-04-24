package at1;

import java.util.Scanner;

public class Ati1 {

	
	public static   int Soma (int valor[]) {
	int soma = 0;
	
	for (int j = 0; j < valor.length; j++) {
	 soma = soma+ valor[j];	
	}
	return soma;
	}
	
	
	
	
	public static void main(String[] args) {

		Scanner leitura =new Scanner(System.in);
		
		System.out.println("tamamho");
		String n1 = leitura.nextLine();
		int n = Integer.valueOf(n1);
		
		int[] Valor = new int[n];
		
		
		for (int i = 0; i < Valor.length; i++) {
			System.out.println("digite numeros inteiros");
			  String v1 = leitura.nextLine();
		      Valor[i] = Integer.valueOf(v1);
		    		}
		
	int	resultado = Soma(Valor); 
		
		
      System.out.println("A SOMA DOS NUMEROS:"+ resultado);
        
	}

}
