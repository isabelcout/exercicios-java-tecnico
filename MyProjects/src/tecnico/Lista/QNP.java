package tecnico.Lista;

import java.util.Scanner;

public class QNP {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero, quantidade;
		quantidade = 0;
		for (i=1; i<=20; i++){
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			if (numero % 2 == 0){
				quantidade++;
				}
			} 
		System.out.println("Quantidade de números digitados que são pares: "+quantidade);
	}
}
