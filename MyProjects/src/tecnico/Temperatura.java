package tecnico;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
		
		int x;
		
			System.out.print("Digite a temperatura atual: ");
		x =  input.nextInt();
		if (x <= 18)
			System.out.print("O clima � frio");
		if ((x  >= 19) && (x <= 23))
			System.out.print("O clima � agrad�vel");
		if ((x  >= 24) && (x <= 35))
			System.out.print("O clima � quente");
		if (x > 35)
			System.out.print("O clima � muito quente");
		
	}

}
