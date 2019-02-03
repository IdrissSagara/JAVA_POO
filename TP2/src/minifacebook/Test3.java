package minifacebook;

public class Test3 {

	public static void main(String[] args) {
		Personne hugo = new Personne("Histe", "Hugo", new DateNaissance());
		hugo.setMeilleurAmi(hugo);
		hugo.ecritInfos();
	}

}
