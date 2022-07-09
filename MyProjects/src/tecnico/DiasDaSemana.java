package tecnico;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
		
		int x;
		
			System.out.print("Digite um número de 1 a 7: ");
		x =  input.nextInt();
		if (x == 1)
			System.out.print("Hoje é domingo");
		if (x == 2)
			System.out.print("Hoje é segunda-feira");
		if (x == 3)
			System.out.print("Hoje é terça-feira");
		if (x == 4)
			System.out.print("Hoje é quarta-feira");
		if (x == 5)
			System.out.print("Hoje é quinta-feira");
		if (x == 6)
			System.out.print("Hoje é sexta-feira");
		if (x == 7)
			System.out.print("Hoje é sábado");
		
		
	}

}