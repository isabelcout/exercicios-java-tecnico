package tecnico.Lista;
import java.util.Scanner;
public class Sal�rio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite seu sal�rio: ");
		x = input.nextInt();
		System.out.println("Seu sal�rio �: " +x);
		x = x* 7/100;
		System.out.println("Seu sal�rio aumentou: " +x);
	}

}
