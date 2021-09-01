package br.com.generations.exerciciosjava;

import java.util.Arrays;
import java.util.Scanner;

public class ordemCrescente_2 {

	public static void main(String[] args) {

		int nums[] = { 7, 5, 2 };

		Scanner read = new Scanner(System.in);

		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
			
		read.close();
	}

}
