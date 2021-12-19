class EmployeWageUc1 {
public static void main(String[] Args) {
	int IsFullTime = 1;
	double EmpCheck = Math.floor(Math.random() * 10) % 2;
	if (EmpCheck == IsFullTime)
	System.out.println("Employee is Present");
	else
	System.out.println("Employee is Not Present");
	}
}