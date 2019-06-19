import java.util.Scanner;

class Triangle {
    int b,h;
    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }
    float area() {
        return((b*h));
    }
}
class This {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        Triangle c1 = new Triangle(b, h);
        System.out.println("Area = " + c1.area());
    }
}