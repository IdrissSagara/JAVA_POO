package tableau;

public class TestTableau {

	public static void main(String[] args) {
		double donnee[] = {2.2, 3.4,5.5};
		Tableau t1 = new Tableau(3);
		Tableau t2 = new Tableau(5);
		Tableau t3 = new Tableau(7);
		Tableau t4 = new Tableau(3);
		Tableau t5 = new Tableau(donnee);
		//t1.afficher();
		//t2.afficher();
		//t3.afficher();
		t4.initialiser();
		t4.moyenne();
		System.out.println(t4.moyenne());
		t4.variance();
		System.out.println(t4.variance());
		t4.ecartType();
		System.out.println(t4.ecartType());
		
		t5.ecartType();
		System.out.println(t5.ecartType());
		t5.moyenne();
		t5.variance();
		t5.afficher();
		System.out.println("-------");
		Tableau t0 = new Tableau(3);
		System.out.println("t0 = " + t0.sousFormeDeChaine());
		Tableau t = new Tableau(donnee);
		System.out.println("t = " + t.sousFormeDeChaine());
	}

}
