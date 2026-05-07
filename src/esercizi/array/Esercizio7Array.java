package esercizi.array;


// 7/5/2026

// Esercizio 7 | Slide 78

/*
Inizializzare un array di 10 numeri interi
Trovare il numero massimo e stamparlo a video.
Ordinare l’array dal più piccolo al più grande.
Creare un nuovo array di 10 numeri e riempirlo con i numeri ordinati in modo inverso (dal più grande al più piccolo).
Stampare il secondo array.*/

public class Esercizio7Array {

	public static void main(String[] args) {
		
		// 1) Inizializzare un array di 10 numeri interi
		
		int[] numeri = {23,45,62,12,5,56,30,99,3,10};
		
		/*
		int[] numeri2 = new int[5];
		numeri2[0] = 34;
		
		int numTemp = 2;
		
		for ( int i = 0; i < numeri.length; i++) {
			numeri[i] = numTemp;
			
			numTemp += 2;
		}
		*/
		
		//2) Trovare il numero massimo e stamparlo a video.
		
		int numMax = numeri[0];
		
		for(int numero : numeri) {
			
			if(numero > numMax) {
				numMax = numero;
			}
			
			/*
			//     | controllo bool | se vero | se falso
			numMax = numMax < numero ? numero : numMax;
			*/
			
		}
		
		System.out.println("Il numero massimo è : " + numMax);
		
		
		//3) Ordinare l’array dal più piccolo al più grande. (usando bubble sort)
		
	    for (int i = 0; i < numeri.length - 1; i++) {
	    	
            for (int j = 0; j < numeri.length - 1 - i; j++) {
                if (numeri[j] > numeri[j + 1]) {
                    // scambio i due valori
                    int temp = numeri[j];
                    numeri[j] = numeri[j + 1];
                    numeri[j + 1] = temp;
                }
            }
            
        }
		
	    // 4. Creare un nuovo array con i numeri in ordine inverso
        int[] numeriInversi = new int[10];
        for (int i = 0; i < numeri.length; i++) {
            numeriInversi[i] = numeri[numeri.length - 1 - i];
        }
        
        // 5. Stampare il secondo array
        System.out.print("Array ordinato (decrescente): ");
        for (int i = 0; i < numeriInversi.length; i++) {
            System.out.print(numeriInversi[i] + " ");
        }
        System.out.println(); 
		
		
	
		

		

	}

}
