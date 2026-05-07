package esercizi.array;

public class Esercizio9Array {

	public static void main(String[] args) {
		
		final int NUM_MESI = 12;
		
		int[] giorniMeseArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] nomeMesi = {
		"GENNAIO", "FEBBRAIO","MARZO","APRILE","MAGGIO","GIUGNO",
		"LUGLIO","AGOSTO","SETTEMBRE","OTTOBRE","NOVEMBRE","DICEMBRE"};
		
		String[] nomeGiorni = {
			    "Lunedi","Martedi","Mercoledi",
			    "Giovedi","Venerdi","Sabato","Domenica"
			};
		
		
		
		int giornoPrimoGennaio = 3; // giovedi
		
		int giornoInizioMese = giornoPrimoGennaio;
		
		for(int i = 1; i <= NUM_MESI; i ++) {
			
			String nomeMese = nomeMesi[i -1]; // gennaio
			int giorniMese = giorniMeseArray[i-1]; // 31
			
			for(int j = 0; j < giorniMese; j++) {
				
				String nomeGiorno = nomeGiorni[(giornoInizioMese + j) % 7];
				
				System.out.println(nomeGiorno + " " + (j+1) + " " + nomeMese);
				
				if(j == giorniMese - 1) {
					//se è ultimo giorno del mese allora aggiorno giornoInizioMese
					giornoInizioMese = ((giornoInizioMese + j) % 7) + 1;
					
					System.out.println("---------------------");
					
				}
				
			}
			
		}

	}

}
