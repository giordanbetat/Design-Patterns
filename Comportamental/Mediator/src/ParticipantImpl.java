
public class ParticipantImpl extends Participant{

	public ParticipantImpl(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void sendMessage(String recipient, String message) {
		Mediator mediator = this.getMediator();
		mediator.sendMessage(this.getName(), recipient, message);
		
	}

	@Override
	public void receiveMessage(String sender, String message) {
		System.out.println(sender + " Escreveu: " + message);
	}

}
