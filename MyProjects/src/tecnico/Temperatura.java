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
			System.out.print("O clima é frio");
		if ((x  >= 19) && (x <= 23))
			System.out.print("O clima é agradável");
		if ((x  >= 24) && (x <= 35))
			System.out.print("O clima é quente");
		if (x > 35)
			System.out.print("O clima é muito quente");
		
	}

}
