public class Square {
    public static void main(String args[]) {
        Square s1 = new Square();
        int ar;
        ar = s1.squareArea(2);
        System.out.println("The area is : " + ar);
    }

    int squareArea (int s) {
        int area;
        area=(s*2);
        return area;
    }
}
