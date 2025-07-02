package set;

import java.util.TreeSet;

public class MainClassTreeSet1 {

	public static void main(String[] args) {

		EmployeeTreeSet1 e1=new EmployeeTreeSet1(105,"James",20000.00,3.5,4);
		EmployeeTreeSet1 e2=new EmployeeTreeSet1(103,"King",25000.00,2.5,5);
		EmployeeTreeSet1 e3=new EmployeeTreeSet1(102,"Poker",30000.00,1.5,3);
		EmployeeTreeSet1 e4=new EmployeeTreeSet1(104,"Amanda",40000.00,4.5,4);
		EmployeeTreeSet1 e5=new EmployeeTreeSet1(106,"Bala",50000.00,3.0,2);
		EmployeeTreeSet1 e6=new EmployeeTreeSet1(101,"Victor",60000.00,2.5,1);
		
		IDComprator idwise = new IDComprator();
		PerformceComparator perfwise= new PerformceComparator();
		//TreeSet<EmployeeTreeSet1> empset = new TreeSet<EmployeeTreeSet1>(idwise);
		TreeSet<EmployeeTreeSet1> empset = new TreeSet<EmployeeTreeSet1>(perfwise);

		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		empset.add(e5);
		empset.add(e6);
		
		System.out.println("Total Employees"+empset.size());
		System.out.println("ID\tName\tSalary\tExp\tPerformanceRating");
		System.out.println("---------------------------------------------");
		for(EmployeeTreeSet1 ts:empset)
		{
			System.out.println(ts.id+"\t"+ts.name+"\t"+ts.salary+"\t"+ts.experience+"\t"+ts.perfRating);
		}
		
	}

}
