package OOPs;

abstract class CompanyDetail {

	String companyName = "RBA Infotec";
	float turnOver = 20341.54f;

	CompanyDetail() {
		System.out.println("Parent class Constructor");
	}

	abstract void displayCompanyName(); // abstract method

	void displayTurnOver() {
		System.out.println("Turn Over: " + turnOver);
	}
}

class Sample extends CompanyDetail {

	Sample() {
		
	}

	void displayCompanyName() {
		System.out.println("in override method: " + companyName);
		super.displayTurnOver();
	}

}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CompanyDetail companyDetails = new CompanyDetail();

		Sample sample = new Sample();
		sample.displayCompanyName(); // method call

		CompanyDetail companyDetail = new Sample();
		companyDetail.displayCompanyName();
		companyDetail.displayTurnOver();

	}

}
