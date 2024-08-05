package Number_Programs;
import java.util.Scanner;

public class SunnyNumber {

    static boolean isPerfectNumber(double num){

        double square_root = Math.sqrt(num);

        return (square_root - Math.floor(square_root)) == 0;

    }

    static void isSunnyNumber(int num){

        if(isPerfectNumber(num+1)){
            System.out.println("The given number is Sunny Number.");
        }
        else {
            System.out.println("The given number is not Sunny Number.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        isSunnyNumber(number);
        sc.close();

    }

}
