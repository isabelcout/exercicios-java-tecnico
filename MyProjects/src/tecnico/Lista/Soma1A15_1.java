package tecnico.Lista;

public class Soma1A15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, soma;
		i = 1;
		soma = 0;
		
		while (i<=15){
			soma = soma + i;
			i = i + 1;
			System.out.println("A soma dos n�meros de 1 a 15 �: "+soma);
		}
	}

}
