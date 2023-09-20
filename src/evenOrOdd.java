import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum;

        System.out.println("Please pick a whole number.");
        userNum = scan.nextInt();

        if (userNum%2 == 0 )
            System.out.println("Your number is even.");
        else
            System.out.println("Your number is odd");


    }
}