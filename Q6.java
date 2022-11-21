package ex2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner ler = new Scanner(System.in);
				int base = 0, exp = 0;
				int	soma=1;
				
				do 
				{	
				System.out.println("base da expressão:");
				base=ler.nextInt();
				System.out.println("expoente da expressão:");
				exp=ler.nextInt();
				}while(base < 0 || exp < 0);
					
				for (int i=1;i<=exp;i++) {
					soma = soma * base;
				}
				
				System.out.println(soma);

	}
}
