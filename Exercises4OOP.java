import java.util.Scanner;

class Month {
    int month;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number from 1 to 12: ");
        month = sc.nextInt();
    }
   
    public void display() {
        switch(month) {
            case 1: System.out.println("\n\tJanuary\n");
                    break;
            case 2: System.out.println("\n\tFebruary\n");
                    break;
            case 3: System.out.println("\n\tMarch\n");
                    break;
            case 4: System.out.println("\n\tApril\n");
                    break;
            case 5: System.out.println("\n\tMay\n");
                    break;
            case 6: System.out.println("\n\tJune\n");
                    break;
            case 7: System.out.println("\n\tJuly\n");
                    break;
            case 8: System.out.println("\n\tAugust\n");
                    break;
            case 9: System.out.println("\n\tSptember\n");
                    break;
            case 10: System.out.println("\n\tOctober\n");
                    break;
            case 11: System.out.println("\n\tNovember\n");
                    break;
            case 12: System.out.println("\n\tDecember\n");
                    break;
            default: System.out.println("\n\tNot the month of the year\n");
        }
    }

}
public class Exercises4OOP {
    public static void main(String[]args){
        Month m = new Month();
        m.getInformation();
        m.display(); 
    }
}
