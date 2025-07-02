package list;

import java.util.ArrayList;
import java.util.LinkedList;



public class MainClass {

	public static void main(String[] args) {

		Employee e1= new Employee(101,"James",20000.00);
		Employee e2= new Employee(102,"King",22000.00);
		Employee e3= new Employee(103,"Poker",300000.00);
		Employee e4= new Employee(104,"Amanda",10000.00);
		Employee e5= new Employee(105,"Bala",40000.00);
		Employee e6= new Employee(106,"Victor",25000.00);
		
		ArrayList<Employee> empList= new ArrayList<Employee>();
		//LinkedList<Employee> empList= new LinkedList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		System.out.println("Total Employees :"+empList.size());
		System.out.println("ID\tName\tSalary");
		System.out.println("--------------------------");
		for(Employee emp:empList)
		{
			System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary);
		}
	}

}
