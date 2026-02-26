package CollectionsDemo;

import java.util.LinkedList;

class Employee {
	private int empId;

	public Employee(int empId) {
		this.empId = empId;
	}

	public int getEmpID() {
		return empId;
	}
}

public class LinkedListEmployee {

	public static void main(String[] args) {
		LinkedList<Employee> firstList = new LinkedList<>();
		LinkedList<Employee> secondList = new LinkedList<>();
		firstList.addFirst(new Employee(2034));
		secondList.addFirst(new Employee(2034));
		
		if (firstList.contains(secondList.getFirst())) {
			System.out.println("Values are same");

		} else {
			System.out.println("Values are not same");
			System.out.println("First List: " + firstList.get(0) + "\nSecond List: " + secondList.getFirst());
		}

		if (firstList.get(0).getEmpID() == secondList.getFirst().getEmpID()) {
			System.out.println("Values are same");
			System.out.println(firstList.get(0).getEmpID());

		} else {
			System.out.println("Values are not same");
			System.out.println("First List: " + firstList.get(0) + "\nSecond List: " + secondList.getFirst());
			System.out.println(firstList.get(0).getEmpID());
		}
	}
}
