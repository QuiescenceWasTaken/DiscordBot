import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.util.*;



public class MyEventListener extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		System.out.println("ping received");
		
		Message message = event.getMessage();
		String content = message.getContentRaw();
		content = content.toLowerCase();
		MessageChannel channel = event.getChannel();
		
		if (content.startsWith("!ping")) {
			System.out.println("ping received");
			channel.sendMessage("Pong " + event.getJDA().getPing()).queue();
			
		
		}
		
	}

}
