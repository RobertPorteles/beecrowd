package principal;

import loja.Cliente;
import loja.ClienteVip;


public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("Robert", "robertporteles@yahoo.com",0);
		ClienteVip c2 = new ClienteVip("Robert", "robertporteles@yahoo.com",0,10);
		
		c2.adicionaCredito(5);
		c2.fazerCompra(5);
		//c2.quitarDivida();
		c2.fazerCompra(50);
		//c2.adicionaCredito(40);
		c2.adicionaCredito(40);
	}

}
