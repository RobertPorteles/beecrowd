package loja;

public class ClienteVip extends Cliente{
	
	float creditoEspecial;
	public ClienteVip(String nome, String email, float saldo, float creditoEspecial) {
		super(nome, email, saldo);
		this.creditoEspecial = creditoEspecial;
	}

	public boolean fazerCompra(float valor) {
		
		if(this.saldo<valor) {
			System.out.println("Você esta sem saldo: "+this.saldo);
			
			if((this.saldo+this.creditoEspecial)<=valor){
				float saldoTotalcomDivida = this.saldo+this.creditoEspecial;
				
				this.saldo = 0;
				this.creditoEspecial = saldoTotalcomDivida-valor;
				System.out.println("Você tem tantos em divida: "+creditoEspecial);
				
				return true;
			
		}
				
				}return true;
		}
		
			
			
		
		
	
	public boolean adicionaCredito(float valor) {
		
		if(this.creditoEspecial<0) {
			this.creditoEspecial += valor;
			System.out.println("Divida total: "+this.creditoEspecial);
			
		}
		
		return true;
	}

	
	
	
	
	
	

}
