import java.util.Scanner;

abstract class Shapes {
    int x, y;
    void getxy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y : ");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    abstract void area();
}

class Rectangle extends Shapes {
    void area() {
        int ar = x*y;
        System.out.println("The area of Rectangle is : " +ar);
    }
}

class Square extends Shapes {
    int a;
    void getxy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        a = sc.nextInt();
    }
    void area() {
        int ar = a*a;
        System.out.println("The area of Square is : " +ar);
    }
}

class Abstract {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        r.getxy();;
        r.area();
        s.getxy();
        s.area();
    }
}
