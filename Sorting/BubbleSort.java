import java.util.Scanner;
public class BubbleSort {
    int array[];
    int n;
    public BubbleSortDemo(int size) {
        n = size;
        array = new int[n];
    }
    public void readArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public void showArray() {
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }
    public void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = a[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("After " + (i + 1) + " Pass");
            showArray();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = s.nextInt();
        BubbleSortDemo bubbleSortDemo = new BubbleSortDemo(n);
        bubbleSortDemo.readArray();
        System.out.println("Before Bubble Sort");
        bubbleSortDemo.showArray();
        bubbleSortDemo.bubbleSort();
        System.out.println("After Bubble Sort");
        bubbleSortDemo.showArray();
    }
}
