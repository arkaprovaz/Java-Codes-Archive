import java.util.*;
class Shapes{
    int x,y;
    void Get_xy(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter x & y");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    void Show_xy(){
        System.out.println("x= "+x+"y= "+y);
    }
}
class Rectangle extends Shapes{
    int ar;
    void Show_xy(){
        System.out.println("length is- " +x+ " breadth is- " +y );
    }
    void area(){
        ar = x*y;
        System.out.println("Area is- "+ar);
    }
}

class Overriding{
    public static void main(String args[]){
        Rectangle ob = new Rectangle();
        ob.Get_xy();
        ob.Show_xy();
        ob.area();
    }
}
