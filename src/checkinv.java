	import net.dv8tion.jda.core.entities.*;
	import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
	import net.dv8tion.jda.core.hooks.ListenerAdapter;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;

	
public class checkinv extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw();
		content = content.toLowerCase();
		MessageChannel channel = event.getChannel();
		
		if (content.startsWith("!checkinv")) {
            String Userid = event.getAuthor().getId();
            String fileName = Userid + "Inven.txt";
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                String[] items = line.split(",");
                String yes = Arrays.toString(items);
                channel.sendMessage(yes).queue();
            } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
