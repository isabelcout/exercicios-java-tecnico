package tecnico.Lista;
import java.util.Scanner;
public class Saudação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Escreva seu nome: ");
		nome = input.nextLine();
		System.out.println("Seja bem vindo " +nome +"!");
	}

}
