package Employee;

public class Employee {
    //Constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=100;
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program");
	//Variable
	int empWage=0;
	int empHours=0;
	int empCheck=(int)Math.floor(Math.random() * 10) %3;
	System.out.println("employeeCheck : "+empCheck);
	if(empCheck == IS_PART_TIME) {
	   System.out.println("Parttime Employee is present");
	   empHours =4;
	}
	else if(empCheck == IS_FULL_TIME) {
		System.out.println("Fulltime Employee is present");
	    empHours=8;
	}
	else {
		empHours=0;
		System.out.println("Employee absent");
	}
	//computation
	empWage =empHours * EMP_RATE_PER_HOUR;
	System.out.println("Employee Daily Wage: "  +empWage);
}
}

