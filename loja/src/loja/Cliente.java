package loja;

public class Cliente {
	protected String nome;
	protected String email;
	protected float saldo;
	
	public Cliente(String nome, String email, float saldo) {
		super();
		this.nome = nome;
		this.email = email;
		this.saldo = saldo;
	}
	
	public boolean fazerCompra(float valor) {
		if(this.saldo ==0 || this.saldo<valor ) {
			System.out.println("Você esta sem saldo: "+this.saldo);
			return false;
			
		}else {
			this.saldo-=valor;
			System.out.println("Compra efetuada, novo saldo: "+this.saldo);
			return true;
			
		}
		
	}
	public boolean adicionaCredito(float valor) {
		this.saldo += valor;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", saldo=" + saldo + "]";
	}
	
	
	
}
