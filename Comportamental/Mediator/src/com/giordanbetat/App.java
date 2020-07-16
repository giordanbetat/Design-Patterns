package com.giordanbetat;

import com.giordanbetat.mediator.ChatMediator;
import com.giordanbetat.mediator.Participant;
import com.giordanbetat.mediator.ParticipantImpl;

public class App {

	public static void main(String[] args) {
		
		ChatMediator chatMediator = new ChatMediator();
		
		Participant joao = new ParticipantImpl("Joao", chatMediator);
		Participant maria = new ParticipantImpl("Maria", chatMediator);
		Participant jose = new ParticipantImpl("Jose", chatMediator);
		
		chatMediator.registerParticipant(joao);
		chatMediator.registerParticipant(maria);
		chatMediator.registerParticipant(jose);
		
		joao.sendMessage("Maria", "Olá Maria, tudo bem?");
		maria.sendMessage("Joao", "Oi tudo! E com você?");
		jose.sendMessage("Joao", "Joao, você é um @!xxx.");
		
	}
	
}
