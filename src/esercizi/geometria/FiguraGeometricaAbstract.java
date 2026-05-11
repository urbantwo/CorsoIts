package esercizi.geometria;

public abstract class FiguraGeometricaAbstract  {
	
	
	
	

//	public FiguraGeometricaAbstract(String colore, int numLati) {
//		super();
//		this.colore = colore;
//		this.numLati = numLati;
//	}
	
	
	private String colore;
	private int numLati;
	
	public void saluta() {
		System.out.println("Ciao sonouna figura geometrica");
	}
	
	public abstract double calcArea();
	public abstract double calcPerimetro();
	
	
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getNumLati() {
		return numLati;
	}
	public void setNumLati(int numLati) {
		this.numLati = numLati;
	}

	
	

}
