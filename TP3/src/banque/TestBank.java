package banque;

public class TestBank {

	public static void main(String[] args) {
		Banque b = new Banque();
		b.afficheDebit();
		System.out.println(b.versChaineDeCaractères());
		System.out.println(b.avoirTotal());
		
		
		//b.afficheNumeroDebitPlancher();
	}

}
