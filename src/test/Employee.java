package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Employee {
 
    int id ;
    int salary;
    String departmentName;
 
   // getters 
   // setters
 
    public Employee(int id, int salary, String departmentName) {
    	this.id = id;
    	this.salary = salary;
    	this.departmentName = departmentName;
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,100,"A"));
		list.add(new Employee(2,200,"B"));
		list.add(new Employee(3,300,"C"));
		list.add(new Employee(4,800,"A"));
		list.add(new Employee(5,350,"C"));
		list.add(new Employee(6,550,"B"));
		list.add(new Employee(7,400,"C"));
		printAllDepartmentNamesOrderBySalaryDesc(list);
		
	}
     public static void printAllDepartmentNamesOrderBySalaryDesc(List<Employee> emps){
    	 
//    	 emps.stream().collect()
//    	 Map<String, Integer> out = new HashMap<>();
//    	 for(Employee e : emps) {
//    		 
//    		if(out.containsKey(e.getDepartmentName())) {
//    			out.put(e.getDepartmentName(), e.getSalary()+ out.get(e.getDepartmentName()));
//    		}else {
//    				out.put(e.getDepartmentName(), e.getSalary());
//    		}
//    		 
//    	 }
    	 
    	 
    	 Map<String, Integer> out = new HashMap<>();
    	 for (Employee e : emps) {
    	     out.merge(e.getDepartmentName(), e.getSalary(), Integer::sum);
    	 }
 
    	 out.entrySet().stream().sorted((e1, e2)-> e2.getValue()-e1.getValue()).forEach(e->System.out.println(e.getKey() + " " + e.getValue()));
    	 
    	 
System.out.print(out.entrySet().stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getValue()))).get().getValue());
     }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
     
     
     
     
  }
 
//Employee Data :
// 
//  1,100,A
//  2,200,B
//  3,300,C
//  4,800,A
//  5,350,C
//  6,550,B
//  7,400,C
// 
//Expected Output :
// 
//  C - 1050
//  A - 900
//  B - 750
//has context menu