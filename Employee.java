package Employee;

public class Employee {
	public static void main(String[] args) { 	
	      //TODO Auto-generated method stub
			
			System.out.println("Welcome to Employee Wage Computation Program");	
		   	 //Constants
		   	 int IS_FULL_TIME=1;
		   	int EMP_RATE_PER_HOUR=20;	   	 
		      //Variable
		  		int empWage;
		  		int empHours=0;
		      //Computation
		   	 double empCheck=Math.floor(Math.random() * 10) % 2;
		   	 if(empCheck == IS_FULL_TIME) {
					System.out.println("Employee present");
					 empHours=8;
		   	 }
		   	 else {
		   		 empHours=0;
					System.out.println("Employee absent");
				}  
		   	 //Wage Calculation
		   	empWage =empHours * EMP_RATE_PER_HOUR;
			System.out.println("Employee Daily Wage: "  +empWage);
		   	 
		    }
}

