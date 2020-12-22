package CoachingStaff;

import java.util.ArrayList;

public class PrintCoach {
	String staffName;
	String staffSuname;
	String staffTitle;
	int staffID = 1;

	CoachFactory cf = new CoachFactory();
	ArrayList<CoachStaff> coachList = new ArrayList<CoachStaff>();

	public PrintCoach() {
		for (int i = 1; i <= 30; i++) {
			this.staffName = cf.getRandomCoachName();
			this.staffSuname = cf.getRandomCoachSurname();
			this.staffTitle = cf.getRandomCoachTitle();
			CoachStaff newCoach = new CoachStaff(staffName, staffSuname, staffTitle, staffID);
			addCoach(newCoach);
			staffID++;
		}
	}

	public void addCoach(CoachStaff coachStaff) {
		coachList.add(coachStaff);
	}

	public void printCoaches() {
		for (CoachStaff coaches : coachList) {
			System.out.println("Full name: " + coaches.toString() + "\n" + "Job Title: " + coaches.getStaffTitle()
					+ "\nID: " + coaches.getStaffID() + "\n ");
		}
	}

}
