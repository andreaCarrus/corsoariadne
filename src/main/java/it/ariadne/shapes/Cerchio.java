package it.ariadne.shapes;

public class Cerchio implements Forma{
	
	private Punto p;
	private int raggio;

	public Cerchio(Punto p, int raggio) {
		this.p = p;
		this.raggio = raggio;
	}

	public double calcolaPerimetro() {
		return 2*3*raggio;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double calcolaDiametro(){
		return 2*raggio;
	}

}
