package tecnico.Lista;
import java.util.Scanner;
public class Multiplica��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x,y, multi;
		
		System.out.println("Digite um n�mero: ");
		x = input.nextInt();
		System.out.println("Digite outro n�mero: ");
		y = input.nextInt();
		multi = x*y;
		System.out.println("A multiplica��o desses n�meros s�o: " +multi);
		
	}

}
