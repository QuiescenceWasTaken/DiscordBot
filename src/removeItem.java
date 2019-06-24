	import net.dv8tion.jda.core.entities.*;
	import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
	import net.dv8tion.jda.core.hooks.ListenerAdapter;
	import java.util.Arrays;  
	import java.util.List;  
	import java.util.ArrayList; 

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;
public class removeItem extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw();
		content = content.toLowerCase();
		MessageChannel channel = event.getChannel();
		
		if (content.startsWith("!removeitem")) {
            String Userid = event.getAuthor().getId();
            String fileName = Userid + "Inven.txt";
            String [] items = new String [0];
            String item = new String (" ");
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                String[] split_content = content.split(" ");
                item = split_content[1];
                String yes = Arrays.toString(items);
                System.out.println(yes);
                ArrayList<String> inventory = new ArrayList<String>( );
                for (String s : line.split(",")){
                	inventory.add(s);
                }
                inventory.remove(item);
                StringBuilder SB = new StringBuilder();
                for (String s: inventory) {
                	SB.append(s);
                	SB.append(",");
                }
     
                try {
                    FileWriter filewriter =
                        new FileWriter(fileName);
                    BufferedWriter bufferedWriter = 
                        new BufferedWriter(filewriter);
                    bufferedWriter.write(SB.toString());
                    bufferedWriter.close();
                } catch(IOException ex) {
                    System.out.println(
                        "Error writing to file '"
                        + fileName + "'");
                
	}

} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	}
	}
