package ex2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		int num1;
		int	soma=0;
		
		do 
		{	
		System.out.println("Digite um numero inteiro e par:");
		num1 = ler.nextInt();
		
		
		for (int i=1;num1!=0;i++) 
		{
			soma = (soma + num1)/i;
		}
		
		}while(num1 > 0 || num1 < 0);
			
		
		System.out.println(soma);
		
	}

}
