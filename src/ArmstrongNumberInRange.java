import java.util.Scanner;

public class ArmstrongNumberInRange {

    static void armstrongNumInRange(int a, int b){

        for(int i = a; i <= b; i++){

            int number = i;
            int rem,sum = 0;

            while(number!=0){
                rem = number%10;
                sum = sum + rem * rem * rem;
                number /= 10;

            }
            if(i == sum){
                System.out.println(i + " ");
            }

        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        armstrongNumInRange(num1,num2);

    }

}
