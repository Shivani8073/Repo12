package set;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> {

	int id;
	String name;
	double salary;
	double experience;
	int perfRating;
	
	EmployeeTreeSet(int id,String name,double salary,double experience,int perfRating)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.experience=experience;
		this.perfRating=perfRating;
				
	}

	public int compareTo(EmployeeTreeSet o) {
		
		return this.id-o.id;
	}
	
}

