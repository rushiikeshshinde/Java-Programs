import java.util.Scanner;

public class ArmstrongNumber {

    static String isArmstrong(int num){

        int number = num;
        int rem,sum = 0;

        while(num!=0){
            rem = num%10;
            sum = sum + rem * rem * rem;
            num /= 10;

        }
        if(number == sum){
            return number + " is an Armstrong Number.";
        }
        else {
            return number + " is not an Armstrong Number.";
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isArmstrong(number));


    }

}
