package Basic_Programs;
import java.util.Scanner;

public class FactorialOfNumber {

    static int factorialOfNumber(int num){

        int factorial = 1;
        for(int i = num; i>=1; i--){
            factorial *= i;
        }
        return factorial;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(factorialOfNumber(number));
        sc.close();

    }

}
