package esercizi.base;

public class CalcoloInteressi {
	
	public static void main(String[] args) {
		
		//Dichiariamo e istanziamo le variabili
		
		int annoInizio = 2026;
		double percInteressi = 1.025;
		
		double importoInput = 1000.00;
	
		double importoCalc = importoInput;
		
		//cicliamo per 5 anni per ottenere gli interessi calcolati
		
		for (int i = 0; i < 5; i++) {
			
			/*
			 * Calcolo interesse
			 * 
			 * avremmo potuto fare anche 
			 * importoCalc = importoCalc * percInteressi;
			 */
			
			importoCalc *= percInteressi;
			
			System.out.println("A fine anno " + annoInizio + " abbiamo " + importoCalc +  "€");
			
			//prima che riprenda il ciclo for, aumentiamo di 1 anno l'anno inizio
			
			annoInizio ++;
			
		}
		
	}

}
