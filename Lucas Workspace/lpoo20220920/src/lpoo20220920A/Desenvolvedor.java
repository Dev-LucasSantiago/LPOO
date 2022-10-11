package lpoo20220920A;

public class Desenvolvedor extends Pessoa{
	private float valorHora;

	public void definirHora(float novoValorHora) {
		valorHora = novoValorHora;
	}

	public float consultarValorHora() {
		return valorHora;
	}
}
