package LendoUmCheque;

import java.util.Scanner;

public class Principal {
	// Vou pensar de forma engessada, depois eu penso de forma dinamica
	public static int[] newArray = new int[12];

	public static void main(String[] args) {
		int[] arrayNumeros = { 100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150 };
		
		System.out.println("O array possui tamanho: " + arrayNumeros.length);

		for (int posicao = 0; posicao < arrayNumeros.length; posicao++) {
			if (posicao <= 4) {
				VerificaValor(posicao, arrayNumeros[posicao]);
			} else if (posicao > 4 && posicao < 7) {
				VerificaValor(posicao, arrayNumeros[posicao]);
			} else if (posicao >= 7 && posicao <= 11) {
				VerificaValor(posicao, arrayNumeros[posicao]);
			}
		}
	}

	public static void VerificaValor(int posicao, int vlArray) {
		newArray[posicao] = vlArray;
		if (posicao == 4) {
			System.out.println(newArray[0] + " " + newArray[1] + " " + newArray[2] + " " + newArray[3]);
			System.out.println("[" +newArray[0] + " - " + newArray[3]+ "]");
		}
		if (posicao == 7) { 
			System.out.println(newArray[4] + " " + newArray[5] + " " + newArray[6] + " " + newArray[7]);
			System.out.println("[" +newArray[4] + " - " + newArray[7]+ "]");
		}
		if (posicao == 11) {
			System.out.println(newArray[8] + " " + newArray[9] + " " + newArray[10] + " " + newArray[11]);
			System.out.println("[" + newArray[8] + " - " + newArray[11] + "]");
		}
	}
}