package tecnico.Lista;
import java.util.Scanner;
public class S10_2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int i, numero, soma;
			i = 1;
			soma = 0;
			do{
				System.out.println("Digite um n�mero: ");
				numero = input.nextInt();
				soma = soma + numero;
				i++;
				}while (i<=15);
			System.out.println("A soma dos n�meros digitados �: "+soma);
			}
		}


