package becrownd;

import java.io.IOException;
import java.util.Scanner;

public class Esfera {
	public class Main {
		 
	    public static void main(String[] args) {
	 
	    	Scanner leitura = new Scanner(System.in);
			
			double r = leitura.nextDouble();
			double pi =3.14159;
			double formula = (4.0/3)*pi*(r*r*r);
			
			System.out.printf("VOLUME = %.3f\n",formula);
	 
	    }}}

