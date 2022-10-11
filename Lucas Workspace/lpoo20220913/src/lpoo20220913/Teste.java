package lpoo20220913;

public class Teste {

	public static void main(String[] args) {
		conta contaA = new conta();
		
		contaA.saldo = 100;
		
		if(contaA.Sacar(10)) {
			System.out.println("Saque Realizade com Sucesso!");
		}else {
			System.out.println("Saque não Realizado!");
		}
		
		System.out.println("Saldo da conta é: "+contaA.saldo+" Reais");
		
		contaA.Depositar(50);
		System.out.println("Saldo da conta é: "+contaA.saldo+" Reais");

	}

}
