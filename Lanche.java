package becrownd;
import java.util.Scanner;
public class Lanche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		
		int codigo = leitura.nextInt();
		int quantidade = leitura.nextInt();
		
		switch(codigo) {
		case 1:
			double hotdog = 4.00;
		System.out.printf("Total: R$: %.2f\n",quantidade*hotdog);
			break;
		case 2:
			double xSalada = 4.50;
			System.out.printf("Total: R$: %.2f\n",quantidade*xSalada);
			break;
		case 3:
			double xBacon = 5.00;
			System.out.printf("Total: R$: %.2f\n",quantidade*xBacon);
			break;
		case 4:
			double torrada = 2.00;
			System.out.printf("Total: R$: %.2f\n",quantidade*torrada);
			break;
		case 5:
			double refrigerante = 1.50;
			System.out.printf("Total: R$: %.2f\n",quantidade*refrigerante);
			break;
		}
		
		
	}

}
