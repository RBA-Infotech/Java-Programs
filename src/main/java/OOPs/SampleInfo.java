package OOPs;

public class SampleInfo implements Employeeable, Presentable {

	
	
	public void showEmpDetails() {
		empName="Akshaya";
		empNo = 10;
		System.out.println("The emp name: " + empName);
	}

	public void showPresent() {
		System.out.println("Another method from another Interface");
	}
}
