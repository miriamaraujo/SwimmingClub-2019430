package SwimmingClub;

import AdminStaff.PrintAdmStaff;
import CoachingStaff.PrintCoach;

public class CLI {
	public CLI() {
		
		System.out.println("*** ADM STAFFS ***\n");
		PrintAdmStaff printAdmNames = new PrintAdmStaff();
		printAdmNames.printAdmNames();
		System.out.println("***********************************\n");
		System.out.println("*** COACH STAFFS ***\n");
		PrintCoach printcoaches = new PrintCoach();
		printcoaches.printCoaches();

	}
	
	
}
