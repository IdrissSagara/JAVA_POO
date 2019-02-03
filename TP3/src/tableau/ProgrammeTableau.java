package tableau;

public class ProgrammeTableau {

	public static void main(String[] args) {
		double [] t1 = {1.5, 1.0, -5.2, -34.3};
		double [] t2 = {-4.2, 1.7, 5.8};
		double [] t3 = {6.7, -8.4, -12.6, 4.2, 0.0, 2.7, -8.5};
		/**
		 * tableau 1
		 */
		double moyenneT1 = 0;
		double varianceT1 = 0;
		double ecartTypeT1 = 0;	
		double sommeT1 = 0;
		double carreT1 = 0;
		double petiteValeurT1 = 0;
		double grandeValeurT1 = 0;
		
		for (int i = 0; i < t1.length; i++) {
			sommeT1 += t1[i];
			carreT1 += t1[i]*t1[i];
		
			if (t1[i]<petiteValeurT1) {
				petiteValeurT1 = t1[i];	
			}
			if (t1[i]>grandeValeurT1) {
				grandeValeurT1 = t1[i];
			}
		}
		/**
		 *  tableau 2
		 */

		double moyenneT2 = 0;
		double varianceT2 = 0;
		double ecartTypeT2 = 0;	
		double sommeT2 = 0;
		double carreT2 = 0;
		for (int j = 0; j < t2.length; j++) {
			sommeT2 += t2[j];
			carreT2 += t2[j]*t2[j];
		}
		
		/**
		 * tableau 3
		 */
		for (double d : t1) {
					System.out.println(" "+ d);
				}
		for(int i = t1.length-1; i >= 0; i--) {
					System.out.println(t1[i]+" ");
				}
		System.out.println("-----------Tableau1-------");
		//System.out.println(petiteValeurT1);
		moyenneT1 = sommeT1/t1.length;
		System.out.println(moyenneT1);
		//Variancce
		varianceT1 = carreT1/t1.length;
		System.out.println(varianceT1);
		//Ecart type
		ecartTypeT1 = Math.sqrt(varianceT1);
		System.out.println(ecartTypeT1);
		System.out.println("-----------Tableau2-------");
		moyenneT2 = sommeT2/t2.length;
		System.out.println(moyenneT2);
		varianceT2 = carreT2/t2.length;
		System.out.println(varianceT2);
		ecartTypeT2 = Math.sqrt(varianceT2);
		System.out.println(ecartTypeT2);
		
		
		
	
	}

}
