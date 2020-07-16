package com.giordanbetat.mediator;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ChatMediator extends Mediator{

private Hashtable<String, Participant> participants = new Hashtable<String, Participant>();
	
	private List<String> wordsForbidden = new ArrayList<String>();
	
	public ChatMediator() {
		wordsForbidden.add("xxxxx");
		wordsForbidden.add("@!xxx");
		wordsForbidden.add("###@!");
	}
	
	public void registerParticipant(Participant participant) {
		
		if(!participants.containsKey(participant.getName())){
			participants.put(participant.getName(), participant);
		}
		else{
			System.out.println("Usuário já cadastrado.");
		}
	}
	
	@Override
	public void sendMessage(String sender, String recipient, String message) {
		if(participants.containsKey(sender) && participants.containsKey(recipient)){
			Participant participantSender = participants.get(sender);
			Participant participantRecipient = participants.get(recipient);
		
			for(String forbidden : wordsForbidden){
				if(message.contains(forbidden)){
					participantSender.receiveMessage("Mediador", "Você escreveu uma mensagem contendo palavras impróprias.");
					return;
				}
			}
			
			participantRecipient.receiveMessage(sender, message);
		}
	}

}
