package lpoo20221101;

public class testes {

	public static void main(String[] args) {
		Animal MeuAnimal = new Cachorro("Rex");
		
		MeuAnimal.falar();
		
		Fazendeiro f = new Fazendeiro();
		f.alimentar(MeuAnimal);
		
		MeuAnimal = new Galinha("Josefina");
		f.alimentar(MeuAnimal);
	}

}
