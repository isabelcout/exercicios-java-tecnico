package tecnico;

import java.util.Scanner;

public class DadosUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String nome, endereco, telefone;
		
		System.out.println("Escreva seu nome: ");
		nome = input.nextLine();
		System.out.println("Escreva seu endere�o: ");
		endereco = input.nextLine();
		System.out.println("Escreva seu telefone: ");
		telefone = input.nextLine();
		System.out.println("Dados do usu�rio: " +nome +"," +endereco +" e " +telefone);
	}

}
