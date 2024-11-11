package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		boolean funket = true;
		int linjenr = 1;
		
		
		
		try {
			
			File fil = new File(mappe + filnavn + samling);
		
			Scanner leser = new Scanner(fil);
			String linje; 
		
			while(leser.hasNextLine()) {
				linje = leser.nextLine();
				linje.toString();
				linjenr+=1;
				
				
				
		}
		
		
		}catch (FileNotFoundException e){
			funket = false;
		}
		return funket;

		
	}
}
