package Employee;

public class CompanyEmpWage {


public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;

public final String company;
public final int EMPLOYEE_WAGE;
public final int WORKING_DAYS;
public final int MaxHours;
public int totalEmpWage;
public CompanyEmpWage(String company,int EMPLOYEE_WAGE,int WORKING_DAYS,int MaxHours) {	
	this.company=company;
	this.EMPLOYEE_WAGE=EMPLOYEE_WAGE;
	this.WORKING_DAYS= WORKING_DAYS;
	this.MaxHours=MaxHours;
}
public void setTotalEmployeeWage(int total_empWage) {
	this.totalEmpWage=total_empWage;
}
}

