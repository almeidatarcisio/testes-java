package teste;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("Digite um numero inteiro: ");
			numeros[i] = ler.nextInt();
		}

		int soma=0;
		for(int i=0;i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				soma++;
			}
		}
		System.out.print("Existem "+soma+" números pares.");
		
	}

}
