package becrownd;
import java.util.Scanner;
public class SubstituicaoDeVetoresI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];
		x= new int[10];
		
		Scanner leitura = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			
			x[i] = leitura.nextInt();
			
			if(x[i] <= 0) {
				x[i] =1;	
			}
			
		}
		for(int i=0; i<10; i++) {
			System.out.println("X[" + i + "] = " + x[i]);
		}
		leitura.close();
	}

}
