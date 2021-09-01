package br.com.generations.exerciciosjava;

import java.util.Scanner;

public class idadeCategoria_3 {
/*
	10-14 infantil 15-17 juvenil 18-25 adulto
*/

	public static void main(String[] args) {

		int idade;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		idade = read.nextInt();
		
		if(idade >10 && idade <15) {			
			System.out.println("Infantil");
		}else if(idade >14 && idade < 18) {
			System.out.println("Juvenil");
		}else if(idade > 18 && idade< 25) {
			System.out.println("Adulto");			
		}else {
			System.out.println("Não há turmas disponíveis para sua idade");
		}
			
		read.close();
	}

}
