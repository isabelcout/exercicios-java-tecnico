package tecnico.Lista;
import java.util.Scanner;
public class Impar1eN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero;
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		System.out.println("Os n�meros �mpares entre 1 e "+ numero+ " s�o: ");
		for (i=1; i<=numero; i = i + 2){
			System.out.println(i);
			} 
	}
}
