package set;

import java.util.Comparator;

public class IDComprator implements Comparator<EmployeeTreeSet1> {

	public int compare(EmployeeTreeSet1 e1, EmployeeTreeSet1 e2) {
		// TODO Auto-generated method stub
		return e1.id-e2.id;
	}

}
