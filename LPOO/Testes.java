
public class Testes {

	public static void main(String[] args) {
		
		Conta contaTitular = new Conta();
		contaTitular.setNumero(123456);
		contaTitular.depositar(1000);
		contaTitular.sacar(300);
		System.out.println("CONTA: " + contaTitular.getNumero());
		System.out.println("Saldo final: " + contaTitular.getSaldo());

		
		Funcionario func = new Funcionario(200);
		func.setNome("João");
		System.out.println("Funcionário: " + func.getNome());
		System.out.println("Salário: " + func.getSalario());
		
		
	}

}
