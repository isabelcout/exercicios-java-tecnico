package tecnico.Lista;
import java.util.Scanner;
public class Multiplicação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y, multi;
		
		System.out.println("Digite um número: ");
		x = input.nextInt();
		System.out.println("Digite outro número: ");
		y = input.nextInt();
		multi = x*y;
		System.out.println("A multiplicação desses números são: " +multi);
		
	}

}
