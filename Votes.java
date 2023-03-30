package bleron;
import javax.swing.*;


public class Votes {

	public static void main(String[] args) {
		String emriKanditatit1 = JOptionPane.showInputDialog("Shkruani emrin e kandidatit te pare: ");
		String adresaeKandidatit1 =JOptionPane.showInputDialog("Adresa e kandidatit te pare: ");
		System.out.println("Kandidati i pare e ka emrin: " + emriKanditatit1 + " dhe ka adresen " + adresaeKandidatit1);
		String emriKandidatit2 = JOptionPane.showInputDialog("Shkruani emrin e kandidatit te dyte:");
		String adresaeKandidatit2 =JOptionPane.showInputDialog("Adresa e kandidatit te dyte: ");
		System.out.println("Kandidati i dyte e ka emrin: " + emriKandidatit2 + " dhe ka adresen " + adresaeKandidatit2);
		int k1 = 0;
		int k2 = 0;
		
		String vote1 = JOptionPane.showInputDialog("Shkruani " + emriKanditatit1 + " per kandidatin 1 " + "dhe shkruani " + emriKandidatit2 + " per kandidatin 2");
		if (vote1.equals(emriKanditatit1)) {
			k1++;
			System.out.println("Ju keni votuar per kandidatin e pare. Faleminderit!");
		} else if (vote1.equals(emriKandidatit2)) {
			k2++;
		System.out.println("Ju keni votuar per kandidatin e dyte. Faleminderit!");
		} else 
			System.out.println("Abstenim!");
		
		String vote2 = JOptionPane.showInputDialog("Shkruani " + emriKanditatit1 + " per kandidatin 1 " + "dhe shkruani " + emriKandidatit2 + " per kandidatin 2");
		if (vote2.equals(emriKanditatit1)) {
			k1++;
			System.out.println("Ju keni votuar per kandidatin e pare. Faleminderit!");
		} else if (vote2.equals(emriKandidatit2)) {
			k2++;
		System.out.println("Ju keni votuar per kandidatin e dyte. Faleminderit!");
		} else 
			System.out.println("Abstenim!");
		
		
		String vote3 = JOptionPane.showInputDialog("Shkruani " + emriKanditatit1 + " per kandidatin 1 " + "dhe shkruani " + emriKandidatit2 + " per kandidatin 2");
		if (vote3.equals(emriKanditatit1)) {
			k1++;
			System.out.println("Ju keni votuar per kandidatin e pare. Faleminderit!");
		} else if (vote3.equals(emriKandidatit2)) {
			k2++;
		System.out.println("Ju keni votuar per kandidatin e dyte. Faleminderit!");
		} else 
			System.out.println("Abstenim!");
		
		
		String vote4 = JOptionPane.showInputDialog("Shkruani " + emriKanditatit1 + " per kandidatin 1 " + "dhe shkruani " + emriKandidatit2 + " per kandidatin 2");
		if (vote4.equals(emriKanditatit1)) {
			k1++;
			System.out.println("Ju keni votuar per kandidatin e pare. Faleminderit!");
		} else if (vote4.equals(emriKandidatit2)) {
			k2++;
		System.out.println("Ju keni votuar per kandidatin e dyte. Faleminderit!");
		} else 
			System.out.println("Abstenim!");
		
		
		String vote5 = JOptionPane.showInputDialog("Shkruani " + emriKanditatit1 + " per kandidatin 1 " + "dhe shkruani " + emriKandidatit2 + " per kandidatin 2");
		if (vote5.equals(emriKanditatit1)) {
			k1++;
			System.out.println("Ju keni votuar per kandidatin e pare. Faleminderit!");
		} else if (vote5.equals(emriKandidatit2)) {
			k2++;
		System.out.println("Ju keni votuar per kandidatin e dyte. Faleminderit!");
		} else 
			System.out.println("Abstenim!");
		
	
		System.out.println("Kandidati i pare ka: " + k1 + " vota.");
		System.out.println("Kandidati i dyte ka: " + k2 + " vota.");
		
		if (k1 > k2) {
			System.out.println("Kandidati i pare " + emriKanditatit1 + " ka fituar zgjedhjet.");
		} else if (k1 < k2) {
			System.out.println("Kandidati i dyte " + emriKandidatit2 + " ka fituar zgjedhjet.");
		} else if (k1 == k2) {
			System.out.println("Kandidatet kane barazuar!");
		}
	

	}

}
