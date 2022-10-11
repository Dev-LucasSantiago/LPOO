package lpoo20220913;

public class conta {
	public int numero;
	public float saldo;
	
	public boolean Sacar(float valorDoSaque) {
		if(saldo >= valorDoSaque){
			this.saldo -= valorDoSaque;
			return true;
		}else {
			return false;
		}
	}
	
	public float Depositar(float valorDeposito) {
		
		return this.saldo = saldo + valorDeposito;
	}
}
