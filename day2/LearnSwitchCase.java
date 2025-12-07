package week1.day2;

public class LearnSwitchCase {
	
	public static void main(String[]args) {
		
		String browser="Chrome";
		
		//shortcut: type switch and do ctrl+space
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome browser launched successfully");			
			break;

		case "Edge":
		System.out.println("Edge is launched");
		break;
		
		case "Safari":
		System.out.println("Safari browser is launched successfully");
		break;
		
		default:
			System.out.println("OPEN IE");
			
		}
	}

}
