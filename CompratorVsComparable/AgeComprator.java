

import java.util.Comparator;

class AgeComprator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getAge() < o2.getAge())
		{
			return -1;
		}
		
		if(o1.getAge() > o2.getAge())
		{
			return 1;
		}
		
		return 0;
	}
	

}
