import java.util.Scanner;

class TestNumber {
    int Number;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number is : ");
        Number = sc.nextInt();
    }

    public void getCheckNumber() {
        if(Number % 2 == 0) System.out.println(Number + " is even number");
           else System.out.println(Number + " is odd number");
    }
}
public class Exercises2OOP {
    public static void main(String[]args){
        TestNumber t = new TestNumber();
        t.getInformation();
        t.getCheckNumber();
    }
}
