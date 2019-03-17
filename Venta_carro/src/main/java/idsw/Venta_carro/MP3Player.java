package idsw.Venta_carro;

public class MP3Player extends AutoDecorador {

	public MP3Player(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return getVendible().getDescripcion()+"+ MP3Player";
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio()+250;
	}

}