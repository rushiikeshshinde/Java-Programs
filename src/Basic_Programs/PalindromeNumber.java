package Basic_Programs;
import java.util.Scanner;

public class PalindromeNumber {

    static void palindromeNum(int num){

        int temp = num,rem,sum=0;

        while(num>0){
            rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;

        }
        if(temp == sum){
            System.out.println(temp + " is a Palindrome Number.");
        }
        else {
            System.out.println(temp + " is not a Palindrome Number.");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        palindromeNum(number);

    }

}
