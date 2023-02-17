import java.util.Scanner;

class Circle {
   public double display1() {
    return System.out.println("Dao Anh Khanh hoc Java");
   }
   public double display2() {
    return System.out.print("Dao Anh Khanh ma sinh vien 2121050779");
   }
}
public class Dao_Anh_Khanh {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.display1());
        System.out.println(c.display2());
    }
}
