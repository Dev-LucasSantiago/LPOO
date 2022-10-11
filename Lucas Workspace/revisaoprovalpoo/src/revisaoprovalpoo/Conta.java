package revisaoprovalpoo;

public class Conta {
	private int numero;
	private float saldo;
	private float limite;

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void Depositar(float valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	public float sacar (float valor) {
		return saldo = saldo - valor;
	}

}
