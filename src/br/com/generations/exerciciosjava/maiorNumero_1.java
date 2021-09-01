package br.com.generations.exerciciosjava;

import java.util.Scanner;

public class maiorNumero_1 {

	public static void main(String[] args) {
		int num1, num2, num3,maior = 0;

		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o 1º numero: ");
		num1 = read.nextInt();
		
		System.out.print("Digite o 2º numero: ");
		num2 = read.nextInt();
		
		System.out.print("Digite o 3º numero: ");
		num3 = read.nextInt();
		
		if(num1 > maior) {			
			maior = num1;			
		}
		if(num2 > maior){
			maior = num2;
		}
		if(num3 > maior) {
			maior = num3;
		}		
		
		System.out.println("Maior número é " + maior);
		read.close();
	}

}
