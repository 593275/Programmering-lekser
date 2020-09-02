package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Karakter {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			String nummerTxt = showInputDialog("Poeng ");
			int nummer = Integer.parseInt(nummerTxt);
		
			if (nummer < 0 || nummer > 100) { 
				i=i-1;
				System.out.println("Karakter: ugyldig");
			}
		
			else if(nummer >= 0 && nummer <= 39) {
				System.out.println("Karakter: F");
			}
		
			else if(nummer >= 40 && nummer <= 49) {
				System.out.println("Karakter: E");
			}
		
			else if(nummer >= 50 && nummer <= 59) {
				System.out.println("Karakter: D");
			}
		
			else if(nummer >= 60 && nummer <= 79) {
				System.out.println("Karakter: C");
			}
			else if(nummer >= 80 && nummer <= 89) {
				System.out.println("Karakter: B");
			}
			
			else if(nummer >= 90 && 100 >= nummer) {
				System.out.println("Karakter: A");
			}
			
		}	
	}

}
