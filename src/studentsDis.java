import java.util.Scanner;
public class studentsDis {
		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			double points = 0;
			boolean disabledOrNot = false; 
			
			//Ask question to user
			System.out.println("Do you have a disability?");
			System.out.println("Answer Yes or No.");
			
			//Get user input
			String answer = scnr.nextLine();
			
			//Make sure user answers yes or no
			while(!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No"))) {
				System.out.println("Please enter Yes or No.");
				answer = scnr.nextLine();
			}
			
			//Check if user said yes or no and assign boolean value
			if(answer.equalsIgnoreCase("Yes")) {
				disabledOrNot = true;
			}else if(answer.equalsIgnoreCase("No")) {
				disabledOrNot = false;
			}
			
			//If user said yes then points increase by 4, otherwise points do not increase
			if(disabledOrNot) {
				points+=4;
			}else {
				points+=0;
			}
		}

	}
