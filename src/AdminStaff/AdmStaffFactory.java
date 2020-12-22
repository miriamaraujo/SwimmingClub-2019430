package AdminStaff;

import java.util.Random;

public class AdmStaffFactory {

	private String[] admStaffName = { "Josefina", "Connie", "Meggan", "Onita", "Aurelia", "Andrea", "Harriett",
			"Tracee", "Heriberto", "Necole", "Mauricio", "Kayla", "Nubia", "Liberty", "Cassy", "Salley", "Debbra",
			"Delaine", "Tina", "Zoila", "Irish", "Mendy", "Hilton", "Hester", "Pearl", "Reta", "Kala", "Jonah",
			"Mayola", "Stefany", "Lessie", "Billie", "Carlos", "Christi", "Kaylene", "Tyra", "Vannessa", "Ramon",
			"Mitzie", "Gisele", "Ricky", "Consuelo" };
	private String[] admStaffSurname = { "Booth", "Green", "Cowan", "Lowe", "Best", "Snow", "Burgess", "Bradford",
			"Jefferson", "Heath", "Spears", "Michael", "Curry", "Raymond", "Holmes", "Harrington", "Barnes", "Ortiz",
			"Levine", "Freeman", "Moody", "Horton", "Butler", "Tucker" };
	private String[] admTitle = { "Regional Manager", "Assistant to the Regional Manager", "Accountant",
			"Receptionist" };
//	

	public AdmStaffFactory() {

	}
//	

	Random rd = new Random();

//	

	public String getRandomAdmStaffName() {

		String admStaffNameGenerator = admStaffName[rd.nextInt(admStaffName.length)];
		return admStaffNameGenerator;
	}
	
	public String getRandomAdmStaffSurname() {

		String admStaffSurnameGenerator = admStaffSurname[rd.nextInt(admStaffSurname.length)];
		return admStaffSurnameGenerator;
	}
	
	public String getRandomAdmTitle() {

		String admTitleGenerator = admTitle[rd.nextInt(admTitle.length)];
		return admTitleGenerator;
	}

}
