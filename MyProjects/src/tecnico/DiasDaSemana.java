package tecnico;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
		
		int x;
		
			System.out.print("Digite um n�mero de 1 a 7: ");
		x =  input.nextInt();
		if (x == 1)
			System.out.print("Hoje � domingo");
		if (x == 2)
			System.out.print("Hoje � segunda-feira");
		if (x == 3)
			System.out.print("Hoje � ter�a-feira");
		if (x == 4)
			System.out.print("Hoje � quarta-feira");
		if (x == 5)
			System.out.print("Hoje � quinta-feira");
		if (x == 6)
			System.out.print("Hoje � sexta-feira");
		if (x == 7)
			System.out.print("Hoje � s�bado");
		
		
	}

}