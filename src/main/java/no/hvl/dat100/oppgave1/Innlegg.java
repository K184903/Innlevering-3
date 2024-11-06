package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	

	
	public Innlegg(int id, String bruker, String dato) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}
	
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {       // skal de ikke være setmetode for id? 
		return id;
	}

	public void setID(int id) {
		this.id = id;

	}
	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes++;
		System.out.println(likes);	

	}
	
	public boolean erLik(Innlegg innlegg) {
		return this.id == innlegg.getId();

	}
	
	@Override
	public String toString() {
		
		String innlegg;
		
		innlegg = id + "\n" + bruker + "\n" + dato  + "\n" + likes + "\n";
		return innlegg;
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
