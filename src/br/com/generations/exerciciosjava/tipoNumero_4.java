package br.com.generations.exerciciosjava;

import java.util.Scanner;

public class tipoNumero_4 {

	public static void main(String[] args) {
		double num;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o n�mero:");
		num= read.nextInt();
		
		if(num%2 == 0) {
			//par
			System.out.println("Par");		
			System.out.printf("Raiz Quadrada: %.2f", Math.sqrt(num));
		}else {
			System.out.println("�mpar");
			System.out.printf("Pot�ncia: %.2f", Math.pow(num, 2));
		}
		
		read.close();
	}

}
