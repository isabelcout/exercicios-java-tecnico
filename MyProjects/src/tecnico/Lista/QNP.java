package tecnico.Lista;

import java.util.Scanner;

public class QNP {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero, quantidade;
		quantidade = 0;
		for (i=1; i<=20; i++){
			System.out.println("Digite um n�mero: ");
			numero = input.nextInt();
			if (numero % 2 == 0){
				quantidade++;
				}
			} 
		System.out.println("Quantidade de n�meros digitados que s�o pares: "+quantidade);
	}
}
