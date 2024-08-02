import java.util.Scanner;

public class EvenOrOddNumber {

    static String evenOrOddNum(int num){

        if(num <= 0){
            return "Please enter a number greater than 0";
        }
        else if(num%2==0){
            return num + " is an even number.";
        }
        else {
            return num + " is an odd number.";
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(evenOrOddNum(number));
        sc.close();

    }

}
