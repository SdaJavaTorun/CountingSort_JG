package com.sdajava.CountingSort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] tablica = new int[20];
		int[] sumy = new int[20];
		Random generator = new Random();

		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = generator.nextInt(10);
			System.out.printf(tablica[i] + " ");
		}
		int max = 0;
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] > max) {
				max = tablica[i];
			}
		}
		System.out.println();
		int[] tabWszystkich = new int[max+1];
		for (int i = 0; i < max + 1; i++){
			tabWszystkich[i] = i;
			System.out.print(tabWszystkich[i] + " ");
		}
		System.out.println();
		int[] count = new int[max+1];
		for (int i=0; i < count.length; i++){
			count[i] = 0;
		}
		for (int i=0; i < tablica.length; i++){
			for (int j = 0; j < tabWszystkich.length; j++){
				if (tablica[i] == tabWszystkich[j]){
					count[j]++;
				}
			}
		}
		for (int i=0; i < count.length; i++){
			System.out.print(count[i] + " ");
		}
		System.out.println();
		for (int i=0; i < tabWszystkich.length; i++){
			for (int j = 0; j < count[i]; j++){
				System.out.print(tabWszystkich[i] + " ");
			}
		}
	}
}