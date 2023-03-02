import java.util.Scanner;

class CalculateandCompare {
    int Number1, Number2;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1 is : ");
        Number1 = sc.nextInt();
        System.out.print("Number2 is : ");
        Number2 = sc.nextInt();
    }
    public int getSummation() {
        return Number1 + Number2;
    }
    public int getSubtraction() {
        return Number1 - Number2;
    }
    public int getMultiplication() {
        return Number1 * Number2;
    }
    public float getDivision() {
        return (float)Number1 / (float)Number2;
    }
    public int getDivideByRemainder() {
        return Number1 % Number2;
    }

    public void getCompare() {
        if(Number1 > Number2) System.out.println("Compare: " + Number1 + ">" + Number2 );
        if(Number1 < Number2) System.out.println("Compare: " + Number1 + "<" + Number2 );
        if(Number1 == Number2) System.out.println("Compare: " + Number1 + "=" + Number2 );
    }
    public void display(){
        System.out.println("\tNumber1 + Number2 = " + getSummation());
        System.out.println("\tNumber1 - Number2 = " + getSubtraction());
        System.out.println("\tNumber1 * Number2 = " + getMultiplication());
        System.out.println("\tNumber1 / Number2 = " + getDivision());
        System.out.println("\tNumber1 % Number2 = " + getDivideByRemainder());
    }
}

public class Exercises1OOP {
    public static void main(String[]args) {
        CalculateandCompare c = new CalculateandCompare();
        c.getInformation();
        c.getSummation();
        c.getSubtraction();
        c.getMultiplication();
        c.getDivision();
        c.display();
        c.getCompare();
    }
}
