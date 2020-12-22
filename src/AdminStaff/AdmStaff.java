package AdminStaff;

public class AdmStaff {
//	The staff attributes 
	private String staffName;
	private String staffSuname;
	private String staffTitle;
	private int staffID = 1;
	
//	Default constructor
	public AdmStaff() {
		super();
	}

//	Staff constructors
	public AdmStaff(String staffName, String staffSuname, String staffTitle, int staffID) {
		super();
		this.staffName = staffName;
		this.staffSuname = staffSuname;
		this.staffTitle = staffTitle;
		this.staffID = staffID;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public String getStaffSuname() {
		return staffSuname;
	}


	public void setStaffSuname(String staffSuname) {
		this.staffSuname = staffSuname;
	}


	public String getStaffTitle() {
		return staffTitle;
	}


	public void setStaffTitle(String staffTitle) {
		this.staffTitle = staffTitle;
	}


	public int getStaffID() {
		return staffID;
	}


	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

//	Staff full name
	@Override
	public String toString() {
		return staffName +" "+ staffSuname;
	}
	
	
	

}
