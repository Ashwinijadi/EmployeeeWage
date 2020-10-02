package Employee;

public class CompanyEmpWage {

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
	totalEmpWage=0;
}
public void setTotalEmployeeWage(int totalEmpWage) {
	this.totalEmpWage=totalEmpWage;
}
public String toString() {
return "Total EmpWage: "+totalEmpWage+", Name of Company :"+company;	
}
}

