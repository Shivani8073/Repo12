package set;

import java.util.Comparator;

public class PerformceComparator implements Comparator<EmployeeTreeSet1> {

	@Override
	public int compare(EmployeeTreeSet1 e1, EmployeeTreeSet1 e2) {
		// TODO Auto-generated method stub
		return e1.perfRating-e2.perfRating;
	}

}
