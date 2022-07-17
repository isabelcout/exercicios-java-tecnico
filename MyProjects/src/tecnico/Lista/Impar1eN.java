package tecnico.Lista;
import java.util.Scanner;
public class Impar1eN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero;
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		System.out.println("Os números ímpares entre 1 e "+ numero+ " são: ");
		for (i=1; i<=numero; i = i + 2){
			System.out.println(i);
			} 
	}
}
