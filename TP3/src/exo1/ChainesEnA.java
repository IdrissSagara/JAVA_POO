package exo1;

public class ChainesEnA {
	private String[] chaines = {"abracadabra", "et voila", "ma camera", "ahahah", "joli tour", "arabesque"};
	 
	  public void afficheTable() {
	    // A compléter
		  for (int i = 0; i < chaines.length; i++) {
			System.out.println(chaines[i]+ " ");
		}
	  }
	 
	  public void enMajuscules() {
	    // A compléter
		  for (int i = 0; i < chaines.length; i++) {
			System.out.println(chaines[i].toUpperCase());
		}
	  }
	 
	  public int compteA(String s) {
	    // A compléter
		  int compteur = 0;
		  for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==('a')) {
				compteur++;
			}
		}
		  return compteur;
	  }
	 
	  public void afficheNombreA() {
	    // A compléter
		  for (int j = 0; j < chaines.length; j++) {
			System.out.print(chaines[j]+ " "+compteA(chaines[j])+" ");
		}
	  }
	 
	  public void affiche3As() {
	    // A compléter
		  for (int i = 0; i < chaines.length; i++) {
			if (compteA(chaines[i]) ==3) {
				System.out.println(chaines[i]);
			}
		}
	  }

}
