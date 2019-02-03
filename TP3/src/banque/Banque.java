package banque;

public class Banque {
	private String nom;
	private CompteBancaire[] tab = new CompteBancaire[5];
	
	public Banque() {
		nom = "APO Bank";
		tab = new CompteBancaire[5];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new CompteBancaire(i,"compte " +i, 20000.0+i );
			
		}
	}
	
	public String versChaineDeCaractères() {
		String chaine = " ";
		chaine += "Nom de la banque: "+ nom+ "\n";
		for (int i = 0; i < tab.length; i++) {
			
			chaine += tab[i].infos();
		}
		return chaine;
	}
	public double avoirTotal() {
		double nouveauSolde = 0.0;
		for (CompteBancaire compteBancaire : tab) {
			nouveauSolde+= compteBancaire.getSolde();
		}
		return nouveauSolde;
	}
	public void afficheDebit() {
		for (CompteBancaire compteBancaire : tab) {
			if(compteBancaire.estADecouvert()){
				System.out.println(compteBancaire.getClient());
			}
		}
	}
	 public CompteBancaire getClient(int indice) {
		 CompteBancaire resultat = null;
		 if (indice < tab.length && indice > -1) {
			resultat = tab[indice];
		}
		 return resultat;
	 }
	 public void afficheNumeroDebitPlancher() {
		 for (CompteBancaire compteBancaire : tab) {
			if (compteBancaire.getSolde() == -1 * compteBancaire.getDecouvertAutorise()) {
				System.out.println(compteBancaire.getNumero());
			}
		}
	 }

}
