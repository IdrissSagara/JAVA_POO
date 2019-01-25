package minifacebook;

public class Test {

	 public static void main(String[] args) {
	       DateNaissance naissancePatty = new DateNaissance(10, 05, 1968);
	       Personne patty = new Personne("Bullaire", "Patty", naissancePatty);
	       
	       DateNaissance naissanceJack = new DateNaissance();
	       Personne jack = new Personne("Pottes", "Jacques", naissanceJack);
	        
	       //naissancePatty.ecritDate();       
	       //System.out.println();
	       //naissanceJack.ecritDate();
	       //System.out.println();
	       //System.out.println("l'âge de Jack est: " + naissanceJack.age());
	       //System.out.println();
	       
	       patty.setAmi(jack);
	       patty.setMeilleurAmi(jack);
	        
	       jack.setAmi(patty);
	       jack.setMeilleurAmi(patty);
	       
	     
	       patty.ecritInfos();
	       jack.ecritInfos();
	    }

}
