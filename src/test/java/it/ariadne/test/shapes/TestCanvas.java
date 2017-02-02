package it.ariadne.test.shapes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.shapes.Canvas;
import it.ariadne.shapes.Cerchio;
import it.ariadne.shapes.Punto;
import it.ariadne.shapes.Quadrato;

public class TestCanvas {
	
	private Canvas canvas;
	private Quadrato q;
	private Cerchio c;
	
	//metodo di setup o preparazione
	@Before
	public void setup(){
		
//		Canvas canvas = new Canvas();
		Punto p = new Punto(12, 31);
		canvas = new Canvas();	
	
		int lato = 2;
		int raggio = 2;

		q = new Quadrato(p,lato);
		c =  new Cerchio(p,raggio);
		
		canvas.add(q);
		canvas.add(c);
//		
	}
			
	//annotazione per indicare che è un test che può essere utilizzato il JUnit
	@Test
	public void testDimensioneCanvas() {
		
		int canvasSize = canvas.size();
		
		//Assert.assertTrue("Il canvas contiene due forme", canvasSize ==2);//metodo di controllo
		Assert.assertEquals("Il canvas contiene due forme", 2,canvasSize);//metodo di controllo
		
	}
	
	@Test
	public void controlloAreePerimetri(){
		
		double perimetroQuadrato = q.calcolaPerimetro();
		double perimetroCerchio = c.calcolaPerimetro();
		
		double perimetroTotale = canvas.calcolaPerimetro();
		
		//il controllo del double ci sono dei problemi di gestione della virgola mobile - utilizzare bigDecimal??
		Assert.assertEquals("Perimetro cerchio più perimetro quadrato", 20,perimetroTotale,0);
		
	}
	
	@Test
	public void bastard(){
		
		Quadrato q = new Quadrato(null, -3);
		Assert.assertEquals("Il perimetro è 12", 12, q.calcolaPerimetro(),0);
		
	}

}
