package tecnico;

import java.util.Scanner;

public class NumerosIguais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		System.out.println("Digite um n�mero: ");
		y = input.nextInt();
		
		if (x==y)
			System.out.println("Os n�meros s�o iguais!");
		else 
			System.out.println("Os n�meros s�o diferentes!");
	}

}
