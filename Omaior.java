package becrownd;
import java.util.Scanner;
public class Omaior {
	 public static void main(String[] args) {
	/*Faça um programa que leia três valores
	 *  e apresente o maior dos três valores lidos 
	 *  seguido da mensagem “eh o maior”.
	 *   Utilize a fórmula:*/
	
	Scanner leitura = new Scanner(System.in);
	int a = leitura.nextInt();
	int b = leitura.nextInt();
	int c = leitura.nextInt();
	
	int maiorAb = Math.max(a, b);
	int maiorAbc = Math.max(maiorAb, c);
	
	System.out.println(maiorAbc+" eh o maior");
	
	
}}
