
public class NestedIfContnues {

	public static void main(String[] args) {
		// check if patient has any allergies
		//if no allergies-->you are healthy
		//otherwise check if patient has:
		   //orange allergy-->dont eat oranges
		   //apple allergy-->dont eat apple
		   //kiwi allergy-->dont eat kiwis
		
		boolean allergy=true;
		boolean orangeAllergy=true;
		boolean appleAllergy=true;
		boolean kiwiAllergy=true;
		
		if(allergy) {
			System.out.println("Please answer below");
			
		if(orangeAllergy) {
			System.out.println("Do not eat orange");
		
		if(appleAllergy) {
			System.out.println("Do not eat apple");
			
		if(kiwiAllergy) {
			System.out.println("Do not eat kiwi");
		}
		}
		}
		}else {
			System.out.println("You are healthy");
		}

	}

}
