package it.ariadne.shapes;

public class Quadrato implements Forma{
	
	private Punto p;
	private int lato;

	public Quadrato(Punto p, int lato) {
		this.p = p;
		this.lato = lato;
	}

	public double calcolaPerimetro() {
		
		return this.lato*4;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
