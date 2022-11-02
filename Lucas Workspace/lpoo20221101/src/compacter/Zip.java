package compacter;

public class Zip implements Compactador {

	@Override
	public void compactar() {
		System.out.println("Compactando ZIP!");
		
	}

	@Override
	public void descompactar() {
		System.out.println("Descompactando ZIP!");
		
	}
	
}
