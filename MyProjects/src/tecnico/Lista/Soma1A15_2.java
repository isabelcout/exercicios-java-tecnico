package tecnico.Lista;

public class Soma1A15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, soma;
		i = 1;
		soma = 0;
		
		
		do {
			soma = soma + i;
			i = i + 1;
		} while (i<=15);
			
			System.out.println("A soma dos números de 1 a 15 é: "+soma);
	}	
}

