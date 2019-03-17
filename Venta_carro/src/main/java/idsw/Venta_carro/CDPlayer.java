package idsw.Venta_carro;

public class CDPlayer extends AutoDecorador {

	public CDPlayer(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return getVendible().getDescripcion()+"+ CDPlayer";
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio()+100;
	}

}
