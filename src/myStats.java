	import net.dv8tion.jda.core.entities.*;
	import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
	import net.dv8tion.jda.core.hooks.ListenerAdapter;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;
	
public class myStats extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent event) {
	
	
	Message message = event.getMessage();
	String content = message.getContentRaw();
	content = content.toLowerCase();
	MessageChannel channel = event.getChannel();
	
	if (content.startsWith("!mystats")) {
        String Userid = event.getAuthor().getId();
        String fileName = Userid + ".txt";
        String [] stats = new String [0];
       
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            stats = line.split("\\|");
            channel.sendMessage("@" + (event.getAuthor().getAsTag())).queue();
            channel.sendMessage("Your Strength is " + stats[0] + "\n" + 
            "Your Dexterity is " + stats[1] + "\n" + 
            "Your Constitution is " + stats[2] + "\n" + 
            "Your Intelligence is " + stats[3] + "\n" + 
            "Your Wisdom is " + stats[4] + "\n" + 
            "Your Charisma is " + stats[5]).queue();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
	
}
