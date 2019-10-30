//Java Program to Implement Heap Sort on an Array of n Elements
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class HeapSort {
    //Function to sort the array using heapsort
    static void heapSort(int[] array){
             buildHeap(array);
             int i,temp = array.length-1;
             for(i = array.length-1; i>=1; i--){
                 int x = array[0];
                 array[0] = array[temp];
                 array[temp] = x;
                 temp--;
                 heapifyDownwards(array,0,temp);
             }
    }
    // Function to heapify the array
    static void heapifyDownwards(int[] array,int i,int n){
        if(i>n)
        {
            return;
        }
        int left,right,index = i;
        left = 2*i;
        right= 2*i+1;
        boolean change = false;
        if(left<=n && array[i]<array[left]){
            index = left;
            change = true;
        }
        if(right<=n && array[right]>array[index]){
            index = right;
            change = true;
        }
        if(!change)
        {
            return;
        }
        int temp = array[index];
        array[index] = array[i];
        array[i] = temp;
        heapifyDownwards(array,index,n);
    }
    // Function to build a max-heap
    static void buildHeap(int[] array){
        int i = array.length/2-1;
        for(;i>=0;i--){
            heapifyDownwards(array,i,array.length-1);
        }
    }
    // Function to read input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error Occurred");
            }
        }
        System.out.println("The initial array is");
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(array));
    }
}
