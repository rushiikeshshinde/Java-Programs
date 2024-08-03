package Basic_Programs;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    static void armstrongNumber(int num){

        int digit,digitCount=0,sum=0,temp;
        temp=num;
        while(temp>0){
            digitCount++;
            temp/=10;
        }
        temp=num;
        while(temp>0){
            digit=temp%10;
            sum+= (int) Math.pow(digit,digitCount);
            temp/=10;
        }
        if(num ==sum){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not aa armstrong");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        armstrongNumber(num);
        sc.close();

    }

}
