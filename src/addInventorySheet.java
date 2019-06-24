import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.guild.*;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.guild.member.*;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.requests.RestAction;
import java.util.*;
import java.io.*;

public class addInventorySheet extends ListenerAdapter {
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		System.out.print("Someone joined");
		String Userid = event.getUser().getId();
		String fileName = Userid + "Inven.txt" ;
		try {
			FileWriter filewriter =
				new FileWriter(fileName);
			BufferedWriter bufferedWriter = 
				new BufferedWriter(filewriter);
			bufferedWriter.write("");
			bufferedWriter.close();
		}
		catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");

		
		
		
		
		}	 
	}

}