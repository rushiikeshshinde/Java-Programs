package Number_Programs;
import java.util.Scanner;

public class PetersonNumber {

    static int isFactorial(int rem){

        int factorial = 1,i;
        if(rem == 0 || rem == 1){
            return 1;
        }
        else {
            for(i = 1; i <= rem; i++){
                factorial *= i;
            }
        }
        return factorial;

    }

    static String isPetersonNumber(int num){

        int temp,rem,sum=0;
        temp = num;

        while (num>0){
            rem = num % 10;
            sum += isFactorial(rem);
            num /= 10;


        }
        if(temp == sum){
            return temp +" is Peterson Number.";
        }
        else {
            return temp +" is not a Peterson Number.";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPetersonNumber(number));
        sc.close();

    }

}
