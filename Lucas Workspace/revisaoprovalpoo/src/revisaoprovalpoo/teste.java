package revisaoprovalpoo;

public class teste {

	public static void main(String[] args) {
		Conta ContaTitular = new Conta();
		
		ContaTitular.setNumero(123456);
		ContaTitular.Depositar(1000);
		ContaTitular.sacar(300);
		System.out.println("Conta: "+ ContaTitular.getNumero());
		System.out.println("Saldo Final: "+ ContaTitular.getSaldo());
		
		Funcionario func = new Funcionario(200);
		func.setNome("João");
		System.out.println("Funcionario: "+func.getNome());
		System.out.println("Salario: "+func.getSalario()); 
	}

}
