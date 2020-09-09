package basic;

public class LearnConcatenation {
	
	// Concatenation: Joining a variable with a string value

	public static void main(String[] args) {
		String firstName= "James";
		String lastName= "William";
		
		System.out.println( "My Name is "+firstName);
		System.out.println( "My First name is "+firstName+" Last name is "+lastName);

		LearnAccessModifier lam=new LearnAccessModifier();
		System.out.println(lam.contactNumber);
		lam.display();
		lam.num=39; // ReAssign value
		System.out.println(lam.num);
	
	}

}
