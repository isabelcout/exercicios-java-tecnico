package tecnico.Lista;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String sexo;
		
		System.out.println("Escreva seu sexo: ");
		sexo = input.nextLine();
		
		if (sexo.equals("M")) {
			System.out.println("Seja bem vindo, senhor!");
      }else{
      if (sexo.equals("F")) {
    	  System.out.println("Seja bem vinda, senhora!");
      	}
      }  
	}  
}
