package minifacebook;

import java.util.Date;

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
        boolean anneeBisextile = false;
        
        // si on est en fevrier et qu'on est dans une année bisextile 
        //on a jusqu'à 29 jours sinon 28
        if (mois == 2) {
            //anneX Signifie annee est divisible par X
            boolean annee4 = (annee % 4) == 0;
            boolean annee100 = (annee % 100) == 0;
            boolean annee400 = (annee % 400) == 0;

            if (annee4 && annee100 && annee400) {
                anneeBisextile = true;
            }

            if (annee4 && !annee100) {
                anneeBisextile = true;
            }
        }

        if (anneeBisextile) {
            if ((jour > 0) && (jour < 30)) {
                this.jour = jour;
            }
        } else {
            if ((jour > 0) && (jour < 29)) {
                this.jour = jour;
            }
        }
    }


	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		if((mois > 0) && (mois <= 31)) {
			this.mois = mois;		
		}
	}

	public int getAnnee() {
		
		return annee;
	}

	@SuppressWarnings("deprecation")
	public void setAnnee(int annee) {
		 int anneeCourante = new Date().getDate();

	        if ((annee > 0) && (annee < anneeCourante)) {
	            this.annee = annee;
	        }

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





























