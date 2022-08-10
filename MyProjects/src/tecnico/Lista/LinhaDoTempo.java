package tecnico.Lista;
import java.util.Scanner;
public class LinhaDoTempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int i, anoN, anoA, idade;
		
		System.out.println("Digite o ano de seu nascimento: ");
		anoN = input.nextInt();
		System.out.println("Digite o ano atual: ");
		anoA = input.nextInt();
		System.out.println("Linha do Tempo: ");
		System.out.println("Ano - Idade");
		for (i=anoN, idade = 0; i <= anoA; i++, idade++) {
			System.out.println(i +" - "+ idade);
		}
		
	}

}
