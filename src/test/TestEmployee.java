package test;

public class TestEmployee <T extends Employee> {
	
	int salary;
	
	public TestEmployee(T t) {
		this.salary = ((Employee) t).getSalary();
		Object o = new Object();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}

