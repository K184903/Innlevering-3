package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell; // tabell for å lagre innlegg
	private int nesteLedig; // Neste ledige posisjon i tabellenn

	public Blogg() {
		this(20);

	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde]; // kapasitet
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteLedig; i++) {
			if (innleggtabell[i].erLik(innlegg)) { // Bruker erLik-metoden for sammenligning
				return i; // Returnerer indeksen hvis innlegget er funnet
			}
		}
		return -1; // Returnerer -1 hvis innlegget ikke ble funnet
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggtabell[i].erLik(innlegg)) { // Sjekker om innlegg er likt det som sendes inn
				return true; // Returnerer true hvis innlegget finnes
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggtabell.length;
		
	}

	public boolean leggTil(Innlegg innlegg) {
		if (nesteLedig == innleggtabell.length) {
	        return false; // Returnerer false hvis ingen ledig plass
	    }
	    if (finnes(innlegg)) {    // Sjekker om innlegget allerede finnes
	        return false; // Returnerer false hvis innlegget finnes fra før
	    }
	    // Legger til innlegget på neste ledige posisjon
	    innleggtabell[nesteLedig] = innlegg;
	    nesteLedig++;
	    return true;

	}

	//public String toString() {
		//return getId() + "\n" + "TEKST" +"\n 1" + bruker + "\n" + dato + "\n0" + "en tekst" + "\n" + bilde "\n"+ bruker + "\n" + "et bilde"+ "\n"+ url"\n";
		
	

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}