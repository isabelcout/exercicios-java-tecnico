package tecnico.Lista;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		System.out.println("Digite um n�mero: ");
		y = input.nextInt();
		
		if (x>y)
			System.out.println("O primeiro n�mero � o maior!");
		else 
			System.out.println("O segundo n�mero � o maior!");
	}

}
