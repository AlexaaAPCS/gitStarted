import java.util.Scanner;
public class studentsJob {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean hasJob = false;
		double points = 0;
		
		//Ask question to user
		System.out.println("Do you have an on campus job?");
		System.out.println("Answer Yes or No");
		
		//Get user input
		String answer = scnr.nextLine();
		
		//Make sure user answers yes or no
		while(!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No"))) {
			System.out.println("Please enter Yes or No.");
			answer = scnr.nextLine();
			}
		
		//um maybe i did something
		
		//Check if user said yes or no and assign boolean value
		if(answer.equalsIgnoreCase("Yes")) {
			hasJob = true;
			}else if(answer.equalsIgnoreCase("No")) {
				hasJob = false;
			}
		//If user said yes then points increase by 2.5, otherwise points do not increase
		if(hasJob) {
			points+=2.5;
			}else {
				points+=0;
			}
	}
}
