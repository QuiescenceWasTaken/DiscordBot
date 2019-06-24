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

public class addItem extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw();
		content = content.toLowerCase();
		MessageChannel channel = event.getChannel();
		
		if (content.startsWith("!additem")) {
            String Userid = event.getAuthor().getId();
            String fileName = Userid + "Inven.txt";
            String [] items = new String [0];
            File file = new File(fileName);
            String[] split_content = content.split(" ");
            String item = split_content[1];
            item = item + ",";
            try {
				FileWriter fr = new FileWriter(fileName, true);
				BufferedWriter br =new BufferedWriter(fr);
				br.write(item);
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
		
	}
}
