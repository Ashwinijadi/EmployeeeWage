package Employee;

public interface InterfaceComputeEmployeeWage {
	public void addCompanyEmpWage(String company,int EMPLOYEE_WAGE,int WORKING_DAYS,int MaxHours);
    public void CalculateEmployee();
    public int getTotalWage(String company);
}
