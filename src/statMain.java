
public class statMain {	
	static int statMain(String var) {
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
