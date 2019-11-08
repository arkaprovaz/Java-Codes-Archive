import java.util.*;
class SwapWithoutThirdVariable {  
 public static void main(String arg[]) { 
    int firstNo, secondNo;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numebrs to swap: ");
    firstNo = scanner.nextInt();
    secondNo = scanner.nextInt();
    System.out.println("Before swapping: ");  
    System.out.println("value of firstNo:" + firstNo);  
    System.out.println("value of secondNo:" + secondNo);  
    System.out.println("After swapping: ");  
    firstNo = firstNo + secondNo;  
    secondNo = firstNo - secondNo;  
    firstNo = firstNo - secondNo;  
    System.out.println("value of firstNo:" + firstNo);  
    System.out.println("value of secondNo:" + secondNo);
 }  
} 