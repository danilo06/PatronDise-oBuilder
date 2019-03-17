package idsw.Venta_carro;

public class AireAcondicionado extends AutoDecorador {

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return getVendible().getDescripcion()+"+ Aire Acondicionado";
	}

	@Override
	public float getPrecio() {
		// TODO Auto-generated method stub
		return getVendible().getPrecio()+1500;
	}

}
