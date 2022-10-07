
public class Analista extends Pessoa{
	
	private float salario;
	
	public void definirSalario(float novoSalario) {
		salario = novoSalario;
	}
	
	public float consultarSalario() {
		return salario;
	}

}
