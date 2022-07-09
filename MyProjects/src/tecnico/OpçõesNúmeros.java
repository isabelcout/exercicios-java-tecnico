package tecnico;

import java.util.Scanner;

public class OpçõesNúmeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int x, y, op, resultado;
		System.out.print("Digite um número: ");
		x = input.nextInt();
		System.out.print("Digite outro número: ");
		y = input.nextInt();
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Somar ");
		System.out.println("2 - Subtrair ");
		System.out.println("3 - Multiplicar ");
		System.out.println("4 - Dividir ");
		op = input.nextInt();
		switch (op){
		case 1:
		resultado = x + y;
		System.out.println("O resultado é: "+ resultado);
		break;
		case 2:
		resultado = x - y;
		System.out.println("O resultado é: "+ resultado);
		break;
		case 3:
		resultado = x * y;
		System.out.println("O resultado é: "+ resultado);
		break;
		case 4:
		resultado = x / y;
		System.out.println("O resultado é: "+ resultado);
		break;
		default:
		System.out.println("Opção inválida");
		}
	}

}
