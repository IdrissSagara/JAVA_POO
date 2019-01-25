package minifacebook;

public class DateNaissance {
	private int jour;
	private int mois;
	private int annee;
	
	public DateNaissance() {
		jour = 23;
		mois = 06;
		annee = 1912;
		
	}
	
	public DateNaissance(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public void ecritDate() {
		
		System.out.print(""+ jour+"/"+ mois+"/"+annee);
		
	}
	
	public int age() {
		int resultat;
		
		resultat = 2015-annee;
		
		return resultat;
	}

}





























