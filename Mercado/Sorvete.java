package Mercado;

public class Sorvete extends Produto{
	private double tempAdquada;

	public Sorvete(long id, String nome, double preco, double tempAdquada) {
		super(id, nome, preco);
		this.tempAdquada = tempAdquada;
	}

	public double getTempAdquada() {
		return tempAdquada;
	}

	public void setTempAdquada(double tempAdquada) {
		this.tempAdquada = tempAdquada;
	}

	
}
