package OOPs;

class UniversityDetails {

	int univID;
	String univName;
	int univRank;

	UniversityDetails() {
		univID = 1000;
		univName = "Anna University";
		univRank = 1;
		
	}

	UniversityDetails(int univID, String univName) {
		this.univID = univID;
		this.univName = univName;
	}

	public UniversityDetails(int univID, String univName, int univRank) {

		this.univID = univID;
		this.univName = univName;
		this.univRank = univRank;
	}

	void getUnivDetails() {
		System.out.println("ID: " + univID + "\tUniversity Name: " + univName + "\t Rank: " + univRank);
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniversityDetails u1 = new UniversityDetails();
		u1.getUnivDetails();

		UniversityDetails u2 = new UniversityDetails(200, "VIT University");
		u2.getUnivDetails();

		UniversityDetails u3 = new UniversityDetails(300, "SRM University", 2);
		u3.getUnivDetails();

	}

}
