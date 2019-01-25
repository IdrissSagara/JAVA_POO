package minifacebook;

public class Test2 {

	public static void main(String[] args) {
		   DateNaissance naissanceHarry = new DateNaissance(23, 7, 1989);
	       DateNaissance naissanceRon = new DateNaissance(24, 8, 1988);
	       DateNaissance naissanceHermone = new DateNaissance(13, 4, 1990);
	      
	       
	       Personne potter = new Personne("Potter", "Harry", naissanceHarry);
	       Personne weaskey = new Personne("Weaskey", "Ron", naissanceRon);
	       Personne granger = new Personne("Granger", "Hermone", naissanceHermone);
	       
	       
	       
	       potter.setAmi(weaskey);
	       potter.setMeilleurAmi(granger);
	        
	       granger.setAmi(weaskey);
	       granger.setMeilleurAmi(potter);
	       
	       weaskey.setAmi(potter);
	       weaskey.setMeilleurAmi(granger);
	     
	       potter.ecritInfos();
	       granger.ecritInfos();
	       weaskey.ecritInfos();
	}

}
