package MethodReference;

import java.util.function.Supplier;

class Claim {
	int claimID = 123;
	float claimAmout = 25000.54f;
	String claimStatus = "Approved";

	public Claim() {
		System.out.println("Claim ID: " + claimID +"\tClaim Amount: " + claimAmout + "\tStatus : " + claimStatus);
	}

}

public class Constructor {

	public static void main(String[] a) {

		Supplier<Claim> claimConstructor = Claim::new;

		claimConstructor.get();
	}

}
