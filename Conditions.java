public class Conditions{
    public static void main(String[] args) {
		
		System.out.println("Calculating the late fees of returning books --");
		
		System.out.println();
		
		System.out.println("Enter the number of days overdue :");
		Scanner sc1 = new Scanner(System.in);
		int days = sc1.nextInt();
		
		System.out.println();
		
	    System.out.println("Enter the type of book (regular, fictional, reference) :");
	    Scanner sc2 = new Scanner(System.in);
	    String book = sc2.nextLine();
	    
	    System.out.println();
	    
	    if(book.equalsIgnoreCase("regular") || book.equalsIgnoreCase("Regular")) {
	    	double lateFees = days * 0.50d;
	    	System.out.println("Late fees for Regular book for "+ days + " days is : " + lateFees + " $");
	    }else if(book.equalsIgnoreCase("fictional") || book.equalsIgnoreCase("Fictional")) {
	    	double lateFees = days * 0.70d;
	    	System.out.println("Late fees for Fictional book for "+ days + " days is : " + lateFees + " $");
	    }else if(book.equalsIgnoreCase("reference") || book.equalsIgnoreCase("Reference")) {
	    	System.out.println("No late fees for Reference books");
	    }else {
	    	System.out.println("Wrong Book Type");
	    }
    }
}

