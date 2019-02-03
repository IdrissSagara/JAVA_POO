package tableau;

public class Tableau {
	private double[] t;
	
	public Tableau(int n) {
		t = new double [n];
	}
	public Tableau(double tab[]) {
		t = tab;
	}
	
	public void afficher(){
		for (double d : t) {
			System.out.println(" "+ d);
		}
	}
	public void initialiser() {
	    double [] t1 = {1.5, 1.0, -5.2, -34.3};
	    t = t1;
	}
	public double moyenne() {
		double moyenne = 0.0;
		double somme = 0.0;
		for (int i = 0; i < t.length; i++) {
			somme += t[i];
		}
		moyenne = somme/t.length;
		return moyenne;
	}
	
	public double variance() {
		double variance = 0.0;
		double carre = 0.0;
		for (int j = 0; j < t.length; j++) {
			carre += t[j]*t[j];
		}
		variance = carre/t.length;
		return variance;	
	}
	public double ecartType() {
		double ecartType = 0.0;
		ecartType = Math.sqrt(variance());
		return ecartType;
	}
	
	public String sousFormeDeChaine() {
		String chaine = " ";
		for (int i = 0; i < t.length; i++) {
			chaine += chaine+t[i]+" ";
		}
		return chaine;
	}

}





















