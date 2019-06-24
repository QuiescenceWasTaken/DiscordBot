	import net.dv8tion.jda.core.entities.*;
	import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
	import net.dv8tion.jda.core.hooks.ListenerAdapter;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;
	
	public class changeStat extends ListenerAdapter {
		public void onMessageReceived(MessageReceivedEvent event) {
			
			if (event.getAuthor().isBot()) return;
			
			Message message = event.getMessage();
			String content = message.getContentRaw();
			content = content.toLowerCase();
			MessageChannel channel = event.getChannel();
			
			if (content.startsWith("!changestat")) {
                String Userid = event.getAuthor().getId();
                String fileName = Userid + ".txt";
                String [] stats = new String [0];
                
                try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();
                    String[] split_content = content.split(" ");
                    String var = split_content[1];
                    channel.sendMessage("Your " + split_content[1] + " is now " + split_content[2]).queue();
                    int statChanged = statMain(var);
                    System.out.println(statChanged);
                    String last_value = split_content[split_content.length - 1];
               
                    stats = line.split("\\|");
                    System.out.println(Arrays.toString(stats));
                    if (stats.length == 0) { return; }
                  	stats[statChanged] = "" + Integer.parseInt(last_value);
                   
                        
                    } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("hi");
            	}
              
              	String writeBack = "";
                for(int i = 0; i < stats.length; i++) {
                    writeBack += stats[i];
                    if (i == stats.length - 1) { continue; }
                    writeBack += "|";  
                }
                
                try {
                    FileWriter filewriter =
                        new FileWriter(fileName);
                    BufferedWriter bufferedWriter = 
                        new BufferedWriter(filewriter);
                    bufferedWriter.write(writeBack);
                    bufferedWriter.close();
                } catch(IOException ex) {
                    System.out.println(
                        "Error writing to file '"
                        + fileName + "'");
                }     
            }   
    }

		private int statMain(String var) {
			int statChanged = 0;
			switch (var) {
			case "str":
				statChanged = 0;
				break;
			case "dex":
				statChanged = 1;
				break;
			case "con":
				statChanged = 2;
				break;
			case "int":
				statChanged = 3;
				break;
			case "wis":
				statChanged = 4;
				break;
			case "cha":
				statChanged = 5;
				break;
				
			}
			return statChanged;
		}
}
