package tecnico.Lista;
import java.util.Scanner;
public class NomeFerias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int i, qtdf, tempoS;
		String nome;
		System.out.println("Digite a quantidade de funcionários: ");
		qtdf = input.nextInt();
		for (i=1; i<= qtdf; i++){
			System.out.println("Digite o nome do funcionario: ");
			nome = input.next() + input.nextLine();
			System.out.println("Digite o tempo de serviço em meses: ");
			tempoS = input.nextInt();
			if (tempoS >= 12){
				System.out.println(nome+ " tem direito à férias");
			}else{
				System.out.println(nome+ " Não tem direito à férias");
			}
		}
	}

}
