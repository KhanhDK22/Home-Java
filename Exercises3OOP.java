import java.util.Scanner;

class Person {
    int age;
    String name;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Who are you: ");
        name = sc.next();
        System.out.print("How old are you: ");
        age = sc.nextInt();
    }

    public void display(){
        if(age < 16 ) System.out.println(name + " is a teenager");
        if(age >= 16 && age < 18) System.out.println(name + " in adulthood");
        if(age >= 18) System.out.println(name + " is old");
    }
}

public class Exercises3OOP {
    public static void main(String[]args){
        Person p = new Person();
        p.getInformation();
        p.display();
    }
}
