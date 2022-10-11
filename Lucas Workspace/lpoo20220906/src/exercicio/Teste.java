package exercicio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu CPF: ");
		long cpf = leitor.nextLong();
		
		Clientes cliente1 = new Clientes(cpf);
		cliente1.codigo = 0001;
		cliente1.nome = "Ana Paula";
	}

}
