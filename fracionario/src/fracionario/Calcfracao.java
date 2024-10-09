package fracionario;

public class Calcfracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fracao f1 = new Fracao(25,7);
		Fracao f2 = new Fracao(4,7);
		System.out.println("Soma: "+f1.soma(f2));
		System.out.println("Divisao: "+f1.divisao(f2));
		System.out.println("Subtracao: "+f1.subtracao(f2));
		System.out.println("Multiplicacao: "+f1.multplicacao(f2));
	}

}
