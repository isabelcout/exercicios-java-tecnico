package tecnico;

import java.util.Scanner;

public class Multiplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		
		if (x%5==0)
			System.out.println("O n�mero � multiplo!");
		else 
			System.out.println("O n�mero n�o � multiplo!");
	}

}
