import java.util.Scanner;

class Triangle {
    float x,y;
    Triangle(int c, int d) {
        x=c;
        y=d;
    }
    Triangle(int c, float d) {
        x=c;
        y=d;
    }
    float area() {
        return((x*y)/2);
    }
}
class Overloading {
    public static void main(String args[]) {
        int b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height in integer   ");
        b = sc.nextInt();
        h = sc.nextInt();
        Triangle c1 = new Triangle(b,h);
        System.out.println("Area = " + c1.area());
        Triangle c2 = new Triangle(3,4.2f);
        System.out.println("Area = " + c2.area());
        
    }
}