package tecnico.Lista;
import java.util.Scanner;
public class Soma10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i, num, soma;
		i = 1;
		soma = 0;
		while (i<=15){ 
		System.out.println("Digite um n�mero: ");
		num = input.nextInt();
		soma = soma + num;
		i++;
		}
		System.out.println("A soma dos n�meros digitados �: "+soma);
		}
	}

