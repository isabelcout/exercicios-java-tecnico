package tecnico;
import java.util.Scanner;
public class AnosVividos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite sua idade: ");
		x = input.nextInt();
		x = x*365;
		System.out.println("Seus dias vividos são: " +x);
	}

}
