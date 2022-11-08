package lasersat;


import java.util.Scanner;

 public class Day1 {
	public float get() 
	{	                                                                      // SCANNER IS USED FOR GETTING THE INFORMATION
		Scanner scr = new Scanner(System.in);
		System.out.println("\t\t\t***** LASER-SAT INDUSTRIES *****");
		System.out.println("\t\t\t\t CHENNAI-6000-231.");
		System.out.println("\t\t\t******************************");
		System.out.println("EMPLOYEE -DETAILS :\n");
		System.out.print ("NAME OF THE EMPLOYEE           : ");
		 String name=scr.nextLine();
		 System.out.print("ID OF THE EMPLOYEE             : ");
		 int id=scr.nextInt();
		 System.out.print("GENDER OF THE EMPLOYEE         : ");
		 char gen=scr.next().charAt(0);
		 scr.nextLine();
		 System.out.print("DESIGNATION OF THE EMPLOYEE    : ");
		 String des=scr.nextLine();
		 System.out.print("MOBILE  OF THE EMPLOYEE        : ");
		 double mob=scr.nextLong();
		 System.out.println("\nSALARY - DETAILS :");
		 System.out.print("MONTH-1  OF THE EMPLOYEE       : ");
		 float mon1=scr.nextFloat();
		 System.out.print("MONTH-2 OF THE EMPLOYEE        : ");
		 float mon2=scr.nextFloat();
		 System.out.print("MONTH-3 OF THE EMPLOYEE        : ");
		 float  mon3=scr.nextFloat();
		 float sum = ((mon1+mon2+mon3)/3);
		return sum;
		
}
		 
	// STEP -3 (CONDITION CHECKING PROGROSS....)	
	public float details (float sum){
		 
	         System.out.println("\n AVERAGE INCOME OF EMPLOYEE : $"+sum);
    	    if(sum>=7000)
		 	{
		 		System.out.println(" $$ IN THE EMPLOYEE IS RICH $$");
		 	}
		 	else
		 	{
		 		System.out.println(" $$ IN THE EMPLOYEE IS POOR $$");
		 	}
		 		
		     System.out.println("\n**** HAVING THE GREAT DAY ****");
		     return sum;
			
	
 }
	public void details2(float sum) {
		int level;
	
		if(sum>7000)
		 level=1;
		else
		 level=2;
			
		switch (level)
		{
		case 1 :
			
			 	
			 		System.out.println(" $$ IN THE EMPLOYEE IS RICH $$");
			 		break;
			 	
		case 2:
		
			
		 	
		 		System.out.println(" $$ IN THE EMPLOYEE IS POOR $$");
		 		break;
		 	
		}
		}

	
	 
 // MAIN - FUNCTION :
 
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("ENTER THE LIMIT :");
		int n=scr.nextInt();
		float sum;
		int level;	
		Day1 t=new Day1();
		for(int i=0;i<n;i++) {
		sum=t.get();
		sum=t.details(sum);
		t.details2(sum);
		
		}
			
		

	}
 }
	

	

