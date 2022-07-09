package tecnico.Lista;
import java.util.Scanner;
public class Salário {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite seu salário: ");
		x = input.nextInt();
		System.out.println("Seu salário é: " +x);
		x = x* 7/100;
		System.out.println("Seu salário aumentou: " +x);
	}

}
