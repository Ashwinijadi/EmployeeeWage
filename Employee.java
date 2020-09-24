package Employee;

public class Employee {
	 public static void main(String[] args) {
    	 //TODO Auto-generated method stub
    	 
    	 System.out.println("Welcome to Employee Wage Computation Program");
    	 
    	 //Constants
    	 int IS_FULL_TIME=1;
    	 
    	 //Computation
    	 double empCheck=Math.floor(Math.random() * 10) % 2;
    	 if(empCheck == IS_FULL_TIME) {
 			System.out.print("Employee present");
    	 }
    	 else {
 			System.out.print("Employee absent");
 		}   	 
    	 
     }
}

