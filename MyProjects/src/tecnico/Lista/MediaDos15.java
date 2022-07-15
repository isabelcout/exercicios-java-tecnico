package tecnico.Lista;
import java.util.Scanner;
public class MediaDos15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero, soma;
		double media;
		soma = 0;
		for (i=1; i<=15; i++){
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			soma = soma + numero;
			}
		media = soma/15.0;
		System.out.println("A média dos números digitados é: "+media);
		}
}
