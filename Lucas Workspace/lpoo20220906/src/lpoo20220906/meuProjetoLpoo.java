package lpoo20220906;

public class meuProjetoLpoo {

	public static void main(String[] args) {
		Conta contaA = new Conta(100);
		
		contaA.limite = 1000;
		contaA.numero = 123456;
		contaA.saldo = 10000;
		
		contaA.valorSaldo();
		
		Conta contaB = new Conta(100);
		
		contaB.limite = 2000;
		contaB.numero = 654321;
		contaB.saldo = 20000;
		
		System.out.println("Saldo conta A: "+ contaA.valorSaldo());
		System.out.println("Saldo conta B: "+ contaB.valorSaldo());
		
		Conta  contaC = new Conta(202);
		
		System.out.println(contaC.limite );
		System.out.println("Saldo conta C: "+ contaC.saldo);
		
		//Testando o construtor padrão
		Conta contaD = new Conta();
	}

}
