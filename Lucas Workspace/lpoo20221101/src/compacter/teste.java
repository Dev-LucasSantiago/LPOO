package compacter;

public class teste {

	public static void main(String[] args) {
		Compactador c = new Zip();
		 c.compactar();
		 c.descompactar();
		 
		Compactador cr = new Rar();
		cr.compactar();
		cr.descompactar();
	}

}
