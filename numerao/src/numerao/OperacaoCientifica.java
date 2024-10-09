package numerao;

import java.math.BigInteger;

public class OperacaoCientifica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numerao n1 = new Numerao(new BigInteger("350"));
		Numerao n2 = new Numerao(new BigInteger("971"));
		System.out.println(n1.soma(n2));
	}

}
