package AdminStaff;

import java.util.ArrayList;

public class PrintAdmStaff {

	String staffName;
	String staffSuname;
	String staffTitle;
	int staffID = 1;

	AdmStaffFactory admFactory = new AdmStaffFactory();
	ArrayList<AdmStaff> admList = new ArrayList<AdmStaff>();

	public PrintAdmStaff() {

		for (int i = 1; i <= 10; i++) {
			this.staffName = admFactory.getRandomAdmStaffName();
			this.staffSuname = admFactory.getRandomAdmStaffSurname();
			this.staffTitle = admFactory.getRandomAdmTitle();
			AdmStaff newAdm = new AdmStaff(staffName, staffSuname, staffTitle, staffID);
			addAdm(newAdm);
			staffID++;

		}

	}

	public void addAdm(AdmStaff admStaff) {
		admList.add(admStaff);
	}

//	List all staff 
	public void printAdmNames() {
		for (AdmStaff admStaffs : admList) {
			System.out.println("Full name: " + admStaffs.toString() + "\n" + "Job Title: " + admStaffs.getStaffTitle()
					+ "\nID: " + admStaffs.getStaffID() + "\n ");
		}
	}

}
