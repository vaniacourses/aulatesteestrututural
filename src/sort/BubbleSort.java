package sort;

public class BubbleSort {
	
	public void teste(int n) {

		int a = 10 + Math.abs(n);
		
		if (a < 10) {
			System.out.println("passei");
		}
		
	}
	
	public int[] bubbleSort(int[] vet) {
		int i,j,aux;
		int n = vet.length;
		
		for (i=0;  /* 1-->2 */ 
				i<n; /* 1-->2 */ /* 1-->2 */ 
				i++) {
			for(j= n -1; 
					j > i; 
					j--) {
				if (vet[j -1] > vet[j]) {
					aux = vet[j -1];
					vet[j-1] = vet[j];
					vet[j] = aux;
				}
			}
		}
		return vet;
	}

}
