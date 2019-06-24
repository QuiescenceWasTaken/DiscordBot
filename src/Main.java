import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception{
            
        JDA api = new JDABuilder(AccountType.BOT).setToken("NTAzMjQ4MDcxMjQxNzYwNzY4.D3QXkw.EhszUh70yXsVg5phtQKQmjhMwmA").buildAsync(); 
        api.addEventListener(new MyEventListener());
        api.addEventListener(new GetWeapon());
        api.addEventListener(new addCharSheet());
        api.addEventListener(new changeStat());
        api.addEventListener(new myStats());
        api.addEventListener(new addInventorySheet());
        api.addEventListener(new addItem());
        api.addEventListener(new removeItem());
        api.addEventListener(new checkinv());
        System.out.println("event listener added");
        
    }
}
	