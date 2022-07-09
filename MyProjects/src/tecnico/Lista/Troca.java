package tecnico.Lista;
import java.util.Scanner;
public class Troca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, troca;
		
		System.out.println("Digite um número: ");
		x = input.nextInt();
		System.out.println("Digite outro número: ");
		y = input.nextInt();
		troca = x;
		x = y;
		y = troca;
		System.out.println("Valor de X: " +x);
		System.out.println("Valor de Y: " +y);
	}

}
