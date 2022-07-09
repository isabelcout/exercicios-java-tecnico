package tecnico.Lista;
import java.util.Scanner;
public class DolarReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Scanner input = new Scanner(System.in);
			   double real, dolar, cd;
			   
			   System.out.println("Digite o valor em real: ");
			   real = input.nextDouble();
			   System.out.println("Digite a cotação em dolar: ");
			   cd = input.nextDouble();
			   dolar = real / cd;
			   System.out.println("O valor em dolar é: " +dolar);
			   real = dolar * cd;
			   System.out.println("O valor em real é: " +real);
			  

	}

}
