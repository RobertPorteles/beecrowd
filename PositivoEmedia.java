package becrownd;
import java.util.Scanner;
public class PositivoEmedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		int count = 0;
		double a;
		double somavalores = 0;
		
		for(int i= 0; i<6; i++) {
			a = leitura.nextDouble();
			
			if(a>0) {
				somavalores += a;
				count++;
				
			}
		}
		double media = somavalores/count;
		
		System.out.println(count+" valores positivos");
		System.out.printf("%.1f\n",media);
	}

}
