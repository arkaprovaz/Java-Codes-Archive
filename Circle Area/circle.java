public class Circle {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        int ar;
        ar = c1.circleArea(2);
        System.out.println("The area is : " + ar);
    }

    int circleArea (int r) {
        int area;
        area=(3.14 * (r^2));
        return area;
    }
}
