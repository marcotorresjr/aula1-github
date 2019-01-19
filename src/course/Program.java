package course;

import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Quantos produtos deseja cadastrar?");
		int qtd = sc.nextInt();
		
		Produto[] produtos = new Produto[qtd];
		float total = 0;
		
		for(int i=0;i<qtd;i++) {
			produtos[i] = new Produto();
			System.out.println("Digite o nome do produto " + i + " :");
			produtos[i].nome = sc.next();			
			System.out.println("Digite o preço do produto " + i + " :");
			produtos[i].valor = sc.nextFloat();
			
			total = total + produtos[i].valor;			
		}
		
		float media = total/qtd;
		
		System.out.println("A media dos valores dos produtos é: " + media);		
		
		sc.close();
	}
	
}
