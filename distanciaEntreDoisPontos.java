package becrownd;
import java.util.Scanner;
public class distanciaEntreDoisPontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		double x1 = leitura.nextDouble();
		double y1 = leitura.nextDouble();
		double x2 = leitura.nextDouble();
		double y2 = leitura.nextDouble();
		
		
		double quadrado = (x2-x1)*(x2-x1);
		double quadrado2 = (y2 - y1) * (y2 - y1);

		
		double soma =  Math.sqrt(quadrado+quadrado2);
		
		System.out.printf("%.4f\n",soma);
	}

}
