package br.com.generation.aula02;

import java.util.Scanner;

public class ex1 {
	
		public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);	
		
		int a, b, c; 
		
		System.out.println("Digite um valor para A : ");
		a = leia.nextInt();
		
		System.out.println("Digite um valor para B : ");
		b = leia.nextInt();
		
		System.out.println("Digite um valor para C : ");
		c = leia.nextInt();
				
		if(a<b && b<c) { 
			
			System.out.println("C é o maior");
		} 
		
		else if(b<a && a<c){ 
			
			System.out.println("C é o maior");
			
		}
		
		else if(c<b && b<a){ 
			
			System.out.println("A é o maior");
			
		}
		
		else if(b<c && c<a){ 
			
			System.out.println("A é o maior");
			
		}
		
		else if(c<a && a<b){ 
			
			System.out.println("B é o maior");
			
		}
		
		else if(a<c && c<b){ 
			
			System.out.println("B é o maior");
			
		}
		
	}

}
