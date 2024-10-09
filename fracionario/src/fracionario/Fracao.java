package fracionario;

public class Fracao {
	
	int numerador;
	int denominador;
	public Fracao(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public Fracao soma(Fracao outro) {
		if(this.denominador == outro.denominador) {
			int num= this.numerador+outro.numerador;
			int den= this.denominador;
			
			return new Fracao(num,den).simplifica();
			
		}else {
		int num= this.numerador*outro.denominador + outro.numerador*this.denominador;
		int den= this.denominador*outro.denominador;
		
		return new Fracao(num,den).simplifica();
		
		}	
	}
	public Fracao subtracao(Fracao outro) {
		if(outro.denominador==this.denominador) {
			
			int num=this.numerador-outro.numerador;
			int den=this.denominador;
			return new Fracao(num,den).simplifica();
			
		}else {
			int num= this.numerador*outro.denominador - outro.numerador*this.denominador;
			int den= this.denominador*outro.denominador;
			return new Fracao(num,den).simplifica();
			
		}
	}
	public Fracao multplicacao(Fracao outro) {
		int num= this.numerador*outro.numerador;
		int den= this.denominador*outro.denominador;
		return new Fracao(num,den).simplifica();
		
	}
	public Fracao divisao(Fracao outro) {
		int num = this.numerador * outro.denominador;
		int den = this.denominador * outro.numerador;
		return new Fracao(num,den).simplifica();
		
	}
	public int mdc(int a, int b) {
		while (b != 0){
			int resto = a%b;
			a = b;
			b = resto;
			}
		return a;
	}
	public Fracao simplifica() {
		int mdcnew = mdc(numerador,denominador);
		return new Fracao(numerador/mdcnew, denominador/mdcnew);
	}
	 @Override
	    public String toString() {
	        return numerador + "/" + denominador;
	    }
	
	
	
	
}
