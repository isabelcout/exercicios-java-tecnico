package tecnico.Lista;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		
		if (x>0)
			System.out.println("O n�mero � positivo!");
		else 
			System.out.println("O n�mero � negativo!");
	}

}
