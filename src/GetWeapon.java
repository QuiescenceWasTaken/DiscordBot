import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import java.util.*;

public class GetWeapon extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {
		System.out.println("ping received");
		if (event.getAuthor().isBot()) return;
		
		Message message = event.getMessage();
		String content = message.getContentRaw();
		MessageChannel channel = event.getChannel();
		
		if (content.startsWith("!getweap")) {
			Random rand = new Random();
            int a = rand.nextInt(37);
            int b = rand.nextInt(27);
            int c = rand.nextInt(28);
            String[] weapList = {"Club", "Hammer", "Dagger", "Wand", "Handaxe", "Javelin", "Light Hammer", "Mace", "Quarterstaff", "Sickle", "Spear", "Crossbow", "Dart", "Shortbow", "Sling", "Battleaxe", "Flail", "Glaive", "Greataxe", "Greatsword", "Halberd", 
            		"Lance", "Longsword", "Maul", "Morningstar", "Pike", "Rapier", "Scimitar", "Katana", "Trident", "War Pick", "Warhammer", "Whip", "Blowgun", "Longbow", "Net", "Staff", "Orb", "Shurikens"};
            System.out.println("Pong Recieved");
            String[] prefixList= {"Rusty", "Dented", "Broken", "Shattered", "Brittle", "Shiny", "Antique", "Reinforced", "Savage", "Immense", "Light", "Flaming", 
            		"Shocking", "Chilling", "Holy", "Wicked", "Fiery", "Thunderous", "Freezing", "Godly", "Demonic", "Steadfast", "Unrelenting", "Destructive", 
            		"Impressive", "Legendary", "Boundless"};
            String[] suffixList= {"of Strength", "of Speed", "of Wisdom", "of Charm", "of Knowledge", "of Health", "of Brawn", "of Finesse", "of Protection", "of Detection", "of Memory", 
            		"of Showmanship", "of the King", "of the Hero", "of the Scholar", "of the Magi", "of the Emperor", "of the Barbarian", "of the General", "of the Shadow", "of the Ranger", 
            		"of the Duelyst", "of the Mountain", "of the Guardian", "of the Chieftan", "of the Templar", "of the Monk", "of the Scion"};
            
            
            channel.sendMessage(prefixList[b] + " " + weapList[a]+ " "  + suffixList[c]).queue();
			
		
		
		}
	}

}
