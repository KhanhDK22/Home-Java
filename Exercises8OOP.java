import java.util.Scanner;

class AVG {

    static float Average(int arr[]) {
        float avg = 0;
        int Sum = 0;

        for (int x : arr) {
            avg = (float) (Sum += x) / arr.length;
        }
        return avg;
    }
    
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array[" + i + "]" + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\tAverage = " + Average(arr));
    }
}

public class Exercises8OOP {
    public static void main(String[]args) {
        AVG a = new AVG();
        a.display();
        
    }
}