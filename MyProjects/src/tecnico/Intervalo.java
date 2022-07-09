package tecnico;
import java.util.Scanner;
public class Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int x, y, z;
		
			System.out.print("Digite o valor de x: ");
		x =  input.nextInt();
			System.out.print("Digite o valor de y: ");
		y = input.nextInt();
			System.out.print("Digite o valor de z: ");
		z = input.nextInt();
		if ((z >= x) && (z <= y)){
			System.out.print("O valor "+ z+ " pertence ao intervalo ["+ x+ ", "+
		y+ "]");
		}else{
			System.out.print("O valor "+ z+ " não pertence ao intervalo ["+ x+ ", "+ y+ "]");
	}

	}

}
