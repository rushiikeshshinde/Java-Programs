package Basic_Programs;
import java.util.Scanner;

public class PrimeNumber {

    static void primeNumber(int num){

        int flag = 0;
        int m = num/2;
        if(num==0 || num==1){
            System.out.print(num +" is not a Prime Number.");
        }
        else {
            for(int i=2;i<=m;i++){
                if(num%i==0){
                    System.out.print(num +" is not a Prime Number.");
                    flag = 1;
                    break;
                }


            }
            if(flag == 0){
                System.out.print(num +" is a Prime Number.");
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        primeNumber(number);
        sc.close();

    }

}
