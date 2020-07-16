package com.giordanbetat;
import com.giordanbetat.prototype.Score;

public class App {

	public static void main(String[] args) {
		
		Score.loadingNotes();
		
		Score.getNote("Do").draw();
		Score.getNote("Re").draw();
		Score.getNote("Mi").draw();
		Score.getNote("Re").draw(); 
		Score.getNote("Fa").draw();
		Score.getNote("Mi").draw();
		Score.getNote("Sol").draw();
		Score.getNote("La").draw();
		Score.getNote("Mi").draw();
		Score.getNote("Si").draw();
		Score.getNote("Re").draw();

	}

}
 