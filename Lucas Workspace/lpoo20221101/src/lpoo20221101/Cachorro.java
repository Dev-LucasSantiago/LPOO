package lpoo20221101;

public class Cachorro extends Animal {
	
	public Cachorro(String nome) {
		setNome(nome);
	}
	
	@Override
	public void falar() {
		System.out.println("Au Au!");
	}
}
