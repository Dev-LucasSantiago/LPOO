package lpoo20220906;

public class Conta {
	public int numero;
	public float saldo;
	public float limite = 500;
	
	//Sobrecarga de Construtor
	// Construtor Padrão
	public Conta() {
		
	}
	
	public Conta(float saldoInicial) {
		saldo = saldoInicial;
	}
	
	public Conta(float saldoInicial, float limiteInicial) {
		saldo = saldoInicial;
		limite = limiteInicial;
	}
	
	public float valorSaldo() {
		
		return saldo;
		// retornar valor do saldo da conta
	}
}
