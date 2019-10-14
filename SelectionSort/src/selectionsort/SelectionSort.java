
    package selectionsort;

    /**
    * @author Sanush Radalage
    * Date : 10-15-2019
    * 
    * This program consist with selection sort algorithm
    */
    public class SelectionSort {

       void sort(int arr[]) 
    { 
        int n = arr.length; 

        for (int i = 0; i < n-1; i++) 
        {  
            int min = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min]) 
                    min = j; 

            int temp = arr[min]; 
            arr[min] = arr[i]; 
            arr[i] = temp; 
        } 
    } 

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 


    public static void main(String[] args) 
    {
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 

    }

    }
