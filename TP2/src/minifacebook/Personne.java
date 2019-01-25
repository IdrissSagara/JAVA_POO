package minifacebook;

public class Personne {

	private String nom;
	private String prenom;
	private DateNaissance dateDeNaissance;
	private Personne ami;
	private Personne meilleurAmi;
	
	
	
	public Personne(String nom, String prenom, DateNaissance dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateNaissance;
	}
	
	public Personne getAmi() {
		return ami;
	}


	public void setAmi(Personne ami) {
		this.ami = ami;
	}


	public Personne getMeilleurAmi() {
		return meilleurAmi;
	}


	public void setMeilleurAmi(Personne meilleurAmi) {
		this.meilleurAmi = meilleurAmi;
	}


	public void ecritInfos(){
		
		int age = dateDeNaissance.age();
        String nomPrenom = "" + prenom + " " + nom;
        if(meilleurAmi != null) {
            String nomMeilleurAmi = "" + meilleurAmi.prenom + " " + meilleurAmi.nom;
    		System.out.println("Meilleur ami : "+ nomMeilleurAmi);	
        }
        if(ami != null) {
            String nomCompletAmi = "" + ami.prenom + " " + ami.nom;
    		System.out.println("Ami : "+ nomCompletAmi);
        }
        
		System.out.println("---------------------------");
		System.out.println(nomPrenom);
		System.out.print("Né le : ");
		dateDeNaissance.ecritDate();
		System.out.print(" ("+age+" ans)\n");
		System.out.println("---------------------------");
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
