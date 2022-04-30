package entities;

public class Inteiro {

	private int valor;

	public Inteiro() {
		super();
	}

	public Inteiro(int numero) {
		super();
		this.valor = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void soma(Inteiro numero) {
		this.valor += numero.getValor();
	}

	public void subtrai(Inteiro numero) {
		this.valor -= numero.getValor();
	}

	public boolean isPrimo() {
		if (this.valor < 2) {
			return false;
		}
		for (int i = 2; i < this.valor / 2; i++) {
			if (this.valor % i == 0) {
				return false;
			}
		}
		return true;
	}

	public Inteiro getNextPrimo() {
		
		Inteiro proximo = new Inteiro(this.valor + 1);
		
		while (proximo.isPrimo() == false) {
			proximo.setValor(proximo.getValor() + 1);
		}
		return proximo;
	}
}
