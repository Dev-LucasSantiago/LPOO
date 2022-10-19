package lpoo20221018;

import java.util.Scanner;

public class Testar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Forma FormaGeometrica = new Forma();
		
		
		System.out.println("Escolha a sua forma geometrica: ");
		System.out.println("	1 - Retângulo");
		System.out.println("	2 - Círculo");
		System.out.println("	3 - Triângulo");
		int tipo = teclado.nextInt();
		
		if(tipo == 1) {
			Forma R = new Retangulo();
			R.desenhar();
		}else if(tipo == 2){
			Forma C = new Circulo();
			C.desenhar();
		}else if(tipo == 3) {
			Forma T = new Triangulo();
			T.desenhar();
		}
		FormaGeometrica.desenhar();
		
		teclado.close();
	}

}
