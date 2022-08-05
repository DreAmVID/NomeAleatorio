package com.pessoais;

public class VetorInverso {
	
	public static void main (String[] args) {
		
		int k;
		k = -1;
		int [] Normal = new int [10];
		int [] Reverso = new int [10];
		
		for(int l = 0; l < 9; l++) {
			
			if (l == 0) {
			
			Normal[l] = 10;
			
						}
			
			
			else {
				
				Normal[l] = Normal[l-1] + 10;
			}
			
		}
		
		for(int j = 8; j >= 0; j = j - 1) {		
			
			k = k + 1;
			
			Reverso[k] = Normal[j];
						
		}
		
		for (int p = 0; p <9; p ++) {
			
			System.out.println("\nValor do vetor normal na posição " + p + ": " + Normal[p]);
			System.out.println("Valor do vetor reverso na posição " + p + ": " + Reverso[p] + "\n");
			
		}
		
	}
}
