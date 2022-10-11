package Segunda;

public class Analista extends Pessoa {
	private float Salario;
	
	public void defirnirSalario(float NovoSalario) {
		Salario = NovoSalario;
	}
	
	public float consultarSalario() {
		return Salario;
	}
}
