package esercizi.base.model;

import java.util.List;

public class Armadio {
	
	private double altezza;
	private double larghezza;
	private double profondita;
	private String materiale;
	private String colore;
	private double peso;
	private int numAnte;
	private int numPiediArmadio;
	
	private int capacitaMax;
	private int numCapiPresenti;
	
	private boolean isPieno;
	

	public Armadio(double altezza, double larghezza, double profondita, String materiale, int numAnte,
			int numPiediArmadio, int capacitaMax) {
	
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
		this.materiale = materiale;
		this.numAnte = numAnte;
		this.numPiediArmadio = numPiediArmadio;
		this.capacitaMax = capacitaMax;
		
		this.isPieno = false;
		this.numCapiPresenti = 0;
	}




	public void aggiungiVestiti (int numVestiti) {
		
		//1. controlliamo se è pieno o meno
		if(isPieno  || numVestiti == 0) {
			System.out.println("Impossibile");
			return;
		}
		
		//2. aggiungiamo numCapiPresenti ammesso che possano entrarci
		if(numVestiti > getSpazioDisp()) {
			System.out.println("Mi dispiace ma non posso "
					+ "mettere tutti questi vestiti");
		} else {
			numCapiPresenti += numVestiti;
			String testoDaStampare =
					numVestiti == 1 ? 
							" capo aggiunto correttamente" : 
							" capi aggiunti correttamente";
					

			System.out.println(numVestiti + testoDaStampare);
		}
		
	}
	
	private int getSpazioDisp () {
		return capacitaMax - numCapiPresenti;
	}

	public double getAltezza() {
		return altezza;
	}


	public double getLarghezza() {
		return larghezza;
	}


	public double getProfondita() {
		return profondita;
	}


	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumAnte() {
		return numAnte;
	}

	public void setNumAnte(int numAnte) {
		this.numAnte = numAnte;
	}

	public int getNumPiediArmadio() {
		return numPiediArmadio;
	}

	public void setNumPiediArmadio(int numPiediArmadio) {
		this.numPiediArmadio = numPiediArmadio;
	}

	public int getCapacitaMax() {
		return capacitaMax;
	}

	public int getNumCapiPresenti() {
		return numCapiPresenti;
	}
	
	
	

	
}
