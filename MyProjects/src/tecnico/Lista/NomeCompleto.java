package tecnico.Lista;
import java.util.Scanner;
public class NomeCompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Escreva seu nome completo: ");
		String nome = input.nextLine();
		nome = nome.replace(' ', '\n');
		System.out.println("\n" + nome);
	}

}
