package tecnico;

import java.util.Scanner;

public class NumerosIguais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Digite um número: ");
		x = input.nextInt();
		System.out.println("Digite um número: ");
		y = input.nextInt();
		
		if (x==y)
			System.out.println("Os números são iguais!");
		else 
			System.out.println("Os números são diferentes!");
	}

}
