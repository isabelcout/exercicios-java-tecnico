package tecnico.Lista;
import java.util.Scanner;
public class NomeFerias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int i, qtdf, tempoS;
		String nome;
		System.out.println("Digite a quantidade de funcion�rios: ");
		qtdf = input.nextInt();
		for (i=1; i<= qtdf; i++){
			System.out.println("Digite o nome do funcionario: ");
			nome = input.next() + input.nextLine();
			System.out.println("Digite o tempo de servi�o em meses: ");
			tempoS = input.nextInt();
			if (tempoS >= 12){
				System.out.println(nome+ " tem direito � f�rias");
			}else{
				System.out.println(nome+ " N�o tem direito � f�rias");
			}
		}
	}

}
