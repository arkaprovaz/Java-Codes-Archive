import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] list = {1, 3, 4, 5, 7, 8, 9, 20, 37, 50, 100}; // A sorted list
		System.out.println("List:");
		for (int i : list) {
			System.out.print(i +", ");
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);

		System.out.println("What number do you want?");

		int num = scan.nextInt();

		System.out.println("That number is in position " + binarySearch(num, list));
	}

	public static int binarySearch(int num, int[] sortedList) {
		int low = 0;
		int high = sortedList.length-1;

		while (low <= high){
			int mid = (high+low) / 2;
			if (sortedList[mid] == num) {
				return mid;
			} else if (sortedList[mid] > num) {
				high = mid -1;
			} else {
				low = mid +1;
			}
		}
		return 0;
	}
}
