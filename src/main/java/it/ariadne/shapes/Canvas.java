package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

public class Canvas {
	
	List<Forma> forme = new ArrayList<>();
	
	public void add(Forma f){
		forme.add(f);
	}
	
	

	
	public int size(){
		int numeroTotaleForme = 0;
		numeroTotaleForme +=forme.size();
		return numeroTotaleForme;
	}

	public double calcolaPerimetro() {
		double perimetroTotale = 0d;//indico che è un decimale
	
		
		for (Forma forma : forme) {
			perimetroTotale += forma.calcolaPerimetro();
			
			
			//viola l'OCP
			if(forma instanceof Cerchio){
				((Cerchio)forma).calcolaDiametro();				
			}
			
			
		}
		
		return perimetroTotale;
	}

}
