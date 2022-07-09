package tecnico;

import java.util.Scanner;

public class RestoDivisão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y, div, resto;
		
		System.out.println("Digite um número: ");
		x = input.nextInt();
		System.out.println("Digite outro número: ");
		y = input.nextInt();
		div = x/y;
		System.out.println("A divisão é: " +div);
		resto = x % y;
		System.out.println("O resto da divisão é: " +resto);
	}

}
