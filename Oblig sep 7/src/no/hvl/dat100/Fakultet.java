package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Fakultet {

	

	public static void main(String[] args) {
		
		String nummerTxt = showInputDialog("Tall ");
		int nummer = Integer.parseInt(nummerTxt);
		
		int fakultet = nummer;
		
		for(int i = 1; i < nummer; ++i)
		
			fakultet = fakultet * i;

		System.out.println("fakultet til "+ nummer + " er " + fakultet);
	}

}
