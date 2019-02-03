package banque;

public class CompteBancaire {
	private int numero;
	private String client;
	private double solde;
	private double decouvertAutorise;
	
	public CompteBancaire() {
		numero = 66677;
		client = "Sagara " + " Idriss";
		solde = 10000.0;
		decouvertAutorise = 300.0;
		
	}
	public CompteBancaire(int numero, String nom) {
		this.numero = numero;
		this.client = nom;
		this.solde = 100;
		this.decouvertAutorise = 50;
	}
	
	public CompteBancaire(int numero, String nom,double somme) {
		this.numero = numero;
		this.client = nom;
		this.solde = somme;
		this.decouvertAutorise = somme/2;
	}
	
	public void depot(double somme) {
			this.solde += somme;	
	}
	
	public boolean retrait(double somme) {
		double soldeMaximum = decouvertAutorise + solde;
		if (somme <= soldeMaximum) {
			solde = solde - somme;;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean estADecouvert() {
		if (solde < 0) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public String infos() {
		String chaine = "";
		chaine += "-----------------------------------------\n";
		chaine+="Client : "+ client +"\n";
		chaine+= "Numéro du compte : "+numero+"\n";
		if(solde < 0) {
			chaine+= "Solde debiteur : "+solde+"\n";
		}else {
			chaine+= "Solde créditeur : "+solde+"\n";
		}
		chaine += "-----------------------------------------\n";
		return chaine;
	}
	public int getNumero() {
		return numero;
	}
	public String getClient() {
		return client;
	}
	public double getSolde() {
		return solde;
	}
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
