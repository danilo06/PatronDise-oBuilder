package idsw.Venta_carro;

public class Main {

	public static void main(String[] args) {
		Vendible fiat = new Fiat500();
		fiat = new CDPlayer(fiat);
		System.out.println("Descripcion: " + fiat.getDescripcion()+
				" y el precio es  "+fiat.getPrecio());
		
		Vendible ford = new FordFiesta();
		ford = new MP3Player(new AireAcondicionado(ford));
		System.out.println("Descripcion: " + ford.getDescripcion()+ ""
				+ " y el precio es  "+ford.getPrecio());
		
	}
}
