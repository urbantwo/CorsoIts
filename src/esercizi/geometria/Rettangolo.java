package esercizi.geometria;

public class Rettangolo extends FiguraGeometricaAbstract  {
	
	private double base;
	private double altezza;
	
	

	@Override
	public void saluta() {
			System.out.println("Ciao, io sono la versione nuova.");
	}

	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double calcArea() {
		return base * altezza;
	}

	@Override
	public double calcPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	

}
