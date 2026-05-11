package esercizi.base.model;

import esercizi.base.model.rubrica.Contatto;
import esercizi.base.model.rubrica.GestoreRubrica;

public class Test {

	public static void main(String[] args) {
		
	GestoreRubrica rubrica = new GestoreRubrica(10);
	
	rubrica.aggiungiContatto(new Contatto("Stefano", "Trevisi", "32222"));
	
	rubrica.stampa();

	}

}
