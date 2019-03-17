package idsw.Venta_carro;

public abstract class AutoDecorador implements Vendible {

	private Vendible vendible;

	public AutoDecorador(Vendible vendible) {
		this.vendible = vendible;
	}

	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}

}
