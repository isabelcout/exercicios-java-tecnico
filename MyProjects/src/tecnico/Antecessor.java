package tecnico;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		x = x - 1;
		System.out.println("Seu antecessor �: " +x);
	}

}
