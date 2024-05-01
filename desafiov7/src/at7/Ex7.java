package at7;

import java.util.Scanner;
public class Ex7 {
	

				public static int Excluir(int vetor[], int a) {
					Scanner ler = new Scanner(System.in);
						
						int confer =0;
					    		
						for (int i = 0; i < vetor.length; i++) {
							if(vetor[i] == a) {
							for (int j = 0; j < vetor.length-1; j++) {
								vetor[j]= vetor[j+1];
								confer =1;
							}
							
							break;					
							
									}
						}
						
						if(confer == 1) {
							return 1;
						}else {
							return 0;
						}
						
						
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
				    
				    System.out.println("Qual numero deseja excluir?");
				    String bx =ler.nextLine();
				    int buscab = Integer.valueOf(bx);

				    int resposta = Excluir(numeros,buscab);
				    
				    if(resposta == 1) {
				    	System.out.println("Excluido com sucesso");
				    	
				    } else  {
				    	System.out.println(" Nao foi encontrado");
				    } 
				    
					}

			}

