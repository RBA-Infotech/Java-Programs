package MethodReference;


	interface Inf1
	{
		int MaxSalary(int e1,int e2);
	}
	
	public class MethodReference1 {

		public static void main(String[] args) {
		  Inf1 i1=Math::max;
		  int result=i1.MaxSalary(80000,70000);
		  System.out.println("Maximum salary is : " + result);
		}

	}

