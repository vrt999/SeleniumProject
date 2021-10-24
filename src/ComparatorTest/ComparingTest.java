package ComparatorTest;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	String name;
    int age;
    double salary;
    long mobile;
    
	public Employee(String name,int age,double salary,long mobile) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}
    
    public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public long getMobile() {
		return mobile;
	}
	
	@Override
	public String toString() {		
		return "Employee"+"(name:"+this.name+", age: "+this.age+", salary: " + this.salary + ", mobile: " +this.mobile+")";		
	}

    // constructors, getters & setters
}

public class ComparingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("John", 25, 3000.0, 9922001); 
		Employee e2 = new Employee("Ace",22, 2000.0, 5924001); 
		Employee e3 = new Employee("Keith", 35, 4000.0, 3924401);
		
	    Employee[] employees = new Employee[] {e1,e2,e3};
/*	    Employee[] sortedEmployeesByName = new Employee[] {};
	    Employee[] sortedEmployeesByNameDesc = new Employee[] {};
	    Employee[] sortedEmployeesByAge = new Employee[] {};*/
	    
	    Comparator<Employee> employeeNameComparator
	      = Comparator.comparing(Employee::getName);
	    
	    Comparator<Employee> employeeNameComparatorDesc
	      = Comparator.comparing(Employee::getName,(s1,s2)-> s2.compareTo(s1));
	    
	    Comparator<Employee> employeeNameSortReverse
	      = Comparator.comparing(Employee::getName,(s1,s2)-> s2.compareTo(s1)).reversed();
	    
	    Comparator<Employee> employeeAgeSortReverse
	      = Comparator.comparing(Employee::getAge,(s1,s2)-> s1-s2).reversed();
	    
	    Arrays.sort(employees, employeeNameComparator);
	    for(Employee e:employees)
	    	System.out.println("The name sorted asc employee list : " + e);
	    
	    Arrays.sort(employees, employeeNameComparatorDesc);
	    for(Employee e:employees)
	    	System.out.println("The name sorted desc employee list : " + e);
	    
	    Arrays.sort(employees, employeeNameSortReverse);
	    for(Employee e:employees)
	    	System.out.println("The name sorted reverse employee list : " + e);
	    
	    Arrays.sort(employees, employeeAgeSortReverse);
	    for(Employee e:employees)
	    	System.out.println("The age sorted reverse employee list : " + e);
	    
//	    assertTrue(Arrays.equals(employees, sortedEmployeesByName));

	    System.out.println("employee e1 : " + e1);
	    
	    

	}

}
