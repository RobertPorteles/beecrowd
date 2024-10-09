package numerao;

import java.math.BigInteger;

public class Numerao {
	private BigInteger numero;

	public Numerao(BigInteger numero) {
		
		this.numero = numero;
	}

	public void setNumero(BigInteger numero) {
		this.numero = numero;
	}
	public BigInteger getNumero() {
		return numero;
	}

	public BigInteger soma(Numerao outroNumerao) {
		BigInteger somado = this.numero.add(outroNumerao.getNumero());
		
		return somado;
		
	}

	@Override
	public String toString() {
		return "Numerao [numero=" + numero + "]";
	}
}
