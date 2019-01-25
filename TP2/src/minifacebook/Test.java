package minifacebook;

public class Test {

	 public static void main(String[] args) {
	       DateNaissance naissancePatty = new DateNaissance(10, 05, 1968);
	       DateNaissance naissanceJack = new DateNaissance();
	       DateNaissance naissanceIdriss = new DateNaissance(14, 04, 1902);
	        
	       naissancePatty.ecritDate();
	       
	       System.out.println();
	       
	       naissanceJack.ecritDate();
	       
	       System.out.println();
	        
	       System.out.println("l'âge de Jack est: " + naissanceJack.age());
	       System.out.println();
	       
	       Personne patty = new Personne("Bullaire", "Patty", naissancePatty);
	       Personne jack = new Personne("Pottes", "Jacques", naissanceJack);
	       Personne sagara = new Personne("Sagara", "Idriss", naissanceIdriss);
	       
	       
	       
	       patty.setAmi(jack);
	       patty.setMeilleurAmi(jack);
	        
	       jack.setAmi(patty);
	       jack.setMeilleurAmi(patty);
	       
	       sagara.setAmi(jack);
	       sagara.setMeilleurAmi(patty);
	     
	       patty.ecritInfos();
	       jack.ecritInfos();
	       sagara.ecritInfos();
	    }

}
