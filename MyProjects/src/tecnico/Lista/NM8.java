package tecnico.Lista;
import java.util.Scanner;
public class NM8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero, quantidade;
		quantidade = 0;
		for (i=1; i<=20; i++){
			System.out.println("Digite um n�mero: ");
			numero = input.nextInt();
			if (numero > 8){
				quantidade++;
				}
			}
		System.out.println("Quantidade de n�meros digitados maiores que 8: "+quantidade);
	}
}
