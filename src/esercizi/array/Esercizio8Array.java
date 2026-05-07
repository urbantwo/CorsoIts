package esercizi.array;

public class Esercizio8Array {
	
	public static void main(String[] args) {
		
	
	int[] giorniGennaio = new int[31];
	
	String[] nomeGiorni = {
		    "Lunedi","Martedi","Mercoledi",
		    "Giovedi","Venerdi","Sabato","Domenica"
		};
	
	
	
	for(int i = 0; i < 31;i++) {
		giorniGennaio[i] = i + 1;
	}
	
	int giornoIniziale = 3; // giovedi
	
	
	for (int i = 0; i < giorniGennaio.length; i++) {
		
	    String nomeGiorno = nomeGiorni[(giornoIniziale + i) % 7];
	    
	    System.out.println(nomeGiorno + " " + giorniGennaio[i] + " Gennaio");
	}
	
	}

}
