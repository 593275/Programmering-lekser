package no.hvl.dat100;


import static javax.swing.JOptionPane.showInputDialog;

public class Trinnskatt {

	public static void main(String[] args) {
	
		
		String nummerTxt = showInputDialog("Lønn ");
		int nummer = Integer.parseInt(nummerTxt);
		
		if (nummer <= 164100) {int formell = nummer*0; 
		System.out.println("trinnskatt :"+ formell);}
		
		else if (nummer <= 230950 && nummer >= 164101) 
		{double formell = nummer * 0.0093;
		System.out.println("trinnskatt: "+ formell);}
		
		else if (nummer >= 230951 && nummer <= 580650) 
		{double formell = nummer * 0.0241;
		System.out.println("trinnskatt: "+ formell);}
			
		else if (nummer >= 580651 && nummer <= 934050)
		{double formell = nummer * 0.1152;
		System.out.println("trinnskatt: "+ formell);}
		
		else if (nummer >= 934051) 
		{double formell = nummer * 0.1452;
		System.out.println("trinnskatt: "+ formell);}
	
	} 

}
