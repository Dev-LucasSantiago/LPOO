package lpoo20221101;

public class Galinha extends Animal {
	
	public Galinha(String nome) {
		setNome(nome);
	}
	
	@Override
	public void falar() {
		System.out.println("Cocoricó");
	}
	
	public void voar() {
		System.out.println("Galinha Voando!");
	}
}
