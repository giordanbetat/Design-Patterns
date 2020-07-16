package com.giordanbetat.prototype;

public abstract class MusicalNote implements Cloneable {

	public MusicalNote clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (MusicalNote) clone;
	}
	
	public abstract void draw();
	
}
