package minifacebook;

import java.util.Scanner;

public class TestSaisie {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
	    DateNaissance date = new DateNaissance();
	    DateNaissance date1 = new DateNaissance();
	    DateNaissance date2 = new DateNaissance();
	 
	    System.out.println("Saisir l'annee de naissance de Harry (1989)");
	    date.setJour(23);
	    date.setMois(0);
	    date.setAnnee(clavier.nextInt());
	    Personne harry = new Personne("Potter", "Harry", date);
	 
	    System.out.println("Saisir l'annee de naissance de Ron (1988)");
	    date1.setJour(24);
	    date1.setMois(8);
	    date1.setAnnee(clavier.nextInt());
	    Personne ron = new Personne("Weasley", "Ron", date1);
	 
	    System.out.println("Saisir l'annee de naissance de Hermione (1990)");
	    date2.setJour(15);
	    date2.setMois(4);
	    date2.setAnnee(clavier.nextInt());
	    Personne hermione = new Personne("Granger", "Hermione", date2);
	 
	    harry.ecritInfos();
	    ron.ecritInfos();
	    hermione.ecritInfos();
	    System.out.println("Y'a pas un problème?");
	    }
	

}
