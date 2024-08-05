package Number_Programs;

import java.util.Scanner;

public class TechNumber {

    static void isTechNumber(int num){

        int rem,sum=0,temp;
        temp = num;
        while(num>0){
            rem = num % 100;
            sum += rem;
            num /= 100;
        }
        int square_num = (int) Math.pow(sum,2);
        if(temp == square_num){
            System.out.println("This is a Tech Number");
        }
        else {
            System.out.println("This is not a Tech Number.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        isTechNumber(number);
        sc.close();

    }

}
