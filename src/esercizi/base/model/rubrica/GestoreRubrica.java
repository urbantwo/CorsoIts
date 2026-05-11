package esercizi.base.model.rubrica;

public class GestoreRubrica {
	
	private Contatto[] contatti;
	
	private static final int MAX_CONTATTI = 50;

	public GestoreRubrica() {
		this.contatti = new Contatto[MAX_CONTATTI];
	}
	
	
	public GestoreRubrica(int numContatti) {
		
		if(numContatti > 0) {
			this.contatti = new Contatto[numContatti];			
		} else {
			this.contatti = new Contatto[MAX_CONTATTI];
		}
		
	}
	
	
	public boolean aggiungiContatto(Contatto cont) {
		
		for ( int i = 0; i < contatti.length; i++) {
			
			if(contatti[i] == null) {
				contatti[i] = cont;
				return true;
			}
			
		}
		
		
		return false;
		
				
	}
	
	public void stampa() {
		
		System.out.println("Rubrica\n"
				+ "---------------------------");
		
		
		for(Contatto cont : contatti) {	
			if(cont != null)
				System.out.print(cont.getNome() + " " + cont.getCognome() + " : " + cont.getNumero() + "\n");
		}
		
	}
	
	

}
