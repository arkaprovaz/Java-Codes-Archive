

import java.util.Arrays;

class Driver {
	
	public static void main(String[] args) {
		
		Employee[] empl = new Employee[3];
		empl[0] = new Employee(15, "ankit", 27, 20000);
		empl[1] = new Employee(2, "sharma", 25, 15000);
		empl[2] = new Employee(3, "baby", 29, 17000);
		
		
		System.out.println("*******Before Sorting**********");
		System.out.println(Arrays.toString(empl));
		//Arrays.sort(empl);
		System.out.println("*******After Sorting using comparable**********");
		
		System.out.println(Arrays.toString(empl));
		
		System.out.println("*******After Sorting using comparable**********");
		Arrays.sort(empl, new AgeComprator());
		System.out.println(Arrays.toString(empl));
	}

}
