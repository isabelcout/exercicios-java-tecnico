package tecnico.Lista;

import java.util.Scanner;

public class SalarioCondicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int x;
		
			System.out.print("Digite seu salário atual: ");
		x =  input.nextInt();
		if (x <= 645)
			System.out.print("Até 1 salário mínimo");
		if ((x  > 645) && (x <= 1935))
			System.out.print("Até 3 salários mínimos");
		if ((x  > 1935) && (x < 3225))
			System.out.print("Até 5 salários mínimos");
		if (x > 3225)
			System.out.print("Acima de 5 salários mínimos");
	}

}
