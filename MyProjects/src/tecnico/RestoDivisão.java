package tecnico;

import java.util.Scanner;

public class RestoDivis�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y, div, resto;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		System.out.println("Digite outro n�mero: ");
		y = input.nextInt();
		div = x/y;
		System.out.println("A divis�o �: " +div);
		resto = x % y;
		System.out.println("O resto da divis�o �: " +resto);
	}

}
