import java.util.Scanner;

class SumOfArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;

        for (int num: array) {
            sum = sum + num;
        }
        System.out.println("The sum or the array si: " + sum);
    }
}

class SumDemo {

    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);

    int[] numArray = new int[10];
    int total = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
        numArray[i] = in.nextInt();
    }
        for(int number : numArray) {
        total = total + number;
    }
        System.out.println("The sum of the new array is: " + total);
    }

}