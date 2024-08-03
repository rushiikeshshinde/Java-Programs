package Number_Programs;
import java.util.Scanner;

public class ReverseNumber {

    static String reverseNumber(int num){
        int reversed_number = 0;

        while (num!=0){
            int rem = num % 10;
            reversed_number = reversed_number * 10 + rem;
            num /= 10;
        }
        return "Reversed Number: "+reversed_number;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(reverseNumber(number));
        sc.close();

    }

}
