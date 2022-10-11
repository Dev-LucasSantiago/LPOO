package Segunda;

public class Desenvolvedor extends Pessoa {
	private float ValorHora;
	
	public void definirValorHora(float novoValorHora) {
		ValorHora = novoValorHora;
	}
	
	public float consultarValorHora() {
		return ValorHora;
	}
}
