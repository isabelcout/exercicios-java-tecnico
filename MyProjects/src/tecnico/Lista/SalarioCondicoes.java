package tecnico.Lista;

import java.util.Scanner;

public class SalarioCondicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int x;
		
			System.out.print("Digite seu sal�rio atual: ");
		x =  input.nextInt();
		if (x <= 645)
			System.out.print("At� 1 sal�rio m�nimo");
		if ((x  > 645) && (x <= 1935))
			System.out.print("At� 3 sal�rios m�nimos");
		if ((x  > 1935) && (x < 3225))
			System.out.print("At� 5 sal�rios m�nimos");
		if (x > 3225)
			System.out.print("Acima de 5 sal�rios m�nimos");
	}

}
