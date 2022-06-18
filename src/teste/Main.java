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

		int pares=0, impares=0;
		for(int i=0;i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.print("Existem "+pares+" números pares, e "+impares+" números ímpares.");
		
	}

}
