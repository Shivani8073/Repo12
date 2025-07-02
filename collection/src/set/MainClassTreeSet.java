package set;

import java.util.TreeSet;

public class MainClassTreeSet {

	public static void main(String[] args) {

		EmployeeTreeSet e1=new EmployeeTreeSet(105,"James",20000.00,3.5,4);
		EmployeeTreeSet e2=new EmployeeTreeSet(103,"King",25000.00,2.5,5);
		EmployeeTreeSet e3=new EmployeeTreeSet(102,"Poker",30000.00,1.5,3);
		EmployeeTreeSet e4=new EmployeeTreeSet(104,"Amanda",40000.00,4.5,4);
		EmployeeTreeSet e5=new EmployeeTreeSet(106,"Bala",50000.00,3.0,2);
		EmployeeTreeSet e6=new EmployeeTreeSet(101,"Victor",60000.00,2.5,1);
		
		TreeSet<EmployeeTreeSet> empset = new TreeSet<EmployeeTreeSet>();
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		empset.add(e5);
		empset.add(e6);
		
		System.out.println("Total Employees"+empset.size());
		System.out.println("ID\tName\tSalary\tExp\tPerformanceRating");
		System.out.println("---------------------------------------------");
		for(EmployeeTreeSet ts:empset)
		{
			System.out.println(ts.id+"\t"+ts.name+"\t"+ts.salary+"\t"+ts.experience+"\t"+ts.perfRating);
		}
		
	}

}
