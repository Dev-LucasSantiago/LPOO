package Segunda;

public class Pessoa {
	private String Nome;
	private String CPF;

	public void definirDados(String novoNome,String novoCPF) {
		Nome = novoNome;
		CPF = novoCPF;
	}

	public String consultarNome() {
		return Nome;
	}

	public String consultarCPF() {
		return CPF;
	}

}
