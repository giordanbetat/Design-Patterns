package com.giordanbetat.prototype;
import java.util.Hashtable;

public class Score {

	private static Hashtable<String, MusicalNote> noteMap = new Hashtable<String, MusicalNote>();
	
	public static void loadingNotes() {
		
		Do noteDo = new Do();
		noteMap.put("Do", noteDo);
		
		Re noteRe = new Re();
		noteMap.put("Re", noteRe);
		
		Mi noteMi = new Mi();
		noteMap.put("Mi", noteMi);
		
		Fa noteFa = new Fa();
		noteMap.put("Fa", noteFa);
		
		Sol noteSol = new Sol();
		noteMap.put("Sol", noteSol);
		
		La noteLa = new La();
		noteMap.put("La", noteLa);
		
		Si noteSi = new Si();
		noteMap.put("Si", noteSi);
		
	}
	
	public static MusicalNote getNote(String name) {
		MusicalNote note = noteMap.get(name);
		return note.clone();
	}
	
}
