package tecnico.Lista;
import java.util.Scanner;
public class S10_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, numero, soma;
		soma = 0;
		for (i=1; i<=15; i++){
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			soma = soma + numero;
			}
		System.out.println("A soma dos números digitados é: "+soma);
		}
	}

