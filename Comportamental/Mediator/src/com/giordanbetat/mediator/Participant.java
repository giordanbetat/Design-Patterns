package com.giordanbetat.mediator;

public abstract class Participant {

	private String name;
	private Mediator mediator;
	
	public Participant(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Mediator getMediator() {
		return mediator;
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void sendMessage(String recipient, String message);
	
	public abstract void receiveMessage(String sender, String message);
	
}
